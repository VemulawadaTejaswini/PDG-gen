public class Main {
    public static void main(String[] args)throws IOException{
       BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
         String str = a.readLine();
        int x = Integer.parseInt(str);
        System.out.println(x*x*x);
    }
}
