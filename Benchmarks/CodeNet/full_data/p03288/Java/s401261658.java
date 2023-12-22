import java.util.*;
class Main{
	public static void main(String[] argv){
		rated();
	}
	static void rated(){
		Scanner sc = new Scanner(System.in);
		int rate = sc.nextInt();
		if (rate<1200){
			System.out.println("ABC");
		}else{
			if(rate<2800){
				System.out.println("ARC");
			}else{
				System.out.println("AGC");
			}
		}
	}
}