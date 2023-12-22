import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] monsters=new int[n+1];
		int[] heroes=new int[n];
		int count=0;
		for(int i=0;i<n+1;i++){
			monsters[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			heroes[i]=scan.nextInt();
		}

		for(int i=0;i<n;i++){
			if(heroes[i]>monsters[i]){
				count+=monsters[i];
				heroes[i]-=monsters[i];
				if(monsters[i+1]>heroes[i]){
					count+=heroes[i];
					monsters[i+1]-=heroes[i];
				}else{
					count+=monsters[i+1];
					monsters[i+1]=0;
				}

			}else{
				count+=heroes[i];
			}
		}
		System.out.println(count);

	}
}
