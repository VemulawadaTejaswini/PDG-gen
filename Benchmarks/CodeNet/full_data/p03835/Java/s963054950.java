import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int s = scan.nextInt();
		int count = 0;
		for(int x=0; x<=k || x<=s/3; x++){
			for(int y=0; y<=k || y<=s/3; y++){
				for(int z=0; z<=k || z<=s/3; z++){
					if(x + y + z == s){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
