//10
public class func{
public void readSourceValues(BufferedReader reader,OpenIntIntHashMap sourceIndices){
        while ((ch = reader.read()) != -1)
        {
            if (Character.isWhitespace(ch))
            {
                if (r != 0)
                {
                    originalVarNames.put(r, r);
                    r = r * sign;
                    sourceValues.add(r);
                    
                    r = 0;
                    sign = 1;
                }
                continue;
            }
            if (ch == '0' && r == 0)
            {
                sourceValues.add(0);
                continue;
            }
            if (ch == '-')
            {
                sign = -1;
            }

            if ('0' <= ch && ch < '0' + 10)
            {
                r = r * 10 + ch - '0';
            } 
        }
}
}
