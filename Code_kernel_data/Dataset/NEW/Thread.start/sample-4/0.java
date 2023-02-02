//0
public class func{
public void StreamMover(InputStream src,final OutputStream dst){
            Thread t = new Thread(this);
            t.setName("Stream mover");
            t.start();
}
}
