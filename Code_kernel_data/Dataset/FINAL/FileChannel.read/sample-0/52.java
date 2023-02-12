public class func{
public void run(List<String> args){
          dataBuf.clear();
            dataRead = dataChannel.read(dataBuf);
            if (dataRead < 0) {
              break;
            }
                blockFile + "from disk at offset " + dataChannel.position() +
                ": " + StringUtils.stringifyException(e));
}
}
