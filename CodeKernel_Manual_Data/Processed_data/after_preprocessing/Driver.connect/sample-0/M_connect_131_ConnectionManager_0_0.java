public class A{
	public Connection open() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
		Driver d = null;
		if(!registry.containsKey(drv)){
			Class c = (loader==null) ? Class.forName(drv) : Class.forName(drv,true,loader);
			d = (Driver)c.newInstance();
			registry.put(drv,d);
		}
		else{
			d = (Driver)registry.get(drv);
		}
		Properties info = new Properties();
		if (uid != null)info.put("user", uid);
		if (pwd != null)info.put("password", pwd);
		return d.connect(url,info);
	}
}