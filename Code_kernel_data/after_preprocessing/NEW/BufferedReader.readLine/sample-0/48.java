//48
public class func{
public void getWordCountInHSpellFolder(InputStream inputStream){
        final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, Charset.defaultCharset()));
        final String sizes = reader.readLine();
        reader.close();
        tmp = sizes.indexOf(' ', sizes.indexOf('\n'));
        tmp = Integer.parseInt(sizes.substring(tmp + 1).trim());
}
}
