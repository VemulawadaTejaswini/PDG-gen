import java.util.Scanner;

public class Main {
	
	static int sum;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		sum = 0;
		int nElems = 0;
		int[] strlong = new int[3];
		
		strlong[0] = sc.nextInt();
		strlong[1] = sc.nextInt();
		strlong[2] = sc.nextInt();
		
		for(int j = 0; j < strlong.length; j++){
			sum += strlong[j];
			if(strlong[j] == 5){
				nElems++;
			}
		}
		if(nElems == 2){
			ans();
		}else{
			System.out.println("NO");
		}
	}
	
	public static void ans(){
		if(sum == 17){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
