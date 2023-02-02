//42
public class func{
public void getWordsFromInput(String inputFile){
            BufferedReader input = new BufferedReader(new FileReader(inputFile));
            for (int charByte = input.read(); charByte >= 0; charByte = input.read()) {
                char readChar = (char)charByte;

                if (readChar == '\r') { // ignore \r
                } else if (readFirstLine) {
                    lines.append(readChar);
                } else {
                    if (readChar == '\n') {
                        readFirstLine = true;
                        continue;
                    }

                    firstLine.append(readChar);
                }
            }
            input.close();
}
}
