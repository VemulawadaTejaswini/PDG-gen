public class func{
public void readDictionary(String filename){
    while ((line = reader.readLine()) != null) {
      tokens = line.split("\\t");
      projDict.put(tokens[0], tokens[1]);
    }
    reader.close();
}
}
