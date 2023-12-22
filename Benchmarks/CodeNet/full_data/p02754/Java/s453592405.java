import java.util.Scanner;
public class Solution {
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int r=sc.nextInt();
        sc.close();
        if(b+r==n || b==0) System.out.println(b);
        else if(b>1) System.out.println(n-r);
    }
}