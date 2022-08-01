//77
public class func{
	public void loadTextFile(File file){
    BufferedReader reader = new BufferedReader(new FileReader(file));
      while ((len = reader.read(buffer)) != -1) {
        input.append(buffer, 0, len);
      }
      reader.close();
}
}
