public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n,x;
        int cnt;
        while(true){
            n=sc.nextInt();
            x=sc.nextInt();
            if(n==0&&x==0)break;
            cnt=0;
            for(int i=1;i<=n-2;i++){
                for(int j=i+1;j<=n-1;j++){
                    for(int k=j+1;k<=n;k++){
                        if(i+j+k==x)cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
