import java.util.*;
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
float N = sc.nextInt();
float f = 0;
flort s=0;
Float a[]=new Float[N];
for(int i=0;i<N;i++){
f=sc.nextInt();
a[i]=1/f;
}
for(int i=0;i<N;i++){
s=s+a[i];
}
float T = 1/s;
System.out.println(T);
}
}