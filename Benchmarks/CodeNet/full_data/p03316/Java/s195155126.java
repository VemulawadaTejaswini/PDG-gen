import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int a = sc.nextInt();
      int n = a;
	 int b = a%10;
      int i = 10;
while(a/i != 0){
    b += a%(i*10)/i;
  i *= 10;
}
     
      if(n%b==0){
		System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}