public class A{
	public final BufferedImage filter(BufferedImage src, BufferedImage dst){
		if (src.getColorModel() instanceof IndexColorModel)throw new IllegalArgumentException("LookupOp.filter: IndexColorModel "+ "not allowed");

		if (lut.getNumComponents() != 1&& lut.getNumComponents() != src.getColorModel().getNumComponents()&& lut.getNumComponents() != src.getColorModel().getNumColorComponents())throw new IllegalArgumentException("LookupOp.filter: Incompatible " +"lookup table and source image");

		if (dst == null)dst = createCompatibleDestImage(src, null);

		else if (src.getHeight() != dst.getHeight() || src.getWidth() != dst.getWidth())throw new IllegalArgumentException("Source and destination images are " +"different sizes.");

		BufferedImage tgt;
		if (dst.getColorModel().equals(src.getColorModel()))tgt = dst;
		elsetgt = createCompatibleDestImage(src, src.getColorModel());

		Raster sr = src.getRaster();
		WritableRaster dr = tgt.getRaster();
		
		if (src.getColorModel().hasAlpha() &&(lut.getNumComponents() == 1 ||lut.getNumComponents() == src.getColorModel().getNumColorComponents())){
			int[] dbuf = new int[src.getColorModel().getNumComponents()];
			int tmpBands = src.getColorModel().getNumColorComponents();
			int[] tmp = new int[tmpBands];
			
			for (int y = src.getMinY(); y < src.getHeight() + src.getMinY(); y++)for (int x = src.getMinX(); x < src.getWidth() + src.getMinX(); x++){
				sr.getPixel(x, y, dbuf);
				System.arraycopy(dbuf, 0, tmp, 0, tmpBands);
				dr.setPixel(x, y, lut.lookupPixel(tmp, dbuf));
				
			}
		}
		else{
			int[] dbuf = new int[src.getColorModel().getNumComponents()];
			
			for (int y = src.getMinY(); y < src.getHeight() + src.getMinY(); y++)for (int x = src.getMinX(); x < src.getWidth() + src.getMinX(); x++)dr.setPixel(x, y, lut.lookupPixel(sr.getPixel(x, y, dbuf), dbuf));
		}
		
		if (tgt != dst)new ColorConvertOp(hints).filter(tgt, dst);

		return dst;
	}
}