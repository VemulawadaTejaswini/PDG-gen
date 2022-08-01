//127
public class func{
	public void paintComponent(Graphics g){
            for (int i = 0; i < bars.length; i++) {
                g2.setColor(colors[i + colorOffset]);
                g2.fill(bars[i]);
            }
}
}
