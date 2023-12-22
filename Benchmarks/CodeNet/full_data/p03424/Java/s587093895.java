import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		final int n = Integer.parseInt(sc.nextLine());
		String[] str = sc.nextLine().split(" ");
		boolean f =false;//Three
		for(int i=0;i<n;i++){
			if(str[i].equals("Y")){
				f=true;
				break;
			}
		}
		if(f){
			System.out.println("Four");
		}else{
			System.out.println("Three");
		}

	}
}