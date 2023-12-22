import java.util.Scanner;

class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int n,a,b;
        n=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        
        int sum=0,ans=0;
        for(int i=0;i<=n;i++){
            String x=Integer.toString(i);
            //System.out.println(x);
            sum=0;
            for(int j=0;j<x.length();j++){
                sum+=x.charAt(j)-'0';
            }
            //System.out.println(">"+sum);
            if(a<=sum&&sum<=b){
                ans+=i;
            }
            
        }
        System.out.println(ans);
    }
    

}