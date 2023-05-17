//94
public class func{
public void readAllResultLines(List<String> target,String resultPath,boolean inOrderOfFiles){
    for (BufferedReader reader : getResultReader(resultPath, inOrderOfFiles)) {
      String s = null;
      while ((s = reader.readLine()) != null) {
        target.add(s);
      }
    }
}
}
