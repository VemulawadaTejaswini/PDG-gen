public class func{
public void dumpPingResults(final Process process){
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = reader.readLine()) != null) {
                Log.d(TAG, line);
            }
}
}
