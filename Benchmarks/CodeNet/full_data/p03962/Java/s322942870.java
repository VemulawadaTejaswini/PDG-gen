import java.util.Scanner;

class Main{
  public static void main(String[] args){
  Scanner scanner=new Scanner(System.in);
int n[]= new int[3];
for(int i = 0 ; i < 3 ; i++ ){
  n [i] = scanner.nextInt();
}
  int a = n[0];
  int b = n[1];
  int c = n[2];
if(a==b && a==c){
  System.out.println(1);
  }else if(a==b || a==c){
    System.out.println(2);
      }else{System.out.println(3);
      }
}
}