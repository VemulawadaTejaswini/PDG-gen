//129
public class func{
	public void readGroundTruth(String csv_filename){
      while((line = bufRdr.readLine()) != null) {
         ret.add(new OCRTruth(line));
      }
}
}
