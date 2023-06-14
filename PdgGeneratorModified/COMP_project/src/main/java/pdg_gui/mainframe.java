package pdg_gui;

import com.github.javaparser.ParseException;
import graphStructures.GraphNode;
import graphStructures.RelationshipEdge;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import pdg.PDGCore;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import org.jgrapht.ext.DOTExporter;
import org.jgrapht.ext.StringEdgeNameProvider;
import org.jgrapht.ext.StringNameProvider;

import javax.sql.rowset.spi.SyncProvider;
import javax.swing.*;

import graphStructures.TextArea;

import java.util.Random;

public class mainframe {
    private File selectedFile;// from java.io
    private String selectedFileName;
    @SuppressWarnings("rawtypes")
    private DirectedGraph<GraphNode, RelationshipEdge> hrefGraph;
    private PDGCore astPrinter = new PDGCore();
    private JTextArea consoleText;
    static String outputFolder = "./../../CodeKernel_Manual_Data/Processed_data/before_pruning/";
    static String inputFolder = "./../../CodeKernel_Manual_Data/Processed_data/after_preprocessing/";
    static int randomNumber = -1;
    static Random rand = new Random();

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
        // TextArea txtCodeGoesHere = new TextArea();
        // consoleText = new TextArea();

        JTextArea txtCodeGoesHere = new JTextArea();
        consoleText = new JTextArea();

        selectedFile = new File(filename);
        selectedFileName = selectedFile.getName();

        System.out.println("***************");
        System.out.println(selectedFileName);
        System.out.println("***************");

        try {
            @SuppressWarnings("resource")
            String content = new Scanner(selectedFile).useDelimiter("\\Z").next();
            txtCodeGoesHere.setText(content);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

        consoleText.setText("----------------------------------------------------\n");
        randomNumber = rand.nextInt(1000);
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

            if (astPrinter.addFile(new FileInputStream(selectedFile), hrefGraph, gn, consoleText, "null",
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
            boolean isOnlyFile = true;
            if (isOnlyFile) {
                outputFolder = "D:/IIT Hyderabad/Research/API misuse prediction/PDG-Gen/Repository/PdgGeneratorModified/test_folder/";
                String file = "D:\\IIT Hyderabad\\Research\\API misuse prediction\\PDG-Gen\\Repository\\CodeKernel_Manual_Data\\Processed_data\\after_preprocessing\\FilenameUtils.normalize\\sample-0\\68_0.java"; 
                String apiName = "FilenameUtils.normalize";
                String sampleName = "sample-0";
                obj.methods(file, apiName, sampleName);
            } else {
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
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}