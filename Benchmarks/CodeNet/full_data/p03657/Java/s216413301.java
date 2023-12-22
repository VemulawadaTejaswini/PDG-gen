import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String ans = "Impossible";
        if(A%3==0||B%3==0||(A+B)%3==0) ans = "Possible";
        System.out.println(ans);
    }
}
 