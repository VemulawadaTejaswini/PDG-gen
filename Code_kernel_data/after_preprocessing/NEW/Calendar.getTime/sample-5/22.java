//22
public class func{
public void formatExpires(TreeWriter tree,Calendar expires){
            tree.addText(gmtFrmt.format(expires.getTime()));
            tree.addEndElement();
}
}
