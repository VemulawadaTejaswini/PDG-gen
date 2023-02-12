public class func{
public void getContents(IStorage file){
            while ((read= br.read()) != -1)
                sb.append((char) read);
            br.close();
}
}
