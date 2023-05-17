//13
public class func{
public void getSQLStatements(InputStream stream){
            while ((r = reader.read()) != -1) sb.append((char) r);
            return COMMENT_PATTERN.matcher(sb).replaceAll(Strings.EMPTY).split(";");
}
}
