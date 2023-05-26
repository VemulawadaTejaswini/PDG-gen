public class func{
public void getContent(BufferedReader reader){
        while ((ch = reader.read()) != -1) {
            if (ch == '\r' || ch == '\n') {
                if (line.length() > 0) {
                    fullLog.append(ConsoleNote.removeNotes(line.toString()));
                    line.setLength(0);
                }
                fullLog.append((char) ch);
            } else {
                line.append((char) ch);
            }
        }
        if (line.length() > 0) {
            fullLog.append(ConsoleNote.removeNotes(line.toString()));
        }
        StringBuilder content = new StringBuilder();
        final Matcher matcher = pattern.matcher(fullLog);
        while (matcher.find()) {
            if (maxMatches != 0 && ++numMatches > maxMatches) {
                break;
            }
            if (showTruncatedLines) {
                if (matcher.start() > lastMatchEnd) {
                    int numLinesTruncated = countLineTerminators(fullLog.subSequence(lastMatchEnd, matcher.start()));
                    if (numLinesTruncated > 0) {
                        insidePre = stopPre(content, insidePre);
                        appendLinesTruncated(content, numLinesTruncated, asHtml);
                    }
                }
            }
            if (asHtml) {
                insidePre = startPre(content, insidePre);
            }
            if (substText != null) {
                final StringBuffer substBuf = new StringBuffer();
                matcher.appendReplacement(substBuf, substText);
                final String segment = substBuf.substring(matcher.start() - lastMatchEnd);
                appendMatchedSegment(content, segment, escapeHtml, matchedSegmentHtmlStyle);
            } else {
                appendMatchedSegment(content, matcher.group(), escapeHtml, matchedSegmentHtmlStyle);
            }
            lastMatchEnd = matcher.end();
        }
}
}
