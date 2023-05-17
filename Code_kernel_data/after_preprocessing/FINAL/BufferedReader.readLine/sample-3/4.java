public class func{
public void processReader(BufferedReader r){
    while ((line = r.readLine()) != null) {
      qsb.append(line + "\n");
    }
    return (processLine(qsb.toString()));
}
}
