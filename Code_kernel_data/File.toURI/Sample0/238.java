//237
public class func{
	public void BasePDFTest(InputStream confStream){
        fopFactory = new FopConfParser(confStream, new File(".").toURI()).getFopFactoryBuilder()
                                                                         .build();
}
}
