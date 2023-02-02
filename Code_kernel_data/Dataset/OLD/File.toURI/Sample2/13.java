//12
public class func{
	public void findUrl(String suffix){
        File file = findFile(suffix);
        if (file != null) {
            return file.toURI().toURL();
        }
        return Main.class.getResource("/" + suffix);
}
}
