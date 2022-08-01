//22
public class func{
	public void readInputStreamToString(Socket socket){
        while ((line = bufferedReader.readLine()) != null) {
            if (line.startsWith("Content-Length")) {
                contentLength = Integer.parseInt(line.split(":")[1].trim());
            }
            if (line.length() == 0) {

                if (contentLength != null) {
                    result.append('\n');
                    for (int position = 0; position < contentLength; position++) {
                        result.append((char) bufferedReader.read());
                    }
                }
                break;
            }
            result.append(line).append('\n');
        }
}
}
