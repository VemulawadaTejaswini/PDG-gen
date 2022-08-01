//48
public class func{
	public void normalizeName(String name){
        if (StringUtils.startsWithIgnoreCase(name, "classpath:")) {
            name = StringUtils.removeStartIgnoreCase(name, "classpath:");
        }
        name = "/"+StringUtils.strip(name, "/\\");
        String path = new File(name).toURI().normalize().getRawPath();
        return StringUtils.stripStart(path, "/\\");
}
}
