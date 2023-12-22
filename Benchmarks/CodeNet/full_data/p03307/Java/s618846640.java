import java.util.*;

public class Main{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		if(n==1 || n==2){
			System.out.println(2);
		}else{
			for(int i=n;;i++){
				if(i%2==0 && i%n==0){
					System.out.println(i);
					break;
				}
			}

		}


	}
}
