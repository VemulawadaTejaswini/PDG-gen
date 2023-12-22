import java.util.Scanner;

//
//public class atcoder0221_C{
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int resultA = -1;
		int resultB = -1;
		int result = -1;
		int x = 0;

		// 8%のとき商品の値段がx+A円になる数
		// ⇒ x*0.08=A になる数
		if(A*100%8==0) {
			resultA = (int) (A/0.08);
		}
      if(B*10%1==0){
		// 10%のとき商品の値段がx+B円になる数
			resultB = (int) (B/0.1);
		}
		// 当てはまらない場合はそのまま
		if(resultA!=-1 && resultB!=-1) {
			if(resultA<=resultB) {
				result = resultA;
			}else if(resultB<=resultA) {
				result = resultB;
			}
		}
		System.out.println(result);

	}
}