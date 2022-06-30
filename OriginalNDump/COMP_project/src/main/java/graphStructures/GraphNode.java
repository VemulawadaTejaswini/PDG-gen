package graphStructures;

import java.util.Objects;


public class GraphNode {
    private String info;
    private int id;
    public static boolean exporting = false;
    private String nodeClass;

    public GraphNode(int id, String string,String nodeClass) {
        this.info = string;
        this.id = id;
        this.nodeClass = nodeClass;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String getData(){
        String ID = Integer.toString(this.id);
        String outS = "Line_" + ID;
        outS += " $$ ";
        outS += this.info;
        return outS; 
    }

    @Override
    public String toString() {
        if(!exporting)
            return ("[" + this.id + "] " + this.info);
        return "Line_" + this.id;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!GraphNode.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final GraphNode other = (GraphNode) obj;
        return !(!Objects.equals(this.info, other.info) || other.info == null);
    }

    public String getNodeClass() {
        return this.nodeClass;
    }

    public String getNodeInfo(){
        return this.info;
    }

    public void ReAssign(String info){
        this.info = info;
    }
}
