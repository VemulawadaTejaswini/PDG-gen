public class A{
	public final BufferedImage filter(BufferedImage src, BufferedImage dst){
		//...
		BufferedImage tgt;
		//...
		if (tgt != dst)new ColorConvertOp(hints).filter(tgt, dst);
	}
}