public class func{
public void getReader(String alias,boolean recycle,boolean firstLineIsNames){
                    reader.mark(1);
                    int peek = reader.read();
                    if (peek == -1) { // already at EOF
                        reader.close();
                        reader = createBufferedReader(fileEntry);
                        fileEntry.inputOutputObject = reader;
                        if (firstLineIsNames) {
                            reader.readLine();
                        }                
                    } else { // OK, we still have some data, restore it
                        reader.reset();
                    }
}
}
