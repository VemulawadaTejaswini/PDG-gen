import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] A = sc.next().toCharArray();
	for(int i = 0; i<5 ; i++){
		System.out.print(A[i]);
	}
	System.out.print(" ");
	for(int i = 6; i<13 ; i++){
		System.out.print(A[i]);
	}
	System.out.print(" ");
	for(int i = 14; i<=18 ; i++){
		System.out.print(A[i]);
	}
  }
}