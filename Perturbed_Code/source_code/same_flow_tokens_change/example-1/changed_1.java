public class func {
    public void m1(File f1, String[] arg, StringBuffer sb) {
        Reader r1 = new InputStreamReader(q.getInputStream());
        BufferedReader ip = new BufferedReader(r1);
        while ((rc = ip.read()) != -1) {
            sb.append((char) rc);
        }
        ip.close();
    }
}
