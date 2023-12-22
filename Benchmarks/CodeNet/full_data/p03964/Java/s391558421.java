import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] ratio = new int[n][2];
		int t = 0;
		int a = 0;
		for (int i=0;i<n;i++){
			ratio[i][0] = sc.nextInt();
			ratio[i][1] = sc.nextInt();
		}
		for (int i=0;i<n;i++){
			if (i==0){
				t = ratio[0][0];
				a = ratio[0][1];
			}
			else{
				if (ratio[i][0]==1&&ratio[i][1]==1){
					if (t>a){
						a = t;
					}
					else{
						t = a;
					}
				}
				else{
					for (int j=1;;j++){
						if (((ratio[i][0])*j)>=t&&((ratio[i][1])*j)>=a){
							t = (ratio[i][0])*j;
							a = (ratio[i][1])*j;
							break;
						}
					}
				}
			}
		}
		System.out.println(a+t);
	}

}