//144
public class func{
	public void actionPerformed(ActionEvent e){
            Thread th = new Thread() {
              @Override
              public void run() {
                visualizeBayesNet(grph, selectedName);
              }
            };
            th.start();
}
}
