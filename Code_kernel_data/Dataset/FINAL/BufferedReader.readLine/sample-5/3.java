public class func{
public void readWorkspaceName(File nameFile){
    final FileReader reader = new FileReader(nameFile);
    final BufferedReader input = new BufferedReader(reader);
      return input.readLine();
      try { input.close(); } catch (IOException ignored) { }
}
}
