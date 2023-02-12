public class func{
public void mouseClicked(MouseEvent ev){
                        new Thread(task, new Integer(++threads).toString()).start();
}
}
