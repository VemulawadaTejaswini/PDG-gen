import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		int M = sc.nextInt();
		int D = sc.nextInt();
      	int count = 0;
      	int input_d10 = D / 10;
      	int input_d1 = D - (input_d10 * 10);

      	int d10,d1,dnum;
      	for(int i = 4;i<=M;i++){
        	for(int j = 22; j<=D;j++){
              d10 = j/10;
              d1 = j - (d10*10);
              dnum = d10*d1;
              if(i == dnum){
               		count++;
              }
            }
        }
		// 出力
		System.out.println(count);
	}
}