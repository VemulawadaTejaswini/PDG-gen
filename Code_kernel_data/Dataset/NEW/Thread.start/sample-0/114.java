//114
public class func{
public void main(String[] args){
        Foo foo = new Foo();
        Runnable worker1 = new FirstWorker(foo);
        Runnable worker2 = new SecondWorker(foo);
        Runnable worker3 = new ThirdWorker(foo);
        new Thread(worker1).start();
}
}
