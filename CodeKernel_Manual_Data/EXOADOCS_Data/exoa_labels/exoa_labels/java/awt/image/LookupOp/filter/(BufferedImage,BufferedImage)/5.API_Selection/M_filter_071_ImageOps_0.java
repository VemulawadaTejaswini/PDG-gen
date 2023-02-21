public class A{
	public void render(int w, int h, Graphics2D g2) {
		int iw = img[imgIndex].getWidth(null);
		int ih = img[imgIndex].getHeight(null);
		BufferedImage bi = new BufferedImage(iw,ih,BufferedImage.TYPE_INT_RGB);
		biop[opsIndex].filter(img[imgIndex], bi);
		g2.drawImage(bi,0,0,w,h,null);
	}
}