//193
public class func{
public void loadFile(SAXParser parser,String fileName){
            String a = new File(fileName).toURI().toString().replace("file:/", "file:///");
            Main.info(a);
            parser.parse(a, this);
}
}
