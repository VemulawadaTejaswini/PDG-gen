public class func{
public void firstLine(File f){
      bf = new BufferedReader(new FileReader(f));
      return bf.readLine();
      if (bf != null) {
        bf.close();
      }
}
}
