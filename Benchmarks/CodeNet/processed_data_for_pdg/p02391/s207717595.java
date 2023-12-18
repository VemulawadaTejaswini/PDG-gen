public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] a = s.split(" ");
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[1]);
        if( x < y ){
            System.out.println("a < b");
        }else if( x > y ){
            System.out.println("a > b");
        }else{
            System.out.println("a == b");
        }
    }
}
