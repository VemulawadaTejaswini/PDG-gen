import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {


    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        //
        int a[]=new int[3];
        for(int i=0;i<3;i++){
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        //
        boolean ans=a[0]+a[1]>a[2]?true:false;
        System.out.println(ans==true?"Yes":"No");
    }

}
