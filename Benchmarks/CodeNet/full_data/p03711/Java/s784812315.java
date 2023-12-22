import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		String xp = null;
		String yp = null;

        int[] first ={1, 3, 5, 7, 8, 10, 12};
		int[] second ={4, 6, 9, 11};
		int[] third ={2};

		for(int i = 0; i<first.length; i ++){
			if(first[i] == x){
				 xp = "F";
				 }for(int j = 0; j<first.length; j ++){
				if(first[j] == y){
					 yp = "F";
					 }
				}
			}

		for(int i = 0; i<second.length; i ++){
			if(second[i] == x){
				 xp = "S";
				 }for(int j = 0; j<second.length; j ++){
				if(second[j] == y){
					 yp = "S";
					 }
				}
			}

		for(int i = 0; i<third.length; i ++){
			if(third[i] == x){
				 xp = "T";
				 }for(int j = 0; j<third.length; j ++){
				if(third[j] == y){
					 yp = "T";
					 }
				}
			}
				if(xp.equals(yp)){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}


	}

}


