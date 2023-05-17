public class func{
public void startService(){
        NameRegistrar.register (getName (), task);
        if (task instanceof Runnable) {
            new Thread ((Runnable) task).start ();
        }
}
}
