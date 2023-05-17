public class func{
public void read(String path){
        int length = reader.read(data, offset, size - offset);
        if (length == -1) {
          break;
        }
        if (length == 0) {
          char[] newData = new char[size * 2];
          System.arraycopy(data, 0, newData, 0, size);
          data = newData;
        } else {
          offset += length;
        }
}
}
