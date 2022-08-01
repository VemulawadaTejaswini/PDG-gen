//259
public class func{
	public void fetchJson(@NotNull final String url){
            c = (HttpURLConnection)new URL(url).openConnection();
            return objectMapper.readTree(c.getInputStream());
}
}
