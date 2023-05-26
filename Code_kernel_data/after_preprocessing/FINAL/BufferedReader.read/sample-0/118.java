public class func{
public void transferData(Reader source,int tz){
        BufferedReader in = new BufferedReader(source);
        while ((read = in.read(bridge, 0, tz)) != -1) {
            this.clob.setString(total +1L, String.copyValueOf(bridge, 0, read));
            total += read;
        }
        in.close();
}
}
