public class func{
public void actionPerformed(ActionEvent e){
            if (audioRunnable == null) {
                audioRunnable = (Runnable)Toolkit.getDefaultToolkit().getDesktopProperty(audioResource);
            }
            if (audioRunnable != null) {
                new Thread(audioRunnable).start();
            }
}
}
