//81
public class func{
public void doInBackground(Void... params){
            s.connect(new InetSocketAddress(host, port), timeout);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()), BUF);
            while ((banner = in.readLine()) != null) {
                break;
            }
            in.close();
}
}
