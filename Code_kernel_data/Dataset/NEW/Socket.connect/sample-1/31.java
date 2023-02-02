//31
public class func{
public void connectViaCliPort(URL jenkins,CliPort clip){
            out = new SocketOutputStream(s) {
                @Override
                public void close() throws IOException {
                    // ignore
                }
            };
            s = new Socket();
            s.connect(clip.endpoint,3000);
            out = SocketChannelStream.out(s);
                s.close();
}
}
