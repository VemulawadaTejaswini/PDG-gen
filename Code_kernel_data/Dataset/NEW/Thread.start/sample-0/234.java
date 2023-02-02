//234
public class func{
public void main(String[] args){
        Thread t = new Thread() {
                public void run() {
                    System.out.println("Hello Mars");
                }
            };
        t.start();
}
}
