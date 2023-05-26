public class func{
public void getWordsFromFile(String filename,Set<String> resultSet,boolean lowercase){
    if(filename==null) {
      return ;
    }
    BufferedReader reader = IOUtils.readerFromString(filename);
    while(reader.ready()) {
      if(lowercase) resultSet.add(reader.readLine().toLowerCase());
      else resultSet.add(reader.readLine());
    }
    IOUtils.closeIgnoringExceptions(reader);
}
}
