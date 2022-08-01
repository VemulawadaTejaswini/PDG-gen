//16
public class func{
	public void DBToasterEngine(String queryClass){
            ClassLoader cl = this.getClass().getClassLoader();
            if (cl == null) cl = ClassLoader.getSystemClassLoader();
            _query = (IQuery) cl.loadClass(queryClass).newInstance();
}
}
