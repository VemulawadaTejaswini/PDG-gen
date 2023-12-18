public class Main{
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String buf = br.readLine();
        int x = Integer.parseInt(buf);
        x = x * x * x;
        System.out.println(x);
    }
}
