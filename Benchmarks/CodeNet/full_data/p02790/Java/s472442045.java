import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=0,m=0;
        if(scan.hasNext())
            n=scan.nextInt();
        if(scan.hasNext())
            m=scan.nextInt();
        if(n<m){
            for(int i=0;i<m;i++){
                System.out.print(n);
            }
        }else{
            for(int i=0;i<n;i++){
                System.out.print(m);
            }
        }
    }
}
