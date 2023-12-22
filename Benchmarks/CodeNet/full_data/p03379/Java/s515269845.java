import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] numbers = new int[n];
for (int i = 0; i < n; i++) {
numbers[i] = sc.nextInt();
}
Arrays.sort(numbers);
int tmpCenter = n / 2;
for (int i = 0; i < n; i++) {
if (i <= tmpCenter) {
System.out.println(numbers[tmpCenter]);
} else {
System.out.println(numbers[tmpCenter - 1]);
}
}
}
}