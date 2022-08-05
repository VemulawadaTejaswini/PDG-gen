package pdg_gui;

import com.github.javaparser.ParseException;
import graphStructures.GraphNode;
import graphStructures.RelationshipEdge;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import pdg.PDGCore;
import java.io.*;
import java.util.Scanner;
import org.jgrapht.ext.DOTExporter;
import org.jgrapht.ext.StringEdgeNameProvider;
import org.jgrapht.ext.StringNameProvider;

import javax.swing.*;

import graphStructures.TextArea;

public class mainframe {
    private File selectedFile;//from java.io
    private String selectedFileName;
    @SuppressWarnings("rawtypes")
    private DirectedGraph<GraphNode, RelationshipEdge> hrefGraph;
    private PDGCore astPrinter = new PDGCore();
    private JTextArea consoleText;
    static String files[] = {"./examples/example2.java","./examples/example1.java"};

    // constructor
    private mainframe(){
        createGraph();
    }

    private void methods(String filename){
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
        runAnalysisAndMakeGraph();

        // ExportToDot 
        FileOutputStream out;
        try 
        {
            checkIfFolderExists();
            GraphNode.exporting = true;
            String fn = selectedFileName.substring(0, selectedFileName.length()-5) +  ".dot";

            out = new FileOutputStream("./dotOutputs/" + fn);
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
        File theDir = new File("dotOutputs");
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

            if (astPrinter.addFile(new FileInputStream(selectedFile), hrefGraph, gn, consoleText,"null", selectedFileName)){
                System.out.println("astPrinter called");
            }

        } catch (ParseException | IOException e1) {
            e1.printStackTrace();
        }
    }
    public static void main(String args[]){
        new PDGCore();
        try {
           mainframe obj = new mainframe();
           for(String file : files){
             obj.methods(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
