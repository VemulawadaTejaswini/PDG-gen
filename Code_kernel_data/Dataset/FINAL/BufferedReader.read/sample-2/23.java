public class func{
public void load(InputStreamReader isr){
      BufferedReader bin = new BufferedReader(isr);
      bin.mark(2);
      if (bin.read() == '\t') {
        bin.reset();
        loadHeader(bin);
      } else {
        bin.reset();
      }
      while ((fileLine = bin.readLine()) != null) {
        if (fileLine.length() > 0) {
          table = addSymbolTable(fileLine);
          table.load(bin);
        }
      }
      bin.close();
}
}
