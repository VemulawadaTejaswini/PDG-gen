public class func{
public void retrieveParts(int contentId,int[] start,int[] end){
        for (int i = 0; i < n; i++) {
          if (start[i] == -1 && end[i] == -1) {
            start[i] = 0;
            end[i] = charLength;
          }
          if (start[i] < 0 || end[i] < 0) {
            throw new RuntimeException("Illegal values, start = " + start[i]
                + ", end = " + end[i]);
          }
          if (start[i] > charLength || end[i] > charLength) {
            throw new RuntimeException("Value(s) out of range, start = " + start[i]
                + ", end = " + end[i] + ", content length = " + charLength);
          }
          if (end[i] <= start[i]) {
            throw new RuntimeException(
                "Tried to read empty or negative length snippet (from " + start[i]
                    + " to " + end[i] + ")");
          }
          long startOffsetBytes = e.offset + start[i] * BYTES_PER_CHAR
              + BYTE_ORDER_MARK_SIZE;
          int bytesToRead = (end[i] - start[i]) * BYTES_PER_CHAR;
          ByteBuffer buffer = ByteBuffer.allocate(bytesToRead);
          int bytesRead = fileChannel.read(buffer, startOffsetBytes);
          if (bytesRead < bytesToRead)
            throw new RuntimeException("Not enough bytes read, " + bytesRead + " < "
                + bytesToRead);
          result[i] = new String(buffer.array(), 0, bytesRead, CHAR_ENCODING);
        }
        fileInputStream.close();
}
}
