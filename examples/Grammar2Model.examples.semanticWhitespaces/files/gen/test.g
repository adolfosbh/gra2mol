grammar test; 

// Autogenerated options
options {
	output=template;
}




// Autogenerated import
@header {
	import gts.modernization.model.CST.impl.*;
	import gts.modernization.model.CST.*;
	import java.util.Iterator;
}

// Rules
mainRule returns [Node returnNode] 
: 
	TK_0='HOLA' TK_1=' ' TK_2=' ' IDGen=ID TK_3=';' 
	{
		// Create return CST Node
		Node mainRuleReturnNode = CSTFactoryImpl.eINSTANCE.createNode();
		mainRuleReturnNode.setKind("mainRule");
	    // Create a Token CST Leaf	
	    if($TK_0 != null) {
			Leaf TK_0Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
	 		TK_0Leaf.setKind("TOKEN");
	 		TK_0Leaf.setValue($TK_0.text);
			TK_0Leaf.setPos(TK_0.getCharPositionInLine());
			TK_0Leaf.setLine(TK_0.getLine());
	 		mainRuleReturnNode.getChildren().add(TK_0Leaf);
	 	}
	    // Create a Token CST Leaf	
	    if($TK_1 != null) {
			Leaf TK_1Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
	 		TK_1Leaf.setKind("TOKEN");
	 		TK_1Leaf.setValue($TK_1.text);
			TK_1Leaf.setPos(TK_1.getCharPositionInLine());
			TK_1Leaf.setLine(TK_1.getLine());
	 		mainRuleReturnNode.getChildren().add(TK_1Leaf);
	 	}
	    // Create a Token CST Leaf	
	    if($TK_2 != null) {
			Leaf TK_2Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
	 		TK_2Leaf.setKind("TOKEN");
	 		TK_2Leaf.setValue($TK_2.text);
			TK_2Leaf.setPos(TK_2.getCharPositionInLine());
			TK_2Leaf.setLine(TK_2.getLine());
	 		mainRuleReturnNode.getChildren().add(TK_2Leaf);
	 	}
	    // Create a CST Leaf
		if($IDGen != null) {
			Leaf IDGenLeaf = CSTFactoryImpl.eINSTANCE.createLeaf();
			IDGenLeaf.setKind("ID");
			IDGenLeaf.setValue($IDGen.text);
			IDGenLeaf.setPos(IDGen.getCharPositionInLine());
			IDGenLeaf.setLine(IDGen.getLine());
			mainRuleReturnNode.getChildren().add(IDGenLeaf);
		}
	    // Create a Token CST Leaf	
	    if($TK_3 != null) {
			Leaf TK_3Leaf = CSTFactoryImpl.eINSTANCE.createLeaf();
	 		TK_3Leaf.setKind("TOKEN");
	 		TK_3Leaf.setValue($TK_3.text);
			TK_3Leaf.setPos(TK_3.getCharPositionInLine());
			TK_3Leaf.setLine(TK_3.getLine());
	 		mainRuleReturnNode.getChildren().add(TK_3Leaf);
	 	}
		// Returns the Node with CST Leaves/Nodes
		$mainRule.returnNode = mainRuleReturnNode;
	}
	;
	
ID: ('a'..'z') ('a'..'z')*;