import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int a=sc.nextInt();
        long all=0;
        for(int i=1;i<=a;i++){
            if(i%3!=0&&i%5!=0)
                all+=i;
        }
        System.out.println(all);


    }
}
