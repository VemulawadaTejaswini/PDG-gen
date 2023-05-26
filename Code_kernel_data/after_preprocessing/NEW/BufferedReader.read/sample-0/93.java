//93
public class func{
public void readErrorStreamFully(InputStream is,BluetoothProcessListener listener){
    br = new BufferedReader(new InputStreamReader(is));
    while ((ch = br.read()) != -1) {
      stringBuilder.append((char) ch);
    }
    listener.processErrorStream(stringBuilder.toString());
}
}
