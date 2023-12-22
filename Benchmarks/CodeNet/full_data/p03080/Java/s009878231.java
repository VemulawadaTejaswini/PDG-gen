import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {


    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        //
        int n=in.nextInt();
        String str=in.next();
        int r=0;
        int b=0;
        for(int i=0;i<str.length();i++){
            //
            int d=str.charAt(i)=='R'?r++:b++;
        }
        System.out.println(r>b?"Yes":"No");
    }

}
