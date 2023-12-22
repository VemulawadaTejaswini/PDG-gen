import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Long> aList = new ArrayList<>();
		List<Long> aListReverse = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			long a = sc.nextInt();
			aList.add(a);
			aListReverse.add(a);
		}
		long sumB = 0;

		for (int i = 0; i < n-1; i++) {
			long leftA = aList.get(i);
			long rightA = aList.get(i+1);
			if(leftA<0 && rightA<0){
				aList.set(i+1,-rightA);
				sumB-= leftA;
				// System.out.println(" ");
				// System.out.println("共に負");
			}else if(leftA>0&&rightA>0){
				sumB+= leftA;
				// System.out.println(" ");
				// System.out.println("共に正");
			}else{
				// System.out.println(" ");
				// System.out.println("絶対値比較ルート ");
				long absLeft = Math.abs(leftA);
				long absRight = Math.abs(rightA);
				// System.out.println("leftA "+leftA);
				// System.out.println("rightA "+rightA);
				if(absLeft >=absRight){
					//左の方が絶対値が大きい
					if(leftA>rightA){
						//つまりright<0<left
						//そのまま
						sumB+= leftA;
					}else{
						//つまりleft<0<right
						//-1をかける
						sumB+= -leftA;
						aList.set(i+1,-rightA);
					}
				}else{
					//rightの方が絶対値が大きい
					if(leftA>rightA){
						//つまりright<0<left
						//-1をかける
						sumB+= -leftA;
						aList.set(i+1,-rightA);
					}else{
						//つまりleft<0<right
						//そのまま
						sumB+= leftA;
					}
				}
			}
		}
		sumB+= aList.get(n-1);

		long sumReverseB = 0;

		for (int i = n-2; i >=0; i--) {
			long leftA = aListReverse.get(i);
			long rightA = aListReverse.get(i+1);
			if(leftA<0 && rightA<0){
				aListReverse.set(i,-leftA);
				sumReverseB-= rightA;
				// System.out.println(" ");
				// System.out.println("共に負");
			}else if(leftA>0&&rightA>0){
				sumReverseB+= rightA;
				// System.out.println(" ");
				// System.out.println("共に正");
			}else{
				// System.out.println(" ");
				// System.out.println("絶対値比較ルート ");
				long absLeft = Math.abs(leftA);
				long absRight = Math.abs(rightA);
				// System.out.println("leftA "+leftA);
				// System.out.println("rightA "+rightA);
				if(absLeft >=absRight){
					//左の方が絶対値が大きい
					if(leftA>rightA){
						//つまりright<0<left
						//そのまま
						sumReverseB+= rightA;
					}else{
						//つまりleft<0<right
						//-1をかける
						sumReverseB+= -rightA;
						aListReverse.set(i,-leftA);
					}
				}else{
					//rightの方が絶対値が大きい
					if(leftA>rightA){
						//つまりright<0<left
						//-1をかける
						sumReverseB+= -rightA;
						aListReverse.set(i,-leftA);
					}else{
						//つまりleft<0<right
						//そのまま
						sumReverseB+= rightA;
					}
				}
			}
		}
		sumReverseB+= aListReverse.get(0);
		// System.out.println("sumReverseB "+sumReverseB);


		System.out.println(Math.max(sumB,sumReverseB));

	}

}
