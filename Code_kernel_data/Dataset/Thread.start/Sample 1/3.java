//2
public class func{
	public void execute(Runnable command){
                String name = metadata.get(Metadata.RESOURCE_NAME_KEY);
                if (name != null) {
                    name = "Apache Tika: " + name;
                } else {
                    name = "Apache Tika";
                }
                Thread thread = new Thread(command, name);
                thread.setDaemon(true);
                thread.start();
}
}
