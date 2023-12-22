import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		int result = 0;
		int count = (int)Math.ceil(X/100);
		int res = X - (100*(count-1));
		for(int a = 0;a <= count;a++){
			int now_count_a = count - a;
			int now_result_a = 0;
			for (int b = 0; b <= count; b++){
				int now_count_b = now_count_a - b;
				int now_result_b = now_result_a + 1*b;
				for (int c = 0; c <= count; c++){
					int now_count_c = now_count_b - c;
					int now_result_c = now_result_b + 2*c;
					for (int d = 0; d <= count; d++){
						int now_count_d = now_count_c - d;
						int now_result_d = now_result_c + 3*d;
						for (int e = 0; e <= count; e++){
							int now_count_e = now_count_d - e;
							int now_result_e = now_result_d + 4*e;
							for (int f = 0; f <= count; f++){
								int now_count_f = now_count_e - f;
								int now_result_f = now_result_e + 5*f;
								if (now_count_f == 0){
									if (now_result_f == res){
										result = 1;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(result);
	}
}