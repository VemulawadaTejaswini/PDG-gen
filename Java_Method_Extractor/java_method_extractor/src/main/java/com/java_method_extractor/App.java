package com.java_method_extractor;

/**
 * Clean Install: mvn clean install
 * Run Command: mvn exec:java -Dexec.mainClass=com.java_method_extractor.App
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.resolution.UnsolvedSymbolException;
import com.github.javaparser.symbolsolver.JavaSymbolSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver;

public class App {
    static int count_method_in_folders = 0;
    static int count_generated_folders = 0;
    static boolean COPY_METHOD_ONLY_ONCE = true; 

    public static void main(String[] args) {

        // Set the directory path
        String directoryPath = "/home/tomy495/CS21MTECH12001/Research/API-misuse/Code2Seq-Data/java-large/train-test-valid-combined";
        // Set the output file path
        String outputFilePath = "/home/tomy495/CS21MTECH12001/Research/API-misuse/Code2Seq-Data/java-large/processed-data/";

        // Find he projects that are already processed
        HashSet<String> processed_projects = new HashSet<>(); 
        try {
			Scanner scanner = new Scanner(new File("/home/tomy495/CS21MTECH12001/Research/API-misuse/PDG-gen/Java_Method_Extractor/java_method_extractor/processed-folders.log"));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
                if(line.startsWith("INFO:")){
                    line = line.substring(6);
                    processed_projects.add(line);
                }
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

        // setup main logger
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh1;
        try {
            // This block configure the logger with handler and formatter
            fh1 = new FileHandler("/home/tomy495/CS21MTECH12001/Research/API-misuse/PDG-gen/Java_Method_Extractor/java_method_extractor/logger-large.log");
            logger.addHandler(fh1);
            SimpleFormatter formatter = new SimpleFormatter();
            fh1.setFormatter(formatter);
            logger.setUseParentHandlers(false);
            logger.info("Logger initialized!");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // setup the logger for projects processing data
        Logger processed_project_file = Logger.getLogger("ProcessedProjectLog");
        FileHandler fh2;
        try {
            // This block configure the logger with handler and formatter
            fh2 = new FileHandler("/home/tomy495/CS21MTECH12001/Research/API-misuse/PDG-gen/Java_Method_Extractor/java_method_extractor/processed-folders.log");
            processed_project_file.addHandler(fh2);
            SimpleFormatter formatter = new SimpleFormatter();
            fh2.setFormatter(formatter);
            processed_project_file.setUseParentHandlers(false);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Add already processed projects to the logs
        for (String ele : processed_projects) { 
            processed_project_file.info(ele + "\n");
        } 

        try {
            Set<String> set = new HashSet<String>();
            Set<String> function_set = new HashSet<String>();

            // Create a new ParserConfiguration instance and set a symbol resolver
            ParserConfiguration parserConfiguration = new ParserConfiguration();
            parserConfiguration.setSymbolResolver(new JavaSymbolSolver(new ReflectionTypeSolver()));

            // Create a new JavaParser instance with the ParserConfiguration
            JavaParser javaParser = new JavaParser(parserConfiguration);

            // Get all files in the directory
            File directory = new File(directoryPath);
            try {
                int project_level = 1;
                listFilesRecursive(directory, javaParser, set, function_set, outputFilePath, logger, processed_project_file , project_level, processed_projects);
                //
            } catch (Exception e) {
                logger.info("10");

            }

            System.out.println("count of distincts functions in folders: " + count_method_in_folders + "\n");
            System.out.println("count all folders created: " + count_generated_folders + "\n");

        } catch (Exception e) {
            // Handle the exception
            logger.info("Error writing to output file.");
        }

        // logger.info(count_folder);

    }

    private static void processJavaFile(File javaFile, JavaParser javaParser, Set<String> set, Set<String> function_set,
            String outputFilePath, Logger logger) throws IOException {
        // Parse the Java file
        CompilationUnit cu = javaParser.parse(javaFile).getResult().orElse(null);
        if (cu == null) {
            return;
        }

        // Get all method declarations in the file
        List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class);

        // Loop through all method declarations
        for (MethodDeclaration method : methods) {
            // Get all method calls in the method
            try {
                List<MethodCallExpr> methodCalls = method.findAll(MethodCallExpr.class);

                // Loop through all method calls
                for (MethodCallExpr methodCall : methodCalls) {
                    // Get the fully qualified name of the method call
                    try {
                        String fullyQualifiedName = methodCall.resolve().getQualifiedName();
                        // Write the fully qualified name to the output file
                        if (fullyQualifiedName.startsWith("java")) {
                            set.add(fullyQualifiedName);
                            File methodFolder = new File(outputFilePath + fullyQualifiedName);
                            if (!methodFolder.exists()) {
                                methodFolder.mkdir();
                                count_generated_folders += 1;
                                logger.info("Folder generated: " + count_generated_folders);
                            }
                            // logger.info(fullyQualifiedName);
                            String newDataPointFile = outputFilePath + fullyQualifiedName + "/" + method.getName()
                                    + ".java";
                            // logger.info(newDataPointFile);
                            if (function_set.contains(method.toString()) == false) {
                                function_set.add(method.toString());
                            }
                            writeFile(newDataPointFile, method.toString());
                            count_method_in_folders += 1;
                            logger.info("Java files generated: " + count_method_in_folders);
                            if(COPY_METHOD_ONLY_ONCE) {
                                break;
                            }
                        }
                    } catch (UnsolvedSymbolException e) {
                        // logger.info("1");

                    } catch (UnsupportedOperationException e) {
                        // logger.info("2");
                    } catch (java.lang.RuntimeException e) {
                        // logger.info("3");
                    } catch (Exception e) {
                        // logger.info("4");

                    }
                }
            } catch (Exception e) {
                // logger.info("5");
            }
        }
    }

    private static void listFilesRecursive(File directory, JavaParser javaParser, Set<String> set,
            Set<String> function_set, String outputFilePath, Logger logger, Logger processed_project_file , 
            int project_level, HashSet<String> processed_projects) throws IOException {
        try {
            for (File file : directory.listFiles()) {
                try {
                    if (file.isDirectory()) {
                        if(project_level == 1 && processed_projects.contains(file.getName())){
                            logger.info("Already Project Processed: " + file.getName());
                            continue;
                        }
                        try {
                            listFilesRecursive(file, javaParser, set, function_set, outputFilePath, logger, processed_project_file, project_level + 1, processed_projects);
                        } catch (Exception e) {
                            logger.info("helo" + file);
                        }
                        if(project_level == 1){
                            logger.info("Project Processed: " + file.getName());
                            processed_projects.add(file.getName());
                            processed_project_file.info(file.getName() + "\n");
                        }
                    } else if (file.getName().endsWith(".java")) {
                        try {
                            logger.info("Processing: " + file.getAbsolutePath());
                            processJavaFile(file, javaParser, set, function_set, outputFilePath, logger);
                        } catch (Exception e) {
                            logger.info("hell" + file);
                        }
                    }
                } catch (Exception e) {
                    // logger.info("7");

                }
            }
        } catch (Exception e) {
            logger.info("8");

        }
    }

    private static void writeFile(String filename, String contents) {
        try (java.io.FileWriter writer = new java.io.FileWriter(filename)) {
            writer.write(contents);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
