import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int min = n;
		int tmp = 0;

		for(int i=0; i<n; i++){
			tmp = 0;
			for(int j=0; j<n; j++){
				if(j<i && str.charAt(j)=='W'){
					tmp++;
				}else if(j>i && str.charAt(j)=='E'){
					tmp++;
				}
			}
			if(tmp<min){
				min = tmp;
			}
		}
		System.out.println(min);
	}
}