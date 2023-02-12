public class func{
public void run(Boolean aBoolean){
                if (System.getProperty("model.debug.port") != null) {
                    port = Integer.parseInt(System.getProperty("model.debug.port"));
                }
                Log.info("Start management port on {}", port);
                Thread server = new Thread(new JeroMQCoreWrapper(core, port));
                server.start();
}
}
