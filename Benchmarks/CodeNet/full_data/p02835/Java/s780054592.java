import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        Integer a1 = scan.nextInt();
        Integer a2 = scan.nextInt();
        Integer a3 = scan.nextInt();
        System.out.println(hantei(a1,a2,a3));
    }
    public static String hantei(int n,int m,int j){
        
    return (n+m+j)<=21? "win":"bust";
    }
}
