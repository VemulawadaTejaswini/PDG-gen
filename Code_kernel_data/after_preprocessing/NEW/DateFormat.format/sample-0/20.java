//20
public class func{
public void writeHeader(XMLWriter writer){
    XmlWriterUtil.writeComment(writer, "Generated on " + dateFormat.format(new Date(System.currentTimeMillis())));
    XmlWriterUtil.writeComment(writer, " ");
    XmlWriterUtil.writeCommentLineBreak(writer);
    XmlWriterUtil.writeLineBreak(writer);
}
}
