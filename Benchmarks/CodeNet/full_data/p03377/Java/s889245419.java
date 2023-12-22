import java.util.Scanner;
public class Main {
public static final String YES = "YES";
public static final String NO = "NO";
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int x = sc.nextInt();
String result = YES;
if (a > x) result = NO;
if (a + b < x) result = NO;
System.out.println(result);
}
}