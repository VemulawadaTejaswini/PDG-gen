package graphStructures;

import java.util.Objects;


public class ReturnObject {
    
    private String error;
    
    private GraphNode gn;

    public ReturnObject(String er) {
        this.error = er;
        this.gn = null;
    }

    public ReturnObject(GraphNode g) {
        this.error = null;
        this.gn = g;
    }

    public boolean hasError() {
        return (error != null) && (!Objects.equals(error, "clear"));
    }

    public String getError() {
        return error;
    }

    public GraphNode getGraphNode() {
        return gn;
    }
}
