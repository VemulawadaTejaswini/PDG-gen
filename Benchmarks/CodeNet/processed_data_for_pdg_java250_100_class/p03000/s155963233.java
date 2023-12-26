public class Main{
    static int INFTY = Integer.MAX_VALUE;
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int x = sc.nextInt();
        int ans=1;
        int d=0;
        for(int i=0;i<n;i++){
            d+=sc.nextInt();
            if(d<=x){
                ans++;
            }else{
                break;
            }
        }
        System.out.println(ans);
    }
}
