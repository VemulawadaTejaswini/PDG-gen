public class func{
public void readerLoop(){
    while (!this.isStopping && read != -1) {
      read= bufferedInput.read();
    }
}
}
