public class func{
public void tokenize(final Reader reader){
            while (br.read(buffer) == 1)
            {
                final char c = buffer[0];
                if (!this.isTokenMember(c))
                {
                    if (text.length() > 0)
                    {
                        result.add(new DefaultToken(text.toString(), start));
                        text = new StringBuilder();
                    }
                    start = index + 1;
                }
                else
                {
                    text.append(c);
                }
                index++;
            }
            if (text.length() > 0)
            {
                result.add(new DefaultToken(text.toString(), start));
            }
}
}
