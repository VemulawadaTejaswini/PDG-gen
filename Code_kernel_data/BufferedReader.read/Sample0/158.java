//157
public class func{
	public void loadPlotData(TownBlock townBlock){
        BufferedReader fin = new BufferedReader(new FileReader(fileName));
          fin.read(key,0,3);
          String test = new String(key);
          switch (elements.fromString(test)) {
          case VER:
            // Read the file version
            int version = fin.read();
            plotBlockData.setVersion(version);
            
            // next entry is the plot height
            plotBlockData.setHeight(fin.read());
            break;
            
          default:
            /*
             * no version field so set height
             * and push rest to queue
             * 
             */
            plotBlockData.setVersion(0);
            // First entry is the plot height
            plotBlockData.setHeight(key[0]);
            IntArr.add((int) key[1]);
            IntArr.add((int) key[2]);
          }
}
}
