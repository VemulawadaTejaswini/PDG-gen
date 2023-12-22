import java.util.Scanner;
public class Main {public static void main(String...args){
    Scanner sc = new Scanner(System.in); int X = sc.nextInt(); int ans = 0;
    ans = ans + (X/500)*1000; X = X -  (X/500)*500; ans = ans + (X/5)*5;
    System.out.println(ans);}
}