//35
public class func{
public void checkFile(File f){
    BufferedReader fr = new BufferedReader(new FileReader(f));
    while ((l = fr.readLine()) != null) {
      cnt++;
    }
}
}
