import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String ab = a + b;
        int cur = Integer.valueOf(ab);
        int root = (int) Math.floor(Math.sqrt(cur));

        String ans = "No";
        if((root*root==cur||(root+1)*(root+1)==cur||(root-1)*(root-1)==cur)) ans = "Yes";
        System.out.println(ans);
    }
}