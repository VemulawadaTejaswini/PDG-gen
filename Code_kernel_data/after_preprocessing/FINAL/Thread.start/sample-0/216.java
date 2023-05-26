public class func{
public void actionPerformed(ActionEvent e){
      Thread th = new Thread() {
        public void run() {
        visualizeBayesNet(grph, selectedName);
        }
          };
      th.start();
}
}
