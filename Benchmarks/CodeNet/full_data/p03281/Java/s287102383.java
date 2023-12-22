
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        for(int i=1;i<=n;i+=2){
            double sq=Math.sqrt(i);
            int count=0;
            for(int j=1;j<=sq;j++){
                if(i%j==0){
                    count+=2;
                }
            }
            if(count==8){
                ans+=1;
            }
        }
        System.out.println(ans);
    }    
}