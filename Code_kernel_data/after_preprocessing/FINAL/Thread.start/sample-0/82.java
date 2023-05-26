public class func{
public void main(String[] args){
  Thread thread1 = new Thread(volatileExample.new Worker(), "Worker-1");
  thread1.start();
}
}
