public class func{
public void readResponse(BufferedReader reader){
            while ((line = reader.readLine()) != null)
            {
                if ("0".equals(line))
                {
                    line = reader.readLine();
                    assertEquals("", line);
                    break;
                }

                int length = Integer.parseInt(line, 16);
                for (int i = 0; i < length; ++i)
                {
                    char c = (char)reader.read();
                    body.append(c);
                }
                line = reader.readLine();
                assertEquals("", line);
            }
}
}
