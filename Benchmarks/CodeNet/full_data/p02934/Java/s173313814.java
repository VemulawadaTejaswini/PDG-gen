import java.util.*;
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int S1 = 0;
int S2 = 1;
for(int i=0;i<N;i++){
int f = sc.nextInt();
S1=S1+f;
S2=S2*f;
}
System.out.println("S2/S1");
}
}