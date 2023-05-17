public class func{
public void readURLToString(URL url){
          String line = reader.readLine();
          if (line == null) break;
          sb.append(line);
          sb.append((char)reader.read());
      return sb.toString();
}
}
