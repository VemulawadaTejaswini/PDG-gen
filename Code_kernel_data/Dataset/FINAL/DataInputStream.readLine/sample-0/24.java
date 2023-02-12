public class func{
public void readLegacySites(InputStream input){
        DataInputStream dis = new DataInputStream(input);
        while ((line = dis.readLine()) != null) {
            int eq = line.indexOf('=');
            if (eq != -1) {
                String name = line.substring(0, eq);
                String url = line.substring(eq + 1);
                if (Util.isValidURL(url)) {
                    sites.add(new Subscription(name, url));
                } else {
                    TraceUtil.report(new RuntimeException("invalid URL in line: '" + line + "'; URL was: " + url));
                } // endif

            } else {
                TraceUtil.report(new RuntimeException("missing equals in line: " + line));
            }
        }
}
}
