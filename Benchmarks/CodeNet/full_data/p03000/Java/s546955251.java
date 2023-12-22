import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<trip> ll;
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String[] ss=br.readLine().split(" ");
            int n=Integer.parseInt(ss[0]);
            int x=Integer.parseInt(ss[1]);
            ss=br.readLine().split(" ");
            int[] arr=new int[n];
            int sum=0;
            int c=0;
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(ss[i]);
                sum+=arr[i];
                if(sum<=x){
                    c++;
                }
            }
            System.out.println(c);

        }catch(Exception e){
            System.out.println("KKKK "+e.getMessage());
        }
    }

    
    static void shuffle(int[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}
