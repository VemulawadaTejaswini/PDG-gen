import java.util.Scanner;

class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		long takahashi = sc.nextLong();
		long aoki = sc.nextLong();
		long count = sc.nextLong();

		for(int i = 0; i < count; i++){
			if(takahashi > 0){
				takahashi--;
			}else if(aoki > 0){
				aoki--;
			}else{
				return;
			}
		}
		System.out.println(takahashi + " " + aoki);
	}
}