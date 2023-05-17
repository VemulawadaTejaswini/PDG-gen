public class func{
public void getStartOfSelected(String val){
      while ((cur = in.read()) != -1) {
        char c = (char) cur;
        if (c == '\n' || ("" + c).equals(System.getProperty("line.separator"))) {
          int index = line.indexOf(search);
          if (index != -1) {
            return count - line.length() + index;
          }
          line = "";
        }
        line += c;
        count += 1;
      }
}
}
