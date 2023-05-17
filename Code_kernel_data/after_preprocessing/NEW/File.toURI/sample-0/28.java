//28
public class func{
public void load(String filename){
        if (filename != null) {
            setTopologyLocation(new File(filename).toURI());
        } else {
            load(getTopologyLocation());
        }
}
}
