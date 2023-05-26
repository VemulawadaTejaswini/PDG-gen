//117
public class func{
public void loadFile(String name){
        while ((s = data.readLine()) != null)
        {
            lines.add(s);
        }
        return (String[])lines.toArray(new String[lines.size()]);
}
}
