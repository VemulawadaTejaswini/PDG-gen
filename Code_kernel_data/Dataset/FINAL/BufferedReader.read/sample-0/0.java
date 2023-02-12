public class func{
public void getExistingFileContents(){
            if (fileEncoding == null) {
                isr = new InputStreamReader(fis);
            } else {
                isr = new InputStreamReader(fis, fileEncoding);
            }
            BufferedReader br = new BufferedReader(isr);
            int returnedBytes = br.read(buffer);
            while (returnedBytes != -1) {
                sb.append(buffer, 0, returnedBytes);
                returnedBytes = br.read(buffer);
            }
            br.close();
}
}
