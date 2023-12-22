import java.util.*;
import java.util.ArrayList;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String[] strN = sc.next().split("");
        int len = strN.length;
        int N = Integer.parseInt(String.join("",strN));
        int n = 0;
        for (int i=0;i<len;i++) n += Integer.parseInt(strN[i]);
        //System.out.println(N);
        if(N%n==0)System.out.println("Yes");
        else System.out.println("No");
    }
}