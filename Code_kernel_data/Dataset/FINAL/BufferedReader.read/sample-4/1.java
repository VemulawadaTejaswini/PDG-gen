public class func{
public void processFlagFile(){
    while ((c = buffer.read()) != -1) {

      if (isFirstCharacter) {
        isFirstCharacter = false;
        if (c == UTF8_BOM_CODE) {
          continue;
        }
      }

      if (c == 32 || c == 9 || c == 10 || c == 13) {
        if (quoted) {
          builder.append((char) c);
        } else if (builder.length() != 0) {
          tokens.add(builder.toString());
          builder.setLength(0);
        }
      } else if (c == 34) {
        if (escaped) {
          if (quoted) {
            builder.setCharAt(builder.length()-1, (char) c);
          } else {
            builder.append((char) c);
          }
        } else {
          quoted = !quoted;
        }
      } else {
        builder.append((char) c);
      }

      escaped = c == 92;
    }
    buffer.close();
}
}
