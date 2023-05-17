public class func{
public void readFileToString(File file){
    BufferedReader br = new BufferedReader(new FileReader(file));
    while ((line = br.readLine()) != null)
    {
      res += line + "\n";
    }
}
}
