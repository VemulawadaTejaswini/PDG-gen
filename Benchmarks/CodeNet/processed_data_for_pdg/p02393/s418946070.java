public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=a+b+c;
        int ma=Math.max(Math.max(a,b),c);
        int mi=Math.min(Math.min(a,b),c);
        System.out.printf("%d %d %d\n",mi,d-ma-mi,ma);
    }
}
