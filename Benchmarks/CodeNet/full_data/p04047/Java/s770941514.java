import java.util.Scanner;
import java.util.Arrays;
public class Main{
public static void main(String args[]){
int N = 0;
int L[] = new int[200];
int ans = 0;
Arrays.fill(L, 1000);

Scanner scan = new Scanner(System.in);
N = scan.nextInt();
for(int i=0;i<2*N;i++){
L[i] = scan.nextInt();
}
Arrays.sort(L);
for(int i=0;i<2*N;i=i+2){
ans = ans+L[i];
}
System.out.println(ans);
}
}