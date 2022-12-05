package pdg_gui;

import com.github.javaparser.ParseException;
// import com.jgraph.layout.JGraphFacade;
// import com.jgraph.layout.hierarchical.JGraphHierarchicalLayout;
import graphStructures.GraphNode;
import graphStructures.RelationshipEdge;
// import org.jgraph.JGraph;
import org.jgrapht.DirectedGraph;
// import org.jgrapht.ListenableGraph;
import org.jgrapht.ext.DOTExporter;
// import org.jgrapht.ext.JGraphModelAdapter;
import org.jgrapht.ext.StringEdgeNameProvider;
import org.jgrapht.ext.StringNameProvider;
import org.jgrapht.graph.DefaultDirectedGraph;
// import org.jgrapht.graph.ListenableDirectedGraph;
import pdg.PDGCore;

import java.io.*;
import javax.swing.*;
import java.util.Scanner;

	/** 
	 * PDG CORE INSTANTIATION
	 *
	 * @param inArg the in FileInputStram
	 * @param hrefGraph the href graph
	 * @param previousNode the previous node
	 * @param consoleText the console text
	 * @return true, if successful
	 * @throws ParseException the parse exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 *
	 * public boolean addFile(FileInputStream inArg, @SuppressWarnings("rawtypes") DirectedGraph<GraphNode, RelationshipEdge> hrefGraph, GraphNode previousNode, JTextArea consoleText, String PrevClass, String selectedFileName)
     */

/**
 * The Class WithoutGui - automate GUI elements.
 */
public class WithoutGui {

     /** The Constant serialVersionUID. */
    //  private static final long serialVersionUID = 1L;

     /** The selected file. */
     private File selectedFile;
 
     private String selectedFileName;
     
     /** The href graph. */
     @SuppressWarnings("rawtypes")
     private DirectedGraph<GraphNode, RelationshipEdge> hrefGraph;
     
     /** The ast printer. */
     private PDGCore astPrinter = new PDGCore();

    /** The console text. */
    private JTextArea consoleText;

    private WithoutGui(String filename){
        // Initializing
        createGraph();
        JTextArea txtCodeGoesHere = new JTextArea();
        // JGraph graph = getJGraph();
        consoleText = new JTextArea();
        //SelectFile
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

        //Call Graph
        consoleText.setText("----------------------------------------------------\n");
        runAnalysisAndMakeGraph();

        // ExportToDot 
        FileOutputStream out;
        try {
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

    public static void main(String args[]){
            new PDGCore();
            try {
                new WithoutGui(args[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

        /**
     * Check if folder exists.
     *
     * @return true, if successful
     */
    private boolean checkIfFolderExists() {
        File theDir = new File("dotOutputs");
        return !theDir.exists() && theDir.mkdir();
    }


    /**
     * Creates the graph.
     */
    private void createGraph() {
        hrefGraph = new DefaultDirectedGraph<>(RelationshipEdge.class);
    }

    /**
     * Gets the j graph.
     *
     * @return the j graph
     */
    // private JGraph getJGraph() {
    //     @SuppressWarnings("rawtypes")
	// 	ListenableGraph<GraphNode, RelationshipEdge> g = new ListenableDirectedGraph<>(hrefGraph);

    //     JGraph jgraph = new JGraph(new JGraphModelAdapter<>(g));

    //     // JGraphFacade facade = new JGraphFacade(jgraph);
    //     // facade.setIgnoresUnconnectedCells(false);

    //     return jgraph;
    // }

    // // Update graph.
    // private void updateGraph() {
    //     JGraph graph = getJGraph();
    // }

    //Run analysis and make graph.
    private void runAnalysisAndMakeGraph() {
        try {
            createGraph();
            GraphNode gn = new GraphNode(0, "Entry", "null");
            hrefGraph.addVertex(gn);


            // FileOutputStream out;
            // GraphNode.exporting = true;
            // out = new FileOutputStream("dotOutputs/" + "stage1.dot");
            // @SuppressWarnings("rawtypes")
			// 	DOTExporter<GraphNode, RelationshipEdge> exporter = new DOTExporter<>(
            //             new StringNameProvider<>(), null,
            //             new StringEdgeNameProvider<>());
            // exporter.export(new OutputStreamWriter(out), hrefGraph);
            // out.close();


            if (astPrinter.addFile(new FileInputStream(selectedFile), hrefGraph, gn, consoleText,"null", selectedFileName)){
                System.out.println("astPrinter called");
                // updateGraph();
            }
                

        } catch (ParseException | IOException e1) {
            e1.printStackTrace();
        }
    }
}
