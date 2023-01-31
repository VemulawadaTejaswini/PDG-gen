//25
public class func{
	public void findIcon(@NotNull String path,@NotNull ClassLoader classLoader){
    path = undeprecate(path);
    if (isReflectivePath(path)) return getReflectiveIcon(path, classLoader);
    if (!StringUtil.startsWithChar(path, '/')) return null;
    final URL url = classLoader.getResource(path.substring(1));
    return findIcon(url);
}
}
