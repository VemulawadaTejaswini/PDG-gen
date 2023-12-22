import java.util.*;

class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = n / 1000;
    int b = (n % 1000) / 100;
    int c = (n % 100) / 10;
    int d = n % 10;
    if(a + b + c + d == 7) {
    	System.out.println(String.valueOf(a) + "+" + String.valueOf(b) + "+" + String.valueOf(c) + "+" + String.valueOf(d) + "=7");
    } else if(a - b + c + d == 7) {
    	System.out.println(String.valueOf(a) + "-" + String.valueOf(b) + "+" + String.valueOf(c) + "+" + String.valueOf(d) + "=7");
    } else if(a - b - c + d == 7) {
    	System.out.println(String.valueOf(a) + "-" + String.valueOf(b) + "-" + String.valueOf(c) + "+" + String.valueOf(d) + "=7");
    } else if(a - b - c - d == 7) {
    	System.out.println(String.valueOf(a) + "-" + String.valueOf(b) + "-" + String.valueOf(c) + "-" + String.valueOf(d) + "=7");
    } else if(a + b - c + d == 7) {
    	System.out.println(String.valueOf(a) + "+" + String.valueOf(b) + "-" + String.valueOf(c) + "+" + String.valueOf(d) + "=7");
    } else if(a + b + c - d == 7) {
    	System.out.println(String.valueOf(a) + "+" + String.valueOf(b) + "+" + String.valueOf(c) + "-" + String.valueOf(d) + "=7");
    } else if(a - b + c - d == 7) {
    	System.out.println(String.valueOf(a) + "-" + String.valueOf(b) + "+" + String.valueOf(c) + "-" + String.valueOf(d) + "=7");
    } else if(a + b - c - d == 7) {
    	System.out.println(String.valueOf(a) + "+" + String.valueOf(b) + "-" + String.valueOf(c) + "-" + String.valueOf(d) + "=7");
    }
}
}