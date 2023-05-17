public class func{
public void show(Container pane,Object ctx){
        panel = new ConnectGamePanel(client);
        envelope.add(panel);
        pane.add(envelope, BorderLayout.CENTER);
}
}
