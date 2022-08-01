//241
public class func{
	public void main(String[] args){
    try { VocabServer v = new VocabServer(4444);
    Thread t = new Thread(v);
    t.start();
}
}
