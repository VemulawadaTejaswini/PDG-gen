public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        String s = Integer.toString(n, k);
        System.out.println(s.length());
    }
}
