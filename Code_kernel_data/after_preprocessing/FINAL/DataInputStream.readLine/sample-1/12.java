public class func{
public void createWatermark(){
        File file = new File("/system/etc/setup.conf");
            in = new FileInputStream(file);
            DataInputStream ind = new DataInputStream(in);
            String line = ind.readLine();
            if (line != null) {
                String[] toks = line.split("%");
                if (toks != null && toks.length > 0) {
                    mWatermark = new Watermark(mRealDisplayMetrics, mFxSession, toks);
                }
            }
}
}
