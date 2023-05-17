public class func{
public void readURL(URL url){
            urlCon = url.openConnection(); 
            return readInputStream(urlCon.getInputStream());           
}
}
