//6
public class func{
public void decompress(String str){
        while ((read = bf.read(buff)) != -1) {
            response.append(buff, 0, read);
        }
        return response.toString();
}
}
