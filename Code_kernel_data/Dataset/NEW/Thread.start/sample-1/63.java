//63
public class func{
public void run(){
                ThreadGroup tg = Thread.currentThread().getThreadGroup();
                for (ThreadGroup tg2 = tg; tg2 != null; tg2 = tg.getParent())
                    tg = tg2;
                Thread t = new Thread(tg, disposerInstance, "Java2D Disposer");
                t.setDaemon(true);
                t.setPriority(Thread.MAX_PRIORITY);
                t.start();
}
}
