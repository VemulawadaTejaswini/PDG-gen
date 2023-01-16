//28
public class func{
	public void loadMeta(File current){
    if (order.exists()) {
      try {
        DataInputStream dis = new DataInputStream(new FileInputStream(order));
        String line = null;
        while ((line = dis.readLine()) != null) {
          File file = config.getPodcastRootPath(line);
          if (file.exists()) {
            metas.add(new MetaFile(file));
                                                if ( currentName != null && currentName.equals(file.getName()) )
                                                {
                                                   currentIndex = metas.size() - 1;
                                             Log.d("CarCast", "currentIndex: " + currentIndex);
                                                }
          }
        }
      } catch (IOException e) {
        Log.e("CarCast", "reading order file", e);
      }
    }
}
}
