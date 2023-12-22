import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[Integer.parseInt(sc.next())]=i;
        }
        StringBuffer bf= new StringBuffer("");
        for(int j=0;j<n;j++){
            bf.append(res[j]+" ");
        }
        System.out.println(bf);
        sc.close();
    }
}