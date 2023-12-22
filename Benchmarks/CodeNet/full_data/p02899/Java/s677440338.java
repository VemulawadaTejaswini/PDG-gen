import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[Integer.parseInt(sc.next())-1]=i+1;
        }
        for(int j=0;j<n;j++){
            System.out.print(res[j]+" ");
        }
    }
}