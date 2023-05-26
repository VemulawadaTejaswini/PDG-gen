//43
public class func{
public void transferData(Reader source,Writer dest,int tz){
        BufferedWriter out = new BufferedWriter(dest, tz);
        while ((read = in.read(bridge, 0, tz)) != -1) {
            out.write(bridge, 0, read);
            total += read;
        }
        in.close();
}
}
