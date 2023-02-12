public class func{
public void toString(BufferedReader reader){
            while ((len = reader.read(buf)) != -1) {
                sb.append(buf, 0, len);
            }
            IOHelper.close(reader, "reader", LOG);
}
}
