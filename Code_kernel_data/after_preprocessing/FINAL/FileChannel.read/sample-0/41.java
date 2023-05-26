public class func{
public void runTransfer(IProgressMonitor monitor){
      if(fileChannel.read(buffer) == -1)
        break;
      buffer.flip();
      while(buffer.remaining() > 0) {
        int n = socket.write(buffer);
        bytesSent += n;
        monitor.worked(n);
        monitor.setTaskName("Transfer Probe (" + numberToString(bytesSent) + " of " + 
            numberToString(probeSize) + ")");
      }
      buffer.clear();
}
}
