public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int b;
        b = sc.nextInt();
        System.out.println(a * b +" "+( a + a + b + b));
        sc.close();
    }
}
