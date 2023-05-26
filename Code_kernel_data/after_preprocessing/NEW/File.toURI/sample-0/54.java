//54
public class func{
public void main(String[] args){
        File file = new File(System.getProperty("test.src", "."), "ding.dls");
        URL url = file.toURI().toURL();
}
}
