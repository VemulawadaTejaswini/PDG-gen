public class func{
public void readFirstLine(final Configuration mrConfig,final Path pathIn){
    final FSDataInputStream fdi = pathIn.getFileSystem(mrConfig).open(pathIn);
    final BufferedReader d = new BufferedReader(new InputStreamReader(fdi));
    final String line = d.readLine();
    d.close();
}
}
