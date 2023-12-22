

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		final long N = in.nextInt();
		final long A = in.nextInt();
		final long B = in.nextInt();
		final long C = in.nextInt();
		final long D = in.nextInt();


		long aida = N - 1;
		long abs = Math.abs(B - A);
		long maxGain = D - C;

		long count = abs / D;
		long nokori = abs % D;
		if(nokori >= C){
			nokori = 0;
		}
		if(count > aida){
			System.out.println("NO");
		}else{
			if(nokori == 0){
				if((aida-count)%2==0){
					System.out.println("YES");
				}else{
					long d = D / maxGain;
					d *= 2;
					if(D% maxGain != 0)d++;
					boolean flag = false;
					for(int i = 1; i <= count; i++){
						if(aida-count+i-d*i < 0)break;
						else if((aida-count+i-d*i)% 2 == 0){
							flag = true;
							System.out.println("YES");
							break;
						}
					}
//					if((aida-d*count) > 0){
//						nokori = abs % D;
//						if(nokori >= C){
//
//						}
//					}
					if(!flag){
						System.out.println("NO");
					}
				}
			}else{
				long nokoriCount = aida - count;
				if(nokoriCount % 2 == 1){
					long totalMaxGain = maxGain * nokoriCount/2;
					totalMaxGain += D;
					long totalMinGain = C;
					if(abs > totalMaxGain || abs < totalMinGain){
						System.out.println("NO");
					}else{
						System.out.println("YES");
					}
				}else{
					long totalMaxGain = maxGain * nokoriCount/2;
					if(nokori > totalMaxGain){
						System.out.println("NO");
					}else{
						System.out.println("YES");
					}
				}
			}
		}

//		System.out.println(abs);
//		System.out.println(D*aida);
//
//		if(aida % 2 == 1){
//			long totalMaxGain = D * aida;
//			long totalMinGain = C;
//			if(abs > totalMaxGain || abs < totalMinGain){
//				System.out.println("NO");
//			}else{
//				System.out.println("YES");
//			}
//		}else{
//			long totalMaxGain = D * aida;
//			if(abs > totalMaxGain){
//				System.out.println("NO");
//			}else{
//				System.out.println("YES");
//			}
//		}
		in.close();
	}

}
