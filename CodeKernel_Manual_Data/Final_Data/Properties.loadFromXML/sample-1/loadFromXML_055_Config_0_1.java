public class A{
	public void getFromFile(String xmlInputFile) throws FileNotFoundException,IOException,Exception{
		InputStream input=new FileInputStream(new File(xmlInputFile));
		super.loadFromXML(input);
		if(!this.isCorrect())throw new Exception("La configuration dans le fichier "+xmlInputFile+" n'est pas correcte");
		input.close();
	}
}