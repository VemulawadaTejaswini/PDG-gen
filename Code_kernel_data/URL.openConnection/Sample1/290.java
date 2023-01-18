//289
public class func{
	public void MojangResourceProvider(String version,TextureFactory factory){
            InputStream inputStream = new URL(String.format(JAR_LOCATION, version))
                    .openConnection().getInputStream();
            fromStream(inputStream, factory);
}
}
