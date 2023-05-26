public class func{
public void getDocumentContents(Document document){
    while((line = buffered_reader.readLine()) != null) 
      line_buffer.append(line).append('\n');
    buffered_reader.close();  
}
}
