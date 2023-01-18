//119
public class func{
	public void translateLines(BufferedReader br,BufferedWriter bw){
      while ((line = br.readLine()) != null) {
        bw.write(apply(line));
        bw.newLine();
      }
}
}
