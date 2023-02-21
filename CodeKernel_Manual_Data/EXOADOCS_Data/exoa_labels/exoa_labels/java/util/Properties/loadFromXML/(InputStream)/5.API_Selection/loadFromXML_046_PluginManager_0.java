public class A{
	public static void load_plugin(File f){
		JarFile tmpjar;
		try {
			tmpjar = new JarFile(f);
		} catch (IOException ex) {
			ex.printStackTrace();
			return;
		}
		ZipEntry tmpman=tmpjar.getEntry("plugin.xml");
		if (tmpman==null)return;
		Properties pluginpro=new Properties();
		try{
			pluginpro.loadFromXML(tmpjar.getInputStream(tmpman));
		}
		catch (Exception e){return;}
		String main=pluginpro.getProperty("Plugin-Main");
		if (main==null)return;
		try {
			addURL(f.toURI().toURL());
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
			return;
		}
		Plugin tmp;
		try{
			Class piin=Class.forName(main);
			tmp=(Plugin)piin.newInstance();
		}
		catch (Exception e){return;}
		switch (Integer.parseInt(pluginpro.getProperty("Load-Time","3"))){
			case 0:plugins.add(tmp);
			lbw.add(tmp);
			break;
			case 1:plugins.add(tmp);
			lbm.add(tmp);
			break;
			case 2:plugins.add(tmp);
			lam.add(tmp);
			break;
			case 3:plugins.add(tmp);
			break;
		}
	}
}