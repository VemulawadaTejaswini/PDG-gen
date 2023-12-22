

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		char s[] = sc.next().toCharArray();

		char target[] = {'1', '0'};
		int targetIndex = 0;
		Vector<Integer> vec = new Vector<Integer>();
		int count = 0;
		for(int i = 0; i < n; i++){

			if(s[i] != target[targetIndex]){
				targetIndex++;
				targetIndex %= 2;
				vec.add(count);
				count = 0;
			}

			count++;

			if(i == n - 1){
				vec.add(count);
				break;
			}
		}

		for(int i = 0; i < vec.size(); i++){
//			System.out.println(vec.get(i));
		}

		int sum = 0;
		for(int i = 0; i < Math.min(vec.size(), 2*k + 1); i++){
			sum += vec.get(i);
		}
//		System.out.println("sum = "+sum);

		int tmpSum = sum;
		for(int i = 2; i < vec.size(); i += 2){
			tmpSum -= (vec.get(i - 1) + vec.get(i - 2));
//			System.out.println("remove "+(i - 2)+ " and " + (i - 1));
			if(i + 2*k - 1 < vec.size()){
				tmpSum += vec.get(i + 2*k - 1 );
//				System.out.println("add "+(i + 2*k - 1));
			}
			if(i + 2*k  < vec.size()){
				tmpSum += vec.get(i + 2*k  );
//				System.out.println("add "+(i + 2*k));
			}

//			System.out.println("tmpSum "+tmpSum);
			sum = Math.max(sum, tmpSum);
		}

		System.out.println(sum);
	}

}