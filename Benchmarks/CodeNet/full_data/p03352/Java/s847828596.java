import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int x = sc.nextInt();
		for(int i=1; i<=x; i++){
			if(i%Math.sqrt(i)==0){
				if(i>=max){
					max = i;
				}
			}
		}
		System.out.println(max);	
	}
}