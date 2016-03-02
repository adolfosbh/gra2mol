package org.gra2mon.example.companies;

import java.io.File;

import gts.modernization.launcher.Gra2MoLEnricher;
import gts.modernization.launcher.Gra2MoLInterpreterLauncher;
import gts.modernization.launcher.Gra2MoLProcessLauncher;

public class CompaniesTester {
		
	static String basePath = "../Grammar2Model.examples.101companies/";
	static String examplesPath = "./examples/";
	public static void main(String[] args) {
	
		String modelName = args[0];
		Gra2MoLEnricher enricher = new Gra2MoLEnricher(
				"company",
				new File(basePath + "gra2mol/grammars/Company.g"),
				new File(basePath + "gra2mol/gen/Company.g"));
		
		// warmup
		Gra2MoLInterpreterLauncher warmupInterpreter = new Gra2MoLInterpreterLauncher(
				new File(basePath + "gra2mol/src/transformation.g2m"),
				new File(basePath + "gra2mol/metamodels/Company.ecore"),
				"company", 
				new File(examplesPath + "model2.output.xmi"),
				"Company", 
				"company", 
				new File(examplesPath + "model2.101"));
		warmupInterpreter.setCaseSensitive(true);
		Gra2MoLProcessLauncher processLauncher = new Gra2MoLProcessLauncher(enricher, warmupInterpreter);
		processLauncher.setActivePhase1(false); // We only need to interpret the transformation
		
		for (int i = 0; i < 3000; i++) {
			processLauncher.launch();
		}
		
		// Model file execution
		Gra2MoLInterpreterLauncher interpreter = new Gra2MoLInterpreterLauncher(
						new File(basePath + "gra2mol/src/transformation.g2m"),
						new File(basePath + "gra2mol/metamodels/Company.ecore"),
						"company", 
						new File(examplesPath +  modelName + ".output.xmi"),
						"Company", 
						"company", 
						new File(examplesPath +  modelName + ".101"));
		interpreter.setCaseSensitive(true);
		System.out.println("*** Executing model " + modelName + ".101");
		processLauncher = new Gra2MoLProcessLauncher(enricher, interpreter);
		processLauncher.setActivePhase1(false); // We only need to interpret the transformation
		for (int i = 0; i < 10; i++) {
			processLauncher.launch();
		}
	}
	
	
	
}
