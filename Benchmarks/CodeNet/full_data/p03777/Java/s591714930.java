import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.next().equals("H") ? 1 : -1;
        int b = sc.next().equals("H") ? 1 : -1;
        
        System.out.println(a*b==1?"H":"D");
    }
}
