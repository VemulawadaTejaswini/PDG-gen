import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int n = sc.nextInt();

if(b <= n){
for(int i = a; i < b; i++){
System.out.println(i);
}
return;
}
Set<Integer> set = new TreeSet<>();
for(int i = 0; i < n; i++){
set.add(a + i);
set.add(b - i);
}
for(int c : set){
System.out.println(c);
}
}
}