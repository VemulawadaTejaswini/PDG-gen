import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        int[] mo = new int[s.length()];
        for(int i = 0 ; i < s.length() ; i++ ){
            mo[i] = (s.charAt(i) - 65 + n) % 26 + 65;
            System.out.print((char)mo[i]);
        }
        System.out.println();
    }
}