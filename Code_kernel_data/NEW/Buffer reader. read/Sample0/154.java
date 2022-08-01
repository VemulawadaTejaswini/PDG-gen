//153
public class func{
	public void loadLevel(){
      FileReader fstream = new FileReader("save.dat");
      BufferedReader in = new BufferedReader(fstream);
      int deadCounter = in.read();
      in.close();
      result[1] = Integer.valueOf(deadCounter);
}
}
