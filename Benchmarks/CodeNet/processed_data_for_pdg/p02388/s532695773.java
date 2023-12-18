public class Main {
	public static void main(String[] arg)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ipt = br.readLine();
        int x =  Integer.parseInt(ipt);
        System.out.println(x*x*x);
    }
}
