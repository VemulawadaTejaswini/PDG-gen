public class func{
public void updateConsoleLog(File dest,InputStream in,LineListener lineListener){
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            while ((hasRead = reader.read(data, offset, data.length - offset)) != -1) {
                end = offset + hasRead;
                overflowIndex = end;
                for (int i = end; i > 0; i--) {
                    int index = i - 1;
                    char c = data[index];
                    if ('\n' == c) {
                        break;
                    }
                    overflow[index] = data[index];
                    overflowIndex = index;
                }
                if (overflowIndex == 0) {
                    if (end == data.length) {
                        data = realloc(data);
                        overflow = realloc(overflow);
                        offset = end;
                        continue;
                    } else {
                        overflowIndex = end;
                        offset = 0;
                    }
                }
                lineListener.copyLine(new CharArraySequence(data, 0, overflowIndex));
                writer.write(data, 0, overflowIndex);
                for (int i = overflowIndex; i < end; i++) {
                    data[i - overflowIndex] = overflow[i];
                }
                offset = end - overflowIndex;
            }
}
}
