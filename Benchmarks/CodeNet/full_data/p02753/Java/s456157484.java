import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 0; i<a.length()-1; i++){
            if(a.charAt(i) != a.charAt(i+1)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}