//55
public class func{
public void execute(final String file){
    final FileInputStream fstream = new FileInputStream(file);
    final DataInputStream in = new DataInputStream(fstream);
    final BufferedReader br = new BufferedReader(new InputStreamReader(in));
    while ((this.line = br.readLine()) != null) {
      executeLine();
    }
    in.close();
}
}
