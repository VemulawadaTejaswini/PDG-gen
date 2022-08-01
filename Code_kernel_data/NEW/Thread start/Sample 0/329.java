//328
public class func{
	public void main(String[] args){
      WorkProcessor processor = new WorkProcessor();
      new Thread(processor, "Work-Processor").start();
}
}
