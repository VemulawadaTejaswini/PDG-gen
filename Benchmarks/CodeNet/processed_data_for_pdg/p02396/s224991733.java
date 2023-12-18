public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cnt=0;
        while(true){
            cnt++;
            int a=sc.nextInt();
            if(a==0) break;
            System.out.println("Case "+cnt+": "+a);
        }
        sc.close();
    }
}
