public class func{
public void readWholeFile(String file){
                cnt = br.read(buf, 0, 65535);
                if (cnt == -1)
                    break;
                if (cnt > 0) {
                    strBuf.append(buf, 0, cnt);
                }
}
}
