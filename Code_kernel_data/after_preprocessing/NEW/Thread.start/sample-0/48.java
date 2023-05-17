//48
public class func{
public void main(String[] args){
            Thread t = new Thread();
            t.start();
            StackTraceElement[] ste = t.getStackTrace();
            if (ste == null)
                throw new RuntimeException("Failed: Thread.getStackTrace should not return null");
}
}
