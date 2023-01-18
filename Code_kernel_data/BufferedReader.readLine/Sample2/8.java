//7
public class func{
	public void readLogMessagesFromFile(String fileName){
        File logFile = new File(fileName);
        BufferedReader r = new BufferedReader(new FileReader(logFile));  
        String logMessage = r.readLine();
        while(logMessage != null){
            this.addLog(logMessage);
            logMessage = r.readLine();
        }
        r.close();
}
}
