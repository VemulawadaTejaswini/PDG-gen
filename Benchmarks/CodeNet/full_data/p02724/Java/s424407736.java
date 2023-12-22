import java.util.Scanner;
class Main{
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 
 int X = scan.nextInt();
 int a = 0;
 int b = 0;
 int sum = 0;
   //500円換算
  	if( X >= 1000 ){
      a = X / 500;
      sum = 1000 * a;
      a = 500 * a;
      X = X - a;
    }
  	else if( X >= 500 ){
      X = X - 500;
      sum = 1000;
    }
    else{
    }
   //5円換算
	X = X / 5;
    X = X * 5;
    sum = sum + X;
  
  System.out.println(sum);
 }
}