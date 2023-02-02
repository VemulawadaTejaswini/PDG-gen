//9
public class func{
	public void readFileToString(String fileName){
        if (fileName.equals(ERROR_OUTPUT)) {
            return getErrorOutput();
        } else if (fileName.equals(NOTICE_OUTPUT)) {
            return getNoticeOutput();
        } else if (fileName.equals(WARNING_OUTPUT)) {
            return getWarningOutput();
        } else if (fileName.equals(STANDARD_OUTPUT)) {
            return getStandardOutput();
        }
            File file = new File(fileName);
            if ( !file.exists() ) {
                System.out.println("\n" + "FILE DOES NOT EXIST: " + fileName);
            }
            BufferedReader in = new BufferedReader(new FileReader(file));
            char[] allChars = new char[(int)file.length()];
            in.read(allChars, 0, (int)file.length());
            in.close();
}
}
