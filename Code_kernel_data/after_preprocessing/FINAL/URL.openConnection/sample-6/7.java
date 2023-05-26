public class func{
public void client(String u){
        URLConnection urlc = url.openConnection();
                new DigestInputStream(urlc.getInputStream(), clientDigest);
        while (dis.read() != -1);
        clientMac = dis.getMessageDigest().digest();
}
}
