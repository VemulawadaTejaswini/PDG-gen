//8
public class func{
public void read(File file){
    if (!file.exists()) return ret;
      BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),Helper.utf8));
      String line; while ((line = br.readLine()) != null) ret.add(line);
      br.close();
}
}
