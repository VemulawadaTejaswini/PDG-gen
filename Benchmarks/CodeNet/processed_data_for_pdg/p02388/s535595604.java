public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String line =br.readLine();
        int x=Integer.parseInt(line);
        System.out.println(x*x*x);
    }
}
