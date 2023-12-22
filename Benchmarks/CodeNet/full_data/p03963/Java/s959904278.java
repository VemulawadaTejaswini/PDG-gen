import java.util.*;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int K = sc.nextInt();
int ans = N;
for(int i = 1;i < N;i++){
N *= (N - 1);
}
System.out.println(N);

}
}