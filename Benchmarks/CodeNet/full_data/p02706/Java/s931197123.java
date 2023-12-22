import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Main {
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String[] ss=br.readLine().split(" ");
            int n=Integer.parseInt(ss[0]);
            int m=Integer.parseInt(ss[1]);
            ss=br.readLine().split(" ");
            int[] arr=new int[m];
            long sum=0;
            for(int j=0;j<m;j++){
                arr[j]=Integer.parseInt(ss[j]);
                sum+=arr[j];
            }
            if(sum>n){
                System.out.println(-1);
            }else{
                System.out.println(n-sum);
            }



        }catch(Exception e){
            System.out.println("KKKK "+e.getMessage());
        }
    }
    static boolean check(int[] arr){
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                odd++;
            }
        }
        if(odd<=1){
            return true;
        }
        return false;
    }
}