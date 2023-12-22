import java.util.Scanner;

class Main{
    static Scanner scan=new Scanner(System.in);
    public static void main(String args[]){
        int n,t,a;
        Integer h[]=new Integer[2000];
        int x,min=99999999;
        int ans=0;
        
        n=scan.nextInt();
        t=scan.nextInt();
        a=scan.nextInt();

        a*=1000;
        for(int i=0;i<n;i++){
            h[i]=scan.nextInt();
            x=t-h[i]*6;
            if(min>(int)Math.abs((double)(a-x))){
                min=(int)Math.abs((double)(a-x));
                ans=i+1;
            }
        }
        System.out.println(ans);

    }   
}