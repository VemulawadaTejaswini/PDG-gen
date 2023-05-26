public class func{
public void makeUrl(String filename){
        if (filename.indexOf(":
            url = filename;
        } else {
            url = new File(filename).toURI().toString();
        }
}
}
