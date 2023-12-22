import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double rowLength = 0;
		for(int i = 0; ; i++){
			double num = Math.pow(2, i)*x;
			if(num <= y){
				rowLength++;
			}else{
				break;
			}
		}
		System.out.println((int)rowLength);
	}
}