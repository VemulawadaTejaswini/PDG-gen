import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String odd = sc.nextLine(),
               even = sc.nextLine();
        int length = odd.length()+even.length();
        for(int i=1;i<=length;i++){
        	if(i%2==0)System.out.print(even.charAt(i/2-1));
        	else System.out.print(odd.charAt(i/2));
        }
        System.out.println();
    }
}