public class func{
public void downloadFace(File f,String directory,String name,String regex,FACE_TYPE type){
            return downloadFace(f.toURI().toURL().toString(), directory, name, regex, type);
}
}
