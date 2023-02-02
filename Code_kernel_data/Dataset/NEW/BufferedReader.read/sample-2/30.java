//30
public class func{
public void getContent(HttpURLConnection connection,StringBuilder builder){
            do
            {
                wasRead = reader.read(buffer, 0, 1024);
                if (wasRead > 0)
                    builder.append(buffer, 0, wasRead);
            }
            while (wasRead > -1);
            if (reader != null) {
                reader.close();
            }
}
}
