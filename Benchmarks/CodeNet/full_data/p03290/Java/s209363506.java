
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int D=scanner.nextInt();
        long G=scanner.nextLong();
        int[] p=new int[D];
        int[] c=new int[D];
        for(int i=0;i<D;i++){
            p[i]=scanner.nextInt();
            c[i]=scanner.nextInt();
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<(1<<D);i++){
            //System.out.println("---"+i);
            int tmpResult=0;
            int sum=0;
            List<Integer> costs=new ArrayList<>();
            for(int j=0;j<D;j++){
                if((i>>(D-j-1))%2!=0){
                    sum+=(j+1)*100*p[j]+c[j];
                    tmpResult+=p[j];
                }else{
                    for(int k=0;k<p[j]-1;k++){
                        costs.add((j+1)*100);
                    }
                }
            }
            Collections.sort(costs);
            //System.out.println("sum="+sum);
            //System.out.println(costs);
            boolean flag=false;
            while(sum<G){
                if(costs.size()==0){
                    flag=true;
                    break;
                }
                sum+=costs.get(costs.size()-1);
                costs.remove(costs.size()-1);
                tmpResult++;
            }
            if(flag) continue;
            if(ans>tmpResult){
                ans=tmpResult;
            }

        }
        System.out.println(ans);

    }
}
