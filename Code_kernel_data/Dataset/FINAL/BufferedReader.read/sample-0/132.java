public class func{
public void readFileAsString(String fpath){
    BufferedReader reader = new BufferedReader(new FileReader(new File(fpath)));
    while ((numRead=reader.read(buff)) != -1) {
      String readData = String.valueOf(buff, 0, numRead);
      sb.append( readData );
    }
    return sb.toString();
}
}
