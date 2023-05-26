//145
public class func{
public void copyStream(final BufferedReader in,final PrintWriter out,final String[] mapFrom,String[] mapTo){
        while ((line = in.readLine()) != null) {
            for (int i = 0; i < mapFrom.length; i++) {
                line = line.replaceAll(mapFrom[i], mapTo[i]);
            }
            out.println(line);
        }
}
}
