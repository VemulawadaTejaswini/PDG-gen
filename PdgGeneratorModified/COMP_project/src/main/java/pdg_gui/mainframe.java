package pdg_gui;

import com.github.javaparser.ParseException;
import graphStructures.GraphNode;
import graphStructures.RelationshipEdge;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import pdg.PDGCore;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import org.jgrapht.ext.DOTExporter;
import org.jgrapht.ext.StringEdgeNameProvider;
import org.jgrapht.ext.StringNameProvider;

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
    static String outputFolder = "./../../Processed Dataset/new/PreparedStatement.executeQuery/";
    static String inputFolder = "./../../Code_kernel_data/PreparedStatement.executeQuery/";
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
        System.out.println("Number Of Files: " + listOfFiles.size());
        return listOfFiles;
    }

    // constructor
    private mainframe() {
        createGraph();
    }

    private void methods(String filename) {
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
        runAnalysisAndMakeGraph();

        // ExportToDot
        FileOutputStream out;
        try {
            checkIfFolderExists();
            GraphNode.exporting = true;
            String fn = selectedFileName.substring(0, selectedFileName.length() - 5) + "_" + randomNumber + ".dot";

            out = new FileOutputStream(outputFolder + fn);
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

    private boolean checkIfFolderExists() {
        File theDir = new File(outputFolder);
        return !theDir.exists() && theDir.mkdir();
    }

    private void createGraph() {
        hrefGraph = new DefaultDirectedGraph<>(RelationshipEdge.class);
    }

    private void runAnalysisAndMakeGraph() {
        try {
            createGraph();
            GraphNode gn = new GraphNode(0, "Entry", "null");
            hrefGraph.addVertex(gn);

            if (astPrinter.addFile(new FileInputStream(selectedFile), hrefGraph, gn, consoleText, "null",
                    selectedFileName, outputFolder, randomNumber)) {
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
            ArrayList<String> files = getListOfFiles(inputFolder);
            //String files[] = {"D:/IIT Hyderabad/Research/API misuse prediction/PDG-Gen/Repository/test-examples/example 4/openconnection - example1.java"};
            for (String file : files) {
                obj.methods(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}