import java.util.*; 
public class Main{
public static void main(String ... string){
Scanner sc = new Scanner(System.in); 
  int n = sc.nextInt(); 
  int m = sc.nextInt(); 
  System.out.println(n*(n-1)/2 + m*(m-1)/2); 
}
}