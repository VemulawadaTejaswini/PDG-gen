//170
public class func{
	public void getFileSizeFromHttpHead(final String fileUrl){
            URLConnection connection = new URL(fileUrl).openConnection();
            connection.setUseCaches(true);
            connection.setReadTimeout(httpTimeout);
            connection.setConnectTimeout(httpTimeout);
            String contentLenght = connection.getHeaderField(CONTENT_LENGTH);
            return Long.parseLong(contentLenght);
            throw new DownloadException(String.format("Can not obtain file [%s] size", fileUrl), e);
}
}
