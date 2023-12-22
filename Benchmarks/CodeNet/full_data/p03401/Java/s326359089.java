import java.util.Scanner;
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mapNum=sc.nextInt();

		int point[]=new int[mapNum];
		for(int i=0;i<mapNum;i++) {
			point[i]=sc.nextInt();
		}
		int distance=0;
		int front=0;
		int j=0;
		for(int i=0;i<mapNum;i++) {
			for(j=0;j<mapNum;j++) {
				if(j==i) {
					continue;
				}else {
						distance+=Math.abs(point[j]-front);
					front=point[j];
				}
			}
			distance+=Math.abs(front);
			System.out.println(distance);
			distance=0;
			front=0;
		}
	}
}