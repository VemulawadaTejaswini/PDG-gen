import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] Garden = new int[len];
		
		for(int i = 0;i < len;i++) {
			Garden[i] = sc.nextInt();
		}
		
		WaterCount(Garden);
		sc.close();
	}
	public static void WaterCount(int[] Garden){
		int water = 0;
		int cnt = 0;
		int tmp = 0;
		int min;
		
		while(cnt != Garden.length) {
			for(int i = cnt;i < Garden.length-1;i++) {
				//途中に０がないか探す
				if(Garden[i+1] == 0) {
					tmp =i+1;
					break;
				}
			}
				min = Garden[cnt];
				//0が途中にあったら
				if(tmp != 0) {
					for(int j = cnt + 1;j < tmp;j++) {
						if(Garden[j] < min) {
							min = Garden[j];
						}
					}
					for(int w = 1;w <= min;w++) {
						for(int j = cnt;j < tmp;j++) {
							Garden[j]--;
						}
						water++;
					}
					tmp = 0;
				}else {
					for(int j = cnt + 1;j < tmp;j++) {
						if(Garden[j] < min) {
							min = Garden[j];
						}
					}
					for(int w = 1;w <= min;w++) {
						for(int j = cnt;j < Garden.length;j++) {
							Garden[j]--;
						}
						water++;
					}
				}
				while(Garden[cnt] == 0) {
					cnt++;
					
				}
			}
		System.out.println(water);
		}
}
