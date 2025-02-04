
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] red = new int[N][4];
		int[][] blue = new int[N][4];

		for(int i = 0 ; i < N ; i++){
			red[i][0] = sc.nextInt();
			red[i][1] = sc.nextInt();
			red[i][2] = (red[i][0]-0) + (red[i][1]-0);
			red[i][3] = 0;
		}
		for(int i = 0 ; i < N ; i++){
			blue[i][0] = sc.nextInt();
			blue[i][1] = sc.nextInt();
			blue[i][2] = (200-blue[i][0]) + (200-blue[i][1]-0);
			blue[i][3] = 0;
		}

		sc.close();

	    Arrays.sort(red, new Comparator<int[]>() {
	        public int compare(int[] o1, int[] o2) {
	            return o2[2] - o1[2];
	        }
	    });

	    Arrays.sort(blue, new Comparator<int[]>() {
	        public int compare(int[] o1, int[] o2) {
	            return o2[2] - o1[2];
	        }
	    });
	    int count = 0;
		for(int i = 0 ; i < N ; i++){
			for(int j = 0 ; j < N ; j++){
				if(red[i][0]-blue[j][0] < 0 && red[i][1]-blue[j][1] < 0 && red[i][3] == 0 && blue[j][3] == 0){
					red[i][3] = 1;
					blue[j][3] = 1;
					count++;
				}
			}
		}
		System.out.println(count);


/*
		for(int i = 0 ; i < N ; i++){
			for(int j = 0 ; j < 4 ; j++){
			System.out.print(red[i][j] + " ");
			}
			System.out.println("");
		}

		for(int i = 0 ; i < N ; i++){
			for(int j = 0 ; j < 4 ; j++){
			System.out.print(blue[i][j] + " ");
			}
			System.out.println("");
		}
*/



	}

}