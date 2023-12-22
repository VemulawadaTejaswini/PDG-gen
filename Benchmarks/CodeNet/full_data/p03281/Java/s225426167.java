import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=0;
		int c=0;
		
		for(int i=1;i<=a;i++){
			if (i%2==0){
				continue;
			}
//			System.out.println("i="+i);
			b=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					b++;
				}
			}
//			System.out.println("	b="+b);
			if(b==8){
//				System.out.println("iiiii="+i);
				c++;
			}
		}
		
		
		
		
		
		System.out.println(c);
		
		
		
		
	}

}
