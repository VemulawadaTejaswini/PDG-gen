public class func{
public void convertWindowsScriptToUnix(File windowsScriptFile){
    String windowsScriptFilename = windowsScriptFile.getName();
    String unixScriptFilename = getUnixScriptNameFor(windowsScriptFilename);
    if (windowsScriptFile.getParent() != null) {
      unixScriptFile = new File(windowsScriptFile.getParent() + "/" + unixScriptFilename);
    } else {
      unixScriptFile = new File(unixScriptFilename);
    }
    BufferedWriter writer = new BufferedWriter(new FileWriter(unixScriptFile));
      BufferedReader reader = new BufferedReader(new FileReader(windowsScriptFile));
        int next = reader.read();
        while( prev != -1 ) {
          if ( prev != -1 && ( prev != '\r' || next != '\n' ) ) {
            writer.write(prev);
          }
          prev = next;
          next = reader.read();
        }
        reader.close();
}
}
