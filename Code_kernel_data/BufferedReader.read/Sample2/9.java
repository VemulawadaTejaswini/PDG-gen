//8
public class func{
	public void getWordCounts(InputStream inputStream){
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while ((current = bufferedReader.read()) != -1) {
                wordCounts.byteCount++;
                wordCounts.charCount++;

                // line handling
                // if the previous read was a new line, skip the next newline feed
                boolean isSkipNewlineFeed = skipNextLineFeed && current == '\n';
                skipNextLineFeed = false;
                if (isSkipNewlineFeed) {
                    continue;
                }

                boolean eol = (current == '\n' || current == '\r');
                if (eol) {
                    wordCounts.lineCount++;
                    // store the state to skip the next newline feed if required
                    if (current == '\r') {
                        skipNextLineFeed = true;
                    }
                }

                // word handling
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
