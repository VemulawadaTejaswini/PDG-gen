//140
public class func{
	public void openConnectionThrowIOException(){
    expect(url.openConnection()).andThrow(new IOException());
}
}
