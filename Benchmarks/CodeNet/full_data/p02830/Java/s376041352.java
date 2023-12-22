import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] s=sc.next().toCharArray();
        char[] s2=sc.next().toCharArray();
        for(int i=0;i<n;i++)System.out.print(s[i]+""+s2[i]);
    }
}
