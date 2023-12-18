class Main {
public static void main (String[] args){
String intSort_abc = "null";
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if (a >= 1 && a <= 10000){
if (b >= 1 && b <= 10000){
if (c >= 1 && c <= 10000){
if (a < b){
   if (b < c){
      intSort_abc = (a + " " + b + " " + c);
   } else {
      intSort_abc = (a + " " + c + " " + b);
   }
        if (c < a){
           intSort_abc = (c + " " + a + " " + b);
        }
}
if (b < a){
   if (a < c){
      intSort_abc = (b + " " + a + " " + c);
   } else {
      intSort_abc = (b + " " + c + " " + a);
   }
        if (c < b){
           intSort_abc = (c + " " + b + " " + a);
        }
}
System.out.println(intSort_abc);
}
}
}
}
}
