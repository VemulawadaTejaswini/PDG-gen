public class func{
public void load(InputStream inStream){
        while (pos < line.length()
               && ! Character.isWhitespace(c = line.charAt(pos++))
               && c != '=' && c != ':')
          {
            if (needsEscape && c == '\\')
              {
                if (pos == line.length())
                  {
                    line = reader.readLine();
                    if (line == null)
                      line = "";
                    pos = 0;
                    while (pos < line.length()
                           && Character.isWhitespace(c = line.charAt(pos)))
                      pos++;
                  }
                else
                  {
                    c = line.charAt(pos++);
                    switch (c)
                      {
                      case 'n':
                        key.append('\n');
                        break;
                      case 't':
                        key.append('\t');
                        break;
                      case 'r':
                        key.append('\r');
                        break;
                      case 'u':
                        if (pos + 4 <= line.length())
                          {
                            char uni = (char) Integer.parseInt
                              (line.substring(pos, pos + 4), 16);
                            key.append(uni);
                            pos += 4;
                          }
                        break;
                      default:
                        key.append(c);
                        break;
                      }
                  }
              }
            else if (needsEscape)
              key.append(c);
          }
        if (needsEscape)
          keyString = key.toString();
        else if (isDelim || Character.isWhitespace(c))
          keyString = line.substring(start, pos - 1);
        else
          keyString = line.substring(start, pos);
        while (pos < line.length()
               && Character.isWhitespace(c = line.charAt(pos)))
          pos++;
        if (! isDelim && (c == ':' || c == '='))
          {
            pos++;
            while (pos < line.length()
                   && Character.isWhitespace(c = line.charAt(pos)))
              pos++;
          }
        if (!needsEscape)
          {
            put(keyString, line.substring(pos));
            continue;
          }
        StringBuilder element = new StringBuilder(line.length() - pos);
        while (pos < line.length())
          {
            c = line.charAt(pos++);
            if (c == '\\')
              {
                if (pos == line.length())
                  {
                    line = reader.readLine();
                    if (line == null)
                      break;
                    pos = 0;
                    while (pos < line.length()
                           && Character.isWhitespace(c = line.charAt(pos)))
                      pos++;
                    element.ensureCapacity(line.length() - pos +
                                           element.length());
                  }
                else
                  {
                    c = line.charAt(pos++);
                    switch (c)
                      {
                      case 'n':
                        element.append('\n');
                        break;
                      case 't':
                        element.append('\t');
                        break;
                      case 'r':
                        element.append('\r');
                        break;
                      case 'u':
                        if (pos + 4 <= line.length())
                          {
                            char uni = (char) Integer.parseInt
                              (line.substring(pos, pos + 4), 16);
                            element.append(uni);
                            pos += 4;
                          }
                        break;
                      default:
                        element.append(c);
                        break;
                      }
                  }
              }
            else
              element.append(c);
          }
        put(keyString, element.toString());
}
}
