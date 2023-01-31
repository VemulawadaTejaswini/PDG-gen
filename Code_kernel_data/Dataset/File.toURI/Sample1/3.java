//2
public class func{
	public void addHandlerConfigPath(File taskHandlerFile,T handler){
    if (this.configURItoHandlerName.get(taskHandlerFile.toURI()) == null) {
      this.configURItoHandlerName.put(taskHandlerFile.toURI(), new LinkedList<T>());
    }
    this.configURItoHandlerName.get(taskHandlerFile.toURI()).add(handler);
}
}
