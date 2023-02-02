//4
public class func{
public void actionPerformed(ActionEvent e){
            if (audioRunnable == null) {
                audioRunnable = (Runnable)Toolkit.getDefaultToolkit().getDesktopProperty(audioResource);
            }
            if (audioRunnable != null) {
                // Runnable appears to block until completed playing, hence
                // start up another thread to handle playing.
                new Thread(audioRunnable).start();
            }
}
}
