public class Main{
    public static void main(String[] args){
        int a,b,ansa,ansb;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
       ansa = a*b;
       ansb = a+a+b+b;
       System.out.println(ansa + " " + ansb);
    }
}
