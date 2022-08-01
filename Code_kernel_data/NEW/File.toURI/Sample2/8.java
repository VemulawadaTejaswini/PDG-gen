//7
public class func{
	public void getURL(gov.nasa.worldwind.util.Tile tile,String imageFormat){
      File file = new File(directory, tile.getLevelNumber()
          + File.separator + paddedInt(tile.getRow(), 4)
          + File.separator + paddedInt(tile.getRow(), 4) + "_"
          + paddedInt(tile.getColumn(), 4) + ".bil");
      if (file.exists())
        return file.toURI().toURL();
}
}
