//8
public class func{
public void copy(final BufferedReader in,final Appendable out){
      final String line = in.readLine();
      if (line == null)
        break;
      out.append(line).append('\n');
}
}
