//37
public class func{
public void getContent(InputStream content){
        while ((line = reader.readLine()) != null) {
            out.append(line);
        }
        return out.toString();
}
}
