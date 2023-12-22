import java.util.Scanner;

public class Main {
 public static void main (String[] args) {
  Scanner sc = new Scanner(System.in);
  int x = sc.nextInt();
  int y = sc.nextInt();
  String[] a = {1,3,5,7,8,10,12};
  String[] b = {4,6,9,11};
   if(x==y){
    System.out.print("Yes");
   }else if(x==2 && y==2){
    System.out.print("Yes");
   }else if(a.contains(x)){
    if(a.contains(y)){
     System.out.print("Yes");
    }
   }else if(b.contains(x)){
    if(b.contains(y)){
     System.out.print("Yes");
    }
   }else {
    System.out.print("No");
   }
  }
}