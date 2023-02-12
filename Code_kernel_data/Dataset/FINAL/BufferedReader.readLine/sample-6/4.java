public class func{
public void readBase(final BufferedReader reader){
        final String line = reader.readLine();
        if (line == null) {
            return null;
        }
        final Matcher matcher = basePattern.matcher(line);
        if (!matcher.matches()) {
            throw new ParseError("expected base line but got \"" + line + "\"");
        }
        return matcher.group(1);
}
}
