//109
public class func{
	public void getContent(HttpResponse response){
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            while ((read = reader.read(buff)) != -1) {
                builder.append(buff, 0, read);
            }
            return builder.toString();
}
}
