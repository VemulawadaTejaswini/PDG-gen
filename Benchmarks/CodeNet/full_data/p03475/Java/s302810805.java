import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int num = input - 1;
		int[][] array = new int[num][];
		for(int i = 0; i < num; i++){
			int[] ar = new int[3];
			for(int j = 0; j < 3; j++){
				ar[j] = sc.nextInt();
			}
			array[i] = ar;
		}

		int[] timeArray = new int[num + 1];
		for(int i = 0;  i < num; i++){
			int time = array[i][0] + array[i][1];
			int j = i;
			while(j + 1 < num){
				if(time < array[j+1][1]){
					time = array[j+1][1];
				}else if(time % array[j+1][2] == 0){

				}else{
					time += time + array[j+1][2] - (time % array[j+1][2]);
				}
				time += array[j + 1][0];
				j++;
			}
			timeArray[i] = time;
		}
		timeArray[num] = 0;
		for(int i = 0; i < timeArray.length; i++){
			System.out.println(timeArray[i]);
		}
	}

}
