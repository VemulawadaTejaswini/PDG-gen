public class func{
public void doGet(HttpServletRequest req,HttpServletResponse resp){
        final AsyncContext ctx = req.startAsync();
        new Thread(new AsynchronousTask(ctx)).start();
}
}
