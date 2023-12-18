public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x=scan.nextInt();
        int cnt=0;
        while(x!=0){
            System.out.println("Case "+(++cnt)+": "+x);
            x=scan.nextInt();
        }
    }
}
