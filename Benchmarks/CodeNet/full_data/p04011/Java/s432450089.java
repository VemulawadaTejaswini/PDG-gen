import java.util.Scanner;
class Main {
public static void main(String... args) {
Scanner sc = new Scanner(System.in);
int n = Integer.parseInt(sc.next());
int k = Integer.parseInt(sc.next());
int x = Integer.parseInt(sc.next());
int y = Integer.parseInt(sc.next());
int sum = 0;
for(int i =0;i<k;i++){
sum += x;
}
for(int i =0;i<n-k;i++){
sum += y;
}
System.out.println(sum);          
    }
}