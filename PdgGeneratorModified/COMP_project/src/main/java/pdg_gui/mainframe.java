package pdg_gui;

import com.github.javaparser.ParseException;
import graphStructures.GraphNode;
import graphStructures.RelationshipEdge;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import pdg.PDGCore;
import java.io.*;
import java.util.ArrayList;
import org.jgrapht.ext.DOTExporter;
import org.jgrapht.ext.StringEdgeNameProvider;
import org.jgrapht.ext.StringNameProvider;

/*  STEPS TO RUN

cd COMP_project/
mvn clean install
mvn exec:java -Dexec.mainClass=pdg_gui.mainframe 
Github Account: Tamal-Mondal / tomy_495
PAT: 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*/

public class mainframe {
    private File selectedFile;
    private String selectedFileName;
    @SuppressWarnings("rawtypes")
    private DirectedGraph<GraphNode, RelationshipEdge> hrefGraph;
    private PDGCore astPrinter = new PDGCore();
    // static String outputFolder = "./../../Code_kernel_data/before_pruning/NEW/";
    // static String inputFolder = "./../../Code_kernel_data/after_preprocessing/FINAL/test/";
    // static String outputFolder = "/home/tomy495/CS21MTECH12001/Research/API-misuse/Code2Seq-Data/java-small/pdg-data/";
    // static String inputFolder = "/home/tomy495/CS21MTECH12001/Research/API-misuse/Code2Seq-Data/java-small/processed-data/";
    // static String outputFolder = "/home/tomy495/CS21MTECH12001/Research/API-misuse/PDG-gen/Benchmarks/CryptoAPI-Bench/pdg-data/";
    // static String inputFolder = "/home/tomy495/CS21MTECH12001/Research/API-misuse/PDG-gen/Benchmarks/CryptoAPI-Bench/Processed-data-for-pdg/";
    // static String outputFolder = "/home/tomy495/CS21MTECH12001/Research/API-misuse/PDG-gen/Benchmarks/CodeNet/pdg_data_java250_100_class/";
    // static String inputFolder = "/home/tomy495/CS21MTECH12001/Research/API-misuse/PDG-gen/Benchmarks/CodeNet/processed_data_for_pdg_java250_100_class/";
    // static String outputFolder = "/home/tomy495/CS21MTECH12001/Research/API-misuse/PDG-gen/Perturbed_Code/pdg_data/";
    // static String inputFolder = "/home/tomy495/CS21MTECH12001/Research/API-misuse/PDG-gen/Perturbed_Code/source_code/";
    // static String outputFolder = "D:\\IIT Hyderabad\\Research\\API misuse prediction\\Repository\\Benchmarks\\Code-Kernel-Relabelled\\before_pruning\\";
    // static String inputFolder = "D:\\IIT Hyderabad\\Research\\API misuse prediction\\Repository\\Benchmarks\\Code-Kernel-Relabelled\\after_preprocessing\\";
    static String outputFolder = "D:\\IIT Hyderabad\\Research\\API misuse prediction\\Repository\\Benchmarks\\Big-Clone-Bench\\pdg_data\\";
    static String inputFolder = "D:\\IIT Hyderabad\\Research\\API misuse prediction\\Repository\\Benchmarks\\Big-Clone-Bench\\java_files\\";

    // Get all .java files
    static private ArrayList<String> getListOfFiles(String dirPath) {
        ArrayList<String> listOfFiles = new ArrayList<String>();
        File directory = new File(dirPath);
        File foldersList[] = directory.listFiles();
        for (File folder : foldersList) {
            if (folder.isDirectory()) {
                File filesList[] = folder.listFiles();
                for (File file : filesList) {
                    if (file.getAbsolutePath().endsWith(".java")) {
                        listOfFiles.add(file.getAbsolutePath());
                    }
                }
            }
        }
        System.out.println("\n\nNumber Of Files: " + listOfFiles.size());
        return listOfFiles;
    }

    // Get all folders inside a folder
    static private ArrayList<String> getListOfFolders(String dirPath) {
        ArrayList<String> listOfFolders = new ArrayList<String>();
        File directory = new File(dirPath);
        for (File folder : directory.listFiles()) {
            if (!folder.getAbsolutePath().endsWith("DS_Store")) {
                listOfFolders.add(folder.getAbsolutePath());
            }
        }
        System.out.println("\n\nNumber Of folders: " + listOfFolders.size());
        return listOfFolders;
    }

    // constructor
    private mainframe() {
        createGraph();
    }

