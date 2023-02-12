public class func{
public void getSqlStatements(InputStream stream){
            while ((r = reader.read()) != END_OF_STREAM) {
                char character = (char) r;
                sb.append(character);
            }
            return COMMENT_PATTERN.matcher(sb)
                    .replaceAll(Strings.EMPTY)
                    .split(STATEMENT_DELIMITER);
}
}
