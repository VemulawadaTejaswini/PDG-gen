import java.io.BufferedReader;
import java.io.InputStreamReader;



class Main{

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] a = new int[n];
		for(int i = 0;i < n;i++){
			a[i] = Integer.parseInt(input[i]);
		}
		int[] color = new int[8];
		int[] color2 = new int[8];
		for(int i = 0;i < n;i++){
			if(1 <= a[i] && a[i] <= 399){
				color[0] += 1;
				color2[0] += 1;
			}else if(400 <= a[i] && a[i] <= 799){
				color[1] += 1;
				color2[1] += 1;
			}else if(800 <= a[i] && a[i] <= 1199){
				color[2] += 1;
				color2[2] += 1;
			}else if(1200 <= a[i] && a[i] <= 1599){
				color[3] += 1;
				color2[3] += 1;
			}else if(1600 <= a[i] && a[i] <= 1999){
				color[4] += 1;
				color2[4] += 1;
			}else if(2000 <= a[i] && a[i] <= 2399){
				color[5] += 1;
				color2[5] += 1;
			}else if(2400 <= a[i] && a[i] <= 2799){
				color[6] += 1;
				color2[6] += 1;
			}else if(2800 <= a[i] && a[i] <= 3199){
				color[7] += 1;
				color2[7] += 1;
			}else{
				int max = color[0];
				int min = color2[0];
				int index1 = 0;
				int index2 = 0;
				for(int j = 1;j < 8;j++){
					if(max < color[j]){
						max = color[j];
						index1 = j;
					}
					if(min > color2[j]){
						min = color2[j];
						index2 = j;
					}
				}
				color[index1] += 1;
				color2[index2] += 1;
			}
		}
		int count1 = 0;
		int count2 = 0;
		for(int i = 0;i < 8;i++){
			if(color[i] != 0){
				count1 += 1;
			}
			if(color2[i] != 0){
				count2 += 1;
			}
		}
		System.out.println(String.valueOf(count1) + " " + String.valueOf(count2));

	}

}