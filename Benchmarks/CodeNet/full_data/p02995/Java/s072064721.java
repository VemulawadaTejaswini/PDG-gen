import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int A = sc.nextInt();
      	int B = sc.nextInt();
     	int C = sc.nextInt();
      	int D = sc.nextInt();
      	int count = 0;
      
      	for(int i=A;i<=B;i++){
          if(!(i%C==0) && !(i%D==0)){
            count = count + 1;
          }
        }
      System.out.println(count);
	}
}