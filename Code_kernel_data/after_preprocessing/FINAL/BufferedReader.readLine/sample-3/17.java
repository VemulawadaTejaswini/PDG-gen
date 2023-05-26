public class func{
public void readContent(BufferedReader reader){
    while ((line = reader.readLine()) != null)
    jb.append(line);
    return jb.toString();
}
}
