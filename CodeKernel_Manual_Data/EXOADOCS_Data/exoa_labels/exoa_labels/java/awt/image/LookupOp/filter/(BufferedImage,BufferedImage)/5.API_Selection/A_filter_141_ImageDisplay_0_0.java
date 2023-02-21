public class A{
	//...
	public static void main(){
		BufferedImage bi = new BufferedImage(colorModel,wr,colorModel.isAlphaPremultiplied(),null);
		//...
		BufferedImage bimg = new BufferedImage(colorModel,raster,colorModel.isAlphaPremultiplied(),null);
		//...
		LookupOp lookup = new LookupOp(lutTable, null);
		lookup.filter(bi, bimg);
	}
}