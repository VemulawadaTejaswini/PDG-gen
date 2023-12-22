import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int D=sc.nextInt();
        int g=sc.nextInt();
        int[] ar=new int[D];
        int[] ar1=new int[D];
        for(int i=0;i<D;i++){
            ar[i]=sc.nextInt();
            ar1[i]=sc.nextInt();
        }
        int p=0,ans=Integer.MAX_VALUE;
        int G=0;
        for(int i=D-1;i>=0;i--){
            //System.out.println("i="+i);
            G=g;
            int j=i;
            while(G>0){
                if(j<0){
                    break;
                }
                //System.out.println("A");
                int total=ar[j]*100*(j+1)+ar1[j];
                //System.out.println("j="+j);
                if(total>=G){
                    //System.out.println("B");
                    total-=ar1[j];
                    if(total>=G){
                        //System.out.println("C");
                        p+=ar[j];
                        //System.out.println("total="+total+" G="+G);
                        //System.out.println("p="+p);
                        while(total>G){
                            total-=100*(j+1);
                            p--;
                            //System.out.println("p="+p);
                        }
                        G=0;
                    }
                    else{
                        //System.out.println("D");
                        G=0;
                        p+=ar[j];
                        //System.out.println("p="+p);
                    }
                }
                else{
                    //System.out.println("E");
                    //System.out.println("total="+total);
                    G-=total;
                    p+=ar[j];
                    j--;
                    //System.out.println("p="+p);
                    //System.out.println("G="+G);
                }
                if(G<=0){
                    ans=Math.min(ans,p);
                    //System.out.println("ans="+ans);
                    p=0;
                }
            }
        }
        System.out.println(ans);
    }
}