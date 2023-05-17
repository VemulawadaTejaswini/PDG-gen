public class func{
public void getJSONObject(URL jsonURL){
    while((read = reader.read(buff)) > 0) {
      buffer.append(buff, 0, read);
    }
    DynamicCloudsDaemon.LOG.info("Read " + buffer.length() + " bytes");
    Object res = JSON.parse(buffer.toString());
}
}
