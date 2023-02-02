//140
public class func{
	public void process(@Nonnull ClassLoader classLoader,@Nonnull String line){
                line = line.trim();
                    classes.add(classLoader.loadClass(line));
                    LOG.warn("'" + line + "' could not be resolved as a Class");
}
}
