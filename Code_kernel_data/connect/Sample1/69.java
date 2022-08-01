//68
public class func{
	public void shouldStartAndStopMongoD(){
    MongoProcessHolder mongoProcess = LocalMongoFactory.createMongoProcess();
    mongoProcess.stopMongo();
      new Socket().connect(new InetSocketAddress(mongoProcess.getMongoPort()), 1);
}
}
