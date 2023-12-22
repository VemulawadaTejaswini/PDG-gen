import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n=sc.nextInt(),m=sc.nextInt(),x=sc.nextInt(),a1=0,a2=0,t;
for(int i=0;i<m;i++)t=sc.nextInt()<x?a1++:a2++;
System.out.println(Math.min(a1, a2));
}
}