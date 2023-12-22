import java.util.*;
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int f = 0;
Integer a[] = new Integer[N];
Integer b[] = new Integer[N];
for(int i=0;i<N;i++){
a[i] = sc.nextInt();
b[i] = a[i];
}
Arrays.sort(a);
for(int i=0;i<N;i++){
if(a[i]==b[i]){
}else{
f++;
}
}
if(f==2&&f==0){
System.out.println("YES");
}else{
System.out.println("NO");
}}}