public class func{
public void insertFace(SimpleAttributeSet set,String face){
            StyleConstants.setIcon(set, sizeIcon(new File(face).toURI().toURL()));
}
}
