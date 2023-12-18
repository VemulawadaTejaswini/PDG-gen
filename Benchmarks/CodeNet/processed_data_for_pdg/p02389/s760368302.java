public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str = s.split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        System.out.println(x * y +" "+ 2 *(x + y));
    }
}
