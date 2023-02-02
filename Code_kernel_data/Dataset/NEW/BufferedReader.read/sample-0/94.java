//94
public class func{
public void copyWifiSupplicantTemplate(BufferedWriter bw){
            BufferedReader br = new BufferedReader(new FileReader(FILE_WIFI_SUPPLICANT_TEMPLATE));
            while ((size = br.read(temp)) > 0) {
                bw.write(temp, 0, size);
            }
            br.close();
}
}
