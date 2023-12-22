import java.util.Arrays;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[2 * n];
for (int i = 0; i < arr.length; i++) {
arr[i] = sc.nextInt();
}
sc.close();
Arrays.sort(arr);
int sum = 0;
for (int i = 0; i < arr.length; i += 2) {
sum += arr[i];
}
System.out.println(sum);


}

}