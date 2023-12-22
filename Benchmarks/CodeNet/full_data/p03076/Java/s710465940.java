import java.util.Scanner;
public class Main {
	@SuppressWarnings({ "resource"})
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] point=new int[5];
		int tmp=0,total=0;
		for(int i=0;i<5;i++){
			point[i]=scanner.nextInt();
			}
		for(int j=0;j<4;j++) {
			for(int i=0;i<4;i++) {
				if((point[i]%10<point[i+1]%10)||(point[i+1]%10==0)) {
					tmp=point[i];
					point[i]=point[i+1];
					point[i+1]=tmp;
				}

			}
		}
		for(int i=0;i<4;i++) {
			total+=point[i];
			if(point[i]%10!=0) {
				total+=10-(point[i]%10);
			}
		}
		total+=point[4];
System.out.println(total);
	}
}