package org.gra2mol.example.plsql;

import java.io.File;

import gts.modernization.launcher.Gra2MoLEnricher;
import gts.modernization.launcher.Gra2MoLInterpreterLauncher;
import gts.modernization.launcher.Gra2MoLProcessLauncher;

public class PLSQLTester {
	
	
	static String BASE_PATH = "../Grammar2Model.examples.PLSQL2ASTMModel/";
	static String MODELS_PATH = "./examples/";
	static String[] MODEL_NAMES = new String[]{"NEW_NOTGESTI_CONVO"};
	
	public static void main(String[] args) throws Exception {
	
//		Usage usage = checkArgs(args);
//		
//		if (usage == Usage.INCORRECT)  {
//			return;
//		}
				
		// warmup
//		System.out.println("* Running Warmup *");
//		for (int i = 0; i < 3000; i++) {
//			Gra2MoLProcessLauncher processLauncher = new Gra2MoLProcessLauncher(createEnricher(), createInterpreter("untClArchivo"));
//			processLauncher.setActivePhase1(false); // We only need to interpret the transformation
//			processLauncher.launch();
//		}
		
		printMemory();
//		
//		// Model file execution
//		System.out.println("* Running Final Measurement *");
		for (String modelName : MODEL_NAMES) {
			System.gc();
			Thread.sleep(1000);
			//System.out.println("*** Executing model " + modelName + ".101");
			Gra2MoLProcessLauncher processLauncher = new Gra2MoLProcessLauncher(createEnricher(), createInterpreter(modelName));
			processLauncher.setActivePhase1(false); // We only need to interpret the transformation
			processLauncher.launch();
		}
		
	}
	
//	private static Usage checkArgs(String[] args) {
//		
//		Usage usage = Usage.INCORRECT;
//		if (args != null && args.length == 1) {
//			usage = "-topology".equals(args[0]) ? Usage.TOPOLOGY_EXPERIMENT
//					: "-scalability".equals(args[0]) ? Usage.SCALABILITY_EXPERIMENT
//					: Usage.INCORRECT;
//		} 
//		if (usage == Usage.INCORRECT) {
//			System.out.println("Incorrect arguments. Please specify -topology for topology analysis related experiment, otherwise -scalability for the scalability analysis related experiment");
//		}
//		return usage;
//	}
	
	private static Gra2MoLEnricher createEnricher() {
		
		return new Gra2MoLEnricher(
				"delphi",
				new File(BASE_PATH + "files/src/Java.g"),
				new File(BASE_PATH + "files/gen/Java.g"));
	}
	
	private static  Gra2MoLInterpreterLauncher createInterpreter(String modelName) {
		
		Gra2MoLInterpreterLauncher interpreter = new Gra2MoLInterpreterLauncher(
				new File(BASE_PATH + "ASTMextraction/src/extractASTMFromDDL.g2m"),
				new File(BASE_PATH + "metamodels/astm.ecore"),
				"astm", 
				new File(MODELS_PATH +  modelName + ".output.xmi"),
				"DDL", 
				"data_definition", 
				new File(MODELS_PATH +  modelName + ".sql"));
		interpreter.setCaseSensitive(true);
		return interpreter;
	}
	
	
	private static void printMemory() {
				
		Runtime runtime = Runtime.getRuntime();
		int mb = 1024*1024;
		
        System.out.println("Max Memory (Mb):" + runtime.maxMemory() / mb);
        
        System.out.println("Total Memory (Mb):" + runtime.totalMemory() / mb);
        
        System.out.println("Used Memory (Mb):"
            + (runtime.totalMemory() - runtime.freeMemory()) / mb);
 
        System.out.println("Free Memory (Mb):"
            + runtime.freeMemory() / mb);
	}
}
