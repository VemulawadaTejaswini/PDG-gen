import java.util.*;
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int f = 0;
Integer A[] = new Integer[N];
Integer B[] = new Integer[N];
for(int i=0;i<N;i++){
a[i] = sc.nextint();
b[i] = a[i];
}
Arrays.sort(a,Comparator,reverseOrder());
for(int i=0;i<N;i++){
if(a[i]==b[i]){
f++;
}
}
if(f=2){
System.out.println(YES);
}else{
System.out.println("NO");
}}}