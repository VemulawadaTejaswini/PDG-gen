//49
public class func{
	public void printText(PrintWriter out,Reader txtReader,String tabSpace){
        BufferedReader in = new BufferedReader(txtReader);
            while ((line = in.readLine()) != null) {
                out.printf("  %-16.16s %s\n", tabSpace, line);
            }
}
}
