public class A{
	public synchronized void paintComponent(Graphics g) {
		
		Graphics2D g2D = null;
		if (g instanceof Graphics2D) {
			g2D = (Graphics2D)g;
		} else {
			return;
		}
		
		if ( source == null ) {
			g2D.setColor(getBackground());
			g2D.fillRect(0, 0, componentWidth, componentHeight);
			return;
		}
		
		int transX = -originX;
		int transY = -originY;
		
		Rectangle clipBounds = g.getClipBounds();
		
		if (clipBounds == null) {
			clipBounds = new Rectangle(0, 0, componentWidth, componentHeight);
		}
		
		if ( transX > 0 ||transY > 0 ||transX < (componentWidth-source.getWidth()) ||transY < (componentHeight-source.getHeight())) {
			g2D.setColor(getBackground());
			g2D.fillRect(0, 0, componentWidth, componentHeight);
		}
		
		clipBounds.translate(-transX, -transY);
		
		int txmin, txmax, tymin, tymax;
		int ti, tj;
		
		txmin = XtoTileX(clipBounds.x);
		txmin = Math.max(txmin, minTileX);
		txmin = Math.min(txmin, maxTileX);
		
		txmax = XtoTileX(clipBounds.x + clipBounds.width - 1);
		txmax = Math.max(txmax, minTileX);
		txmax = Math.min(txmax, maxTileX);
		
		tymin = YtoTileY(clipBounds.y);
		tymin = Math.max(tymin, minTileY);
		tymin = Math.min(tymin, maxTileY);
		
		tymax = YtoTileY(clipBounds.y + clipBounds.height - 1);
		tymax = Math.max(tymax, minTileY);
		tymax = Math.min(tymax, maxTileY);
		Insets insets = getInsets();
		
		for (tj = tymin; tj <= tymax; tj++) {
			for (ti = txmin; ti <= txmax; ti++) {
				int tx = TileXtoX(ti);
				int ty = TileYtoY(tj);
				
				Raster tile = source.getTile(ti, tj);
				if ( tile != null ) {
					DataBuffer dataBuffer = tile.getDataBuffer();
					
					WritableRaster wr = tile.createWritableRaster(sampleModel,dataBuffer,null);

					BufferedImage bi = new BufferedImage(colorModel,wr,colorModel.isAlphaPremultiplied(),null);

					if ( brightnessEnabled == true ) {
						SampleModel sm = sampleModel.createCompatibleSampleModel(tile.getWidth(),tile.getHeight());

						WritableRaster raster = RasterFactory.createWritableRaster(sm, null);
						
						BufferedImage bimg = new BufferedImage(colorModel,raster,colorModel.isAlphaPremultiplied(),null);

						ByteLookupTable lutTable = new ByteLookupTable(0, lutData);
						LookupOp lookup = new LookupOp(lutTable, null);
						lookup.filter(bi, bimg);
						
						g2D.drawImage(bimg, biop, tx+transX+insets.left, ty+transY+insets.top);
					} else {
						AffineTransform transform;
						
						transform = AffineTransform.getTranslateInstance(tx + transX + insets.left,ty + transY + insets.top);

						g2D.drawRenderedImage(bi, transform);
					}
				}
			}
		}
	}
}