    private void methods(String filename, String apiName, String sampleName) {

        selectedFile = new File(filename);
        selectedFileName = selectedFile.getName();

        System.out.println("***************");
        System.out.println(selectedFileName);
        System.out.println("***************");

        runAnalysisAndMakeGraph(apiName, sampleName);

        // ExportToDot
        FileOutputStream out;
        try {
            checkIfFolderExists(outputFolder + apiName + "/");
            GraphNode.exporting = true;
            String fn = selectedFileName.substring(0, selectedFileName.length() - 5) + "_" + sampleName + "_" + apiName
                    + ".dot";

            out = new FileOutputStream(outputFolder + apiName + "/" + fn);
            @SuppressWarnings("rawtypes")
            DOTExporter<GraphNode, RelationshipEdge> exporter = new DOTExporter<>(
                    new StringNameProvider<>(), null,
                    new StringEdgeNameProvider<>());
            exporter.export(new OutputStreamWriter(out), hrefGraph);
            out.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        GraphNode.exporting = false;
    }

    private boolean checkIfFolderExists(String folderLocation) {
        File theDir = new File(folderLocation);
        return !theDir.exists() && theDir.mkdir();
    }

    private void createGraph() {
        hrefGraph = new DefaultDirectedGraph<>(RelationshipEdge.class);
    }

    private void runAnalysisAndMakeGraph(String apiName, String sampleName) {
        try {
            createGraph();
            GraphNode gn = new GraphNode(0, "Entry", "null");
            hrefGraph.addVertex(gn);

            if (astPrinter.addFile(new FileInputStream(selectedFile), hrefGraph, gn, "null",
                    selectedFileName, outputFolder + apiName + "/", sampleName + "_" + apiName)) {
                System.out.println("astPrinter called");
            }

        } catch (ParseException | com.github.javaparser.TokenMgrError | IOException e1) {
            e1.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new PDGCore();
        try {
            mainframe obj = new mainframe();
            boolean isOnlyFile = false;
            String generateFor = "big-code-bench"; // "code2seq" or "ck" or "crypto-api" or "codenet" or "perturbed-code" or "big-code-bench"
            if (isOnlyFile) {
                outputFolder = "D:\\IIT Hyderabad\\Research\\API misuse prediction\\Repository\\PdgGeneratorModified\\test_folder\\";
                String file = "D:\\IIT Hyderabad\\Research\\API misuse prediction\\Repository\\Code_kernel_data\\after_relabeling\\ExecutorService.submit\\sample-0\\0.java"; 
                String apiName = "ExecutorService.submit";
                String sampleName = "sample-0";
                obj.methods(file, apiName, sampleName);
            } else if(generateFor.equals("ck")){
                ArrayList<String> folders = getListOfFolders(inputFolder);
                // System.out.println("\n\nAPI Folders: " + folders);
                for (String folder : folders) {
                    int lastIndex = folder.lastIndexOf("\\");
                    String apiName = folder.substring(lastIndex + 1);
                    // System.out.println("\n\nFolder Name: " + folder);
                    System.out.println("\n\nAPI Name: " + apiName);
                    ArrayList<String> files = getListOfFiles(folder);
                    for (String file : files) {
                        // System.out.println("\n\nFile Name: " + file);
                        int lastIndexInFile1 = file.lastIndexOf("\\");
                        int lastIndexInFile2 = file.lastIndexOf("\\", lastIndexInFile1 - 1);
                        String sampleName = file.substring(lastIndexInFile2 + 1, lastIndexInFile1);
                        // System.out.println("\n\nsampleName: " + sampleName);
                        obj.methods(file, apiName, sampleName);
                    }
                }
            } else if(generateFor.equals("code2seq") || generateFor.equals("codenet") || generateFor.equals("perturbed-code")){
                ArrayList<String> folders = getListOfFolders(inputFolder);
                // System.out.println("\n\nAPI Folders: " + folders);
                for (String folder : folders) {
                    int lastIndex = folder.lastIndexOf("/");
                    String apiName = folder.substring(lastIndex + 1);
                    // System.out.println("\n\nFolder Name: " + folder);
                    System.out.println("\n\nAPI Name (processing for): " + apiName);

                    // Get the files for the API
                    ArrayList<String> listOfFiles = new ArrayList<String>();
                    File directory = new File(folder);
                    File filesList[] = directory.listFiles();
                    for (File file : filesList) {
                        if (file.getAbsolutePath().endsWith(".java")) {
                            listOfFiles.add(file.getAbsolutePath());
                        }
                    }

                    for (String file : listOfFiles) {
                        System.out.println("\n\nFile Name: " + file);
                        obj.methods(file, apiName, "NA");
                    }
                }
            } else if(generateFor.equals("crypto-api") || generateFor.equals("big-code-bench")){
                ArrayList<String> listOfFiles = new ArrayList<String>();
                File directory = new File(inputFolder);
                File filesList[] = directory.listFiles();
                for (File file : filesList) {
                    if (file.getAbsolutePath().endsWith(".java") && !file.getAbsolutePath().contains("Http")) {
                        listOfFiles.add(file.getAbsolutePath());
                    }
                }

                for (String file : listOfFiles) {
                    System.out.println("\n\nFile Name: " + file);
                    obj.methods(file, "NA", "NA");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}