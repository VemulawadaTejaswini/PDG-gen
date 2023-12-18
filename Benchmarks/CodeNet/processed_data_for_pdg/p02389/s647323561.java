public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] x = str.split(" ");
        int a = Integer.parseInt(x[0]);
        int b = Integer.parseInt(x[1]);
        System.out.println(a*b + " " + (a+b)*2);
    }
}
