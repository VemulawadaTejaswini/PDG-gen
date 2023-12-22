import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = 0;
    
    for(int i =1; i <= num; i++){
		int j = i;
      	int wa = 0;
      	while(j > 0){
        wa+= j%10;
          j = j/10;
        }
      if(wa >= a && wa <= b){
		sum += i;
      }
    }  
    System.out.println(sum);
  }
}