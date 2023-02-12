public class func{
public void getWordCounts(InputStream inputStream){
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while ((current = bufferedReader.read()) != -1) {
                wordCounts.byteCount++;
                wordCounts.charCount++;

                boolean isSkipNewlineFeed = skipNextLineFeed && current == '\n';
                skipNextLineFeed = false;
                if (isSkipNewlineFeed) {
                    continue;
                }

                boolean eol = (current == '\n' || current == '\r');
                if (eol) {
                    wordCounts.lineCount++;
                    if (current == '\r') {
                        skipNextLineFeed = true;
                    }
                }

                boolean isCurrentWhitespace = Character.isWhitespace(current);
                if (!isCurrentWhitespace && previouslyWhitespace) {
                    wordCounts.wordCount++;
                }
                previouslyWhitespace = isCurrentWhitespace;
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
}
}
