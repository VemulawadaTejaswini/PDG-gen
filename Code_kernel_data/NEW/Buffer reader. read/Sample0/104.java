//103
public class func{
	public void updated(UpdateEvent e){
            BufferedReader reader = new BufferedReader(new FileReader(monitor.file));
            while ((len = reader.read(chars)) > -1)
              sb.append(chars,0,len);
            reader.close();
}
}
