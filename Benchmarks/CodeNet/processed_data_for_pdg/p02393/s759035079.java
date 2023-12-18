public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d;
if (a < b) {
}else{
d = a;
a = b;
b = d;
}
if (b < c) {
} else { 
 d = b;
 b = c;
 c = d;  
} 
if(a < b){
}else{
d = a;
a = b;
b = d;
}
System.out.printf("%d %d %d\n", a, b, c);
}
}
