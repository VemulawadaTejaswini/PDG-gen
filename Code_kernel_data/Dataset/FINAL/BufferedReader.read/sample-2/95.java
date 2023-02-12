public class func{
public void drainBuffer(BufferedReader br,StringBuffer storageBuf,int maxLength,int bytesRead,boolean readAll){
        if (br.ready()) {
            char[] buf = new char[1024];
            do {
                int bReadCurrent = br.read(buf, 0, 1024);
                if (storageBuf != null && bytesRead < maxLength) {
                    storageBuf.append(buf, 0, bReadCurrent);
                }
                bReadSession += bReadCurrent;
            } while (br.ready() && readAll);
        }
}
}
