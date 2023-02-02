//75
public class func{
public void dumpFile(String fileName){
    while((line = reader.readLine()) != null) {
      LOG.debug(line);
    }
    reader.close();
}
}
