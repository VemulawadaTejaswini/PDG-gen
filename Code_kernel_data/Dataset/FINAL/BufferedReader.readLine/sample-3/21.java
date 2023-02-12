public class func{
public void readFile(File file){
    BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
    while ((line = r.readLine()) != null) {
      buf.append(line); 
    }
    return buf.toString();
}
}
