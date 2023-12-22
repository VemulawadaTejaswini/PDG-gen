import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] p=new int[n],q=new int[n];
        int[] facts={1,1,2,6,24,120,720,5040,40320};
        boolean[] usedp=new boolean[n];
        boolean[] usedq=new boolean[n];
        int pin=0;
        int qin=0;
        for(int i=0;i<n;i++)p[i]=sc.nextInt();
        for(int i=0;i<n;i++)q[i]=sc.nextInt();
        int countp;
        int countq;
        for(int i=0;i<n;i++){
            countp=0;
            countq=0;
            for(int j=0;j<n;j++){
                if(!usedp[j]&&j!=p[i]-1){
                    countp++;
                }else if(j==p[i]-1){
                    break;
                }
            }
            for(int j=0;j<n;j++){
                if(!usedq[j]&&j!=q[i]-1){
                    countq++;
                }else if(j==q[i]-1){
                    break;
                }
            }
            usedp[p[i]-1]=true;
            usedq[q[i]-1]=true;
            pin+=facts[n-i-1]*countp;
            
            qin+=facts[n-i-1]*countq;
        }
        System.out.println(Math.abs(pin-qin));
 
    }


}