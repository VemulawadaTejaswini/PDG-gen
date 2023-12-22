import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] data1 = new int[N];
		int[] data2 = new int[N];
		int[] counter1 = new int[1000000];
		int[] counter2 = new int[1000000];
		int ans = 0;

		int j = 0;
		for(int i = 0;i < N;i++){			//データ入力
			if(i%2 == 0){
				data1[i] = scanner.nextInt();
				counter1[data1[i]]++;
			}else{
				data2[j] = scanner.nextInt();
				counter2[data2[j]]++;
				j++;
			}
		}
		int max1 = 0;				//最頻数を発見
		int submax1 = 0;
		int c1 = 0;
		for(int i = 0;i < 100000;i++){
			if(c1 <= counter1[i]){
				c1 = counter1[i];
				submax1 = max1;
				max1 = i;
			}
		}

		int max2 = 0;				//最頻数を発見
		int submax2 = 0;
		int c2 = 0;
		for(int i = 0;i < 100000;i++){
			if(c2 <= counter2[i]){
				c2 = counter2[i];
				submax2 = max2;
				max2 = i;
			}
		}

		Arrays.sort(counter1);
		Arrays.sort(counter2);


		int k1 = 0;
		int k2 = 0;
		for(int i = counter1.length-2;i >= 0;i--){

			if(counter1[i] ==  0){
				break;
			}else{
				k1 += counter1[i];
			}
		}

		for(int i = counter2.length-2;i >= 0;i--){

			if(counter2[i] ==  0){
				break;
			}else{
				k2 += counter2[i];
			}
		}


		if(max1 == max2 && k1 + k2 == 0){

			System.out.println(N/2);
		}else if(max1 == max2 && k1 + k2 != 0){
			if(k1 <= k2){
				for(int i = counter2.length-1;i >= 0;i--){

					if(counter2[i] ==  0){
						break;
					}else if(i == counter2.length-2){

					}else{
						k2 += counter2[i];
					}
				}
			}else{
				for(int i = counter1.length-1;i >= 0;i--){

					if(counter1[i] ==  0){
						break;
					}else if(i == counter1.length-2){

					}else{
						k1 += counter1[i];
					}
				}


			}
			System.out.println(k1+k2);

		}else{
			System.out.println(k1 + k2);

		}










	}
}

