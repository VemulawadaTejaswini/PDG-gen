public class func{
public void spool(BufferedReader reader,PrintWriter out,String tag){
        while ((line = reader.readLine()) != null) {
            if (line.equals(tag)) {
                return;
            }
            out.println(line);
        }
}
}
