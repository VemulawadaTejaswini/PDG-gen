public class func{
public void stopSauceTunnel(){
        tunnel_process = Runtime.getRuntime().exec("ruby sauce-tunnel-delete.rb " + tunnel_id);
        BufferedReader input = new BufferedReader
                        (new InputStreamReader(tunnel_process.getInputStream()));
        while ((line = input.readLine()) != null) {
            System.out.println(line);
        }
}
}
