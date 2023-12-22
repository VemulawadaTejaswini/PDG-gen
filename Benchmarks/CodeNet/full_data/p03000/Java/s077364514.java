import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt();
        int[] l = new int[n];
        for(int i=0;i<n;i++)l[i]=sc.nextInt();

        int d=0;
        int i;
        for(i=0;i<n;i++){
            if(d>x)break;
            d=d+l[i];
        }
        
        System.out.println(i);

    }

}
