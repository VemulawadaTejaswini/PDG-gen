public class A{
	public Settings(URL propertiesPath){
		this.path = propertiesPath;
		this.properties = new Properties();
		try{
			this.properties.loadFromXML(propertiesPath.openStream());
		}
		catch (InvalidPropertiesFormatException e){
			throw new UserError("Invalid properties format: ", e);
		}
		catch (IOException e){
			throw new DeveloperError("I/O Exception while loading properties from \"" + propertiesPath.toString() + "\".", e);
		}
		catch (NullPointerException e){
			throw new DeveloperError("Unable to open FileInputStream for \"" + propertiesPath + "\".", e);
		}
		catch (ClassCastException e){
			throw new UserError("There is a problem with the format of your XML properties file.  Not all valid XML is actually accepted by the JDK's XML Properties parser!",e);
		}
		initialize();
	}
}