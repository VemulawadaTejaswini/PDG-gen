public class func{
public void loadFile(@Nonnull File logfile,@Nonnull Charset charset){
        if(!logfile.exists())
            return "";
        StringBuilder str = new StringBuilder((int)logfile.length());
        BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(logfile),charset));
            while((len=r.read(buf,0,buf.length))>0)
               str.append(buf,0,len);
            r.close();
}
}
