public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		String [] ary = s.split(" ");
		int height = Integer.parseInt(ary[0]);
		int width = Integer.parseInt(ary[1]);
		int [][] data = new int[height][width];
 		for(int i = 0; i < height; i++) {
			String strData  = sc.nextLine();
			String[] dataAry = strData.split(" ");
			for(int j = 0; j < width; j++) {
				data[i][j] = Integer.parseInt(dataAry[j]);
			}
		}
 		int sumG = 0;
 		for(int i = 0; i < data.length; i++) {
 			int sum = 0;
 			for(int j = 0; j <data[i].length; j++) {
 				System.out.print(data[i][j] + " ");
 				sum += data[i][j];
 			}
 			System.out.println(sum);
 		}
 		for(int i = 0; i < width; i++) {
 			int sum = 0;
 			for(int j = 0; j < height; j++) {
 				sum += data[j][i];
 			}
 			sumG += sum;
 			System.out.print(sum + " ");
 		}
 		System.out.println(sumG);
	}
}
