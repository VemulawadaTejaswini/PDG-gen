//48
public class func{
public void isWindowsScript(File file){
      reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
      int readLength = reader.read(buffer);
      if (readLength >= 2 && buffer[0] == '#' && buffer[1] == '!') {
        for(int i=2; i<readLength; ++i) {
          switch(buffer[i]) {
          case '\r':
            return true;
          case '\n':
            return false;
          }
        }
      }
}
}
