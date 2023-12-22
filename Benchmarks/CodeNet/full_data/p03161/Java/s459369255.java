import java.util.Scanner;

public class Main {
    public  static  void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        int h []=new int[n];
        for(int j=0;j<n;j++)
            h[j]=sc.nextInt();
        int cost[]= new int [n];
        for(int i=0;i<k&&i<n;i++){
            cost[i]=Math.abs(h[i]-h[0]);
        }
        if(k<n)
            for (int i=k;i<n;i++){
            int j=1,temp,val=Integer.MAX_VALUE;
            while(j<=k){
                temp=cost[i-j]+Math.abs(h[i]-h[i-j]);
                if(temp<val){
                    val=temp;
                }
                j++;
            }
            cost[i]=val;
        }
        System.out.println(cost[n-1]);
    }
}
