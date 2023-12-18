public class Main{
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        if(a<b)
           System.out.println("a < b");
        else if(a>b)
           System.out.println("a > b");
        else
           System.out.println("a == b");
    }
}
