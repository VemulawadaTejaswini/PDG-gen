import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int money=scn.nextInt();
        money=money/1000;
        int answer = 0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                int k=n-i-j;
                if(k<0) break;
                if(money==i*10+j*5+k*1&&i+j+k==n){
                    System.out.println(i+" "+j+" "+k);
                     answer++;
                     break;
                }
            }
          	if(answer>0) break;
        }
      	if(answer==0) System.out.println("-1 -1 -1");
    }
}