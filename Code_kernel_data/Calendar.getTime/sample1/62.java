//61
public class func{
	public void getScanTimeUTC(int lineNumber){
        return ProductData.UTC.create(imageEndDate.getTime(), firstImageFile.getMicrosecondsOfLine(lineNumber) + remainingMillis * 1000);
}
}
