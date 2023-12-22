import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        long res1=0,res2=0;
        res1=(long)(((w+1)/2)*((h+1)/2));
        res2=(long)((w/2)*(h/2));
        System.out.println(res1+res2);
    }
}