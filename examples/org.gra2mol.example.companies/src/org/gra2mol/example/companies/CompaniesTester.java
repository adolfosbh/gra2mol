package org.gra2mol.example.companies;

import java.io.File;

import gts.modernization.launcher.Gra2MoLEnricher;
import gts.modernization.launcher.Gra2MoLInterpreterLauncher;
import gts.modernization.launcher.Gra2MoLProcessLauncher;

public class CompaniesTester {
	
	static enum Usage {
		TOPOLOGY_EXPERIMENT,
		SCALABILITY_EXPERIMENT,
		INCORRECT
	}
	
	static String BASE_PATH = "../Grammar2Model.examples.101companies/";
	static String MODELS_PATH = "./examples/";
	
	private static int NUM_OF_MODELS = 7;
	
	public static void main(String[] args) throws Exception {
	
		Usage usage = checkArgs(args);
		
		if (usage == Usage.INCORRECT)  {
			return;
		} else {
			if (Usage.SCALABILITY_EXPERIMENT == usage) {
				NUM_OF_MODELS = 25;
				MODELS_PATH = "./examples/scalability";
			} else {
				NUM_OF_MODELS = 7;
				MODELS_PATH = "./examples/topology";
			}
		}
				
		// warmup
		System.out.println("* Running Warmup *");
		for (int i = 0; i < 3000; i++) {
			Gra2MoLProcessLauncher processLauncher = new Gra2MoLProcessLauncher(createEnricher(), createInterpreter("model2"));
			processLauncher.setActivePhase1(false); // We only need to interpret the transformation
			processLauncher.launch();
		}
		
		printMemory();
		
		// Model file execution
		System.out.println("* Running Final Measurement *");
		for (int i=1; i <= NUM_OF_MODELS ; i++) {
			System.gc();
			Thread.sleep(1000);
			String modelName = "model"+i;
			//System.out.println("*** Executing model " + modelName + ".101");
			Gra2MoLProcessLauncher processLauncher = new Gra2MoLProcessLauncher(createEnricher(), createInterpreter(modelName));
			processLauncher.setActivePhase1(false); // We only need to interpret the transformation
			processLauncher.launch();
		}
	}
	
	private static Usage checkArgs(String[] args) {
		
		if (args == null || args.length != 1) {
			System.out.println("Incorrect arguments. Please specify -topology for topology analysis related experiment, otherwise -scalability for the scalability related experiment");
			return Usage.INCORRECT;
		}
		
		return "-topology".equals(args[0]) ? Usage.TOPOLOGY_EXPERIMENT
				: "-scalability".equals(args[0]) ? Usage.SCALABILITY_EXPERIMENT
				: Usage.INCORRECT;
	}
	
	private static Gra2MoLEnricher createEnricher() {
		
		return new Gra2MoLEnricher(
				"company",
				new File(BASE_PATH + "gra2mol/grammars/Company.g"),
				new File(BASE_PATH + "gra2mol/gen/Company.g"));
	}
	
	private static  Gra2MoLInterpreterLauncher createInterpreter(String modelName) {
		
		Gra2MoLInterpreterLauncher interpreter = new Gra2MoLInterpreterLauncher(
				new File(BASE_PATH + "gra2mol/src/transformation.g2m"),
				new File(BASE_PATH + "gra2mol/metamodels/Company.ecore"),
				"company", 
				new File(MODELS_PATH +  modelName + ".output.xmi"),
				"Company", 
				"company", 
				new File(MODELS_PATH +  modelName + ".101"));
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
