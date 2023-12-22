import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc =  new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int n = sc.nextInt();
for(int i = 0; i < n; i++){
System.out.print((a + i ) + "\n" + (b-i) + "\n");
}
}
}