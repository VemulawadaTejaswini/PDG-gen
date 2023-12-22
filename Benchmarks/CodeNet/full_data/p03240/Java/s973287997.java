import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]po=new int[n][2];
        int index=0;
        int []hh=new int[n];
        for(int i=0;i<n;i++){
            po[i][0]=sc.nextInt();
            po[i][1]=sc.nextInt();
            if((hh[i]=sc.nextInt())>0)index=i;
        }
    
        int x=0,y=0,h=0;
        Po:for(x=0;x<=100;x++){
            for(y=0;y<=100;y++){
                boolean b=true;
                h=hh[index]+Math.abs(x-po[index][0])+Math.abs(y-po[index][1]);
                for(int i=0;i<n;i++){
                    if(Math.max(0,h-(Math.abs(x-po[i][0])+Math.abs(y-po[i][1])))!=hh[i]){
                        b=false;
                        break;
                    }
                }
                if(b)break Po;
            }
        }
        System.out.println(x+" "+y+" "+h);
    }
}
