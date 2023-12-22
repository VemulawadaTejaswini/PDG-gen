import java.util.Scanner;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int N1 = sc.nextInt();  
  int N2 = sc.nextInt();
  int N3 = sc.nextInt();
  int N4 = sc.nextInt();
  int a1 = (N1-1*)(N2-1)*(N3-1)*(N4-1);
  int a4 = (N1-4*)(N2-4)*(N3-4)*(N4-4);
  int a7 = (N1-7*)(N2-7)*(N3-7)*(N4-7);
  int a9 = (N1-9*)(N2-9)*(N3-9)*(N4-9);
  
if(a1==0 && a4 == 0 && a7==0 && a9==0){
  System.out.println("YES");
}else{
  System.out.println("NO");
}

}
}
