
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                String[] ss=br.readLine().split(" ");
                int n=Integer.parseInt(ss[0]);
                int m=Integer.parseInt(ss[1]);
                int[] arr=new int[n];
                int[] brr=new int[n];
                for(int i=0;i<m;i++){
                    ss=br.readLine().split(" ");
                    int a=Integer.parseInt(ss[0])-1;
                    if(ss[1].equals("WA") && brr[a]==0){
                        arr[a]++;
                    }else{
                        brr[a]=1;
                    }
                }
                int c=0,w=0;
                for(int i=0;i<n;i++){
                    if(brr[i]==1){
                        c++;
                    }
                    w+=arr[i];
                }
                System.out.println(c+" "+w);





        }catch(Exception e){
            System.out.println("kkkk");
        }
    }
    static boolean isPal(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    static class pair{
        int a,b;
        public pair(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
}