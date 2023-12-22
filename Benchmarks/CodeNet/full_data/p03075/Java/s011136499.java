import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int aaa[] =new int[5];
		for(int i=0;i<5;i++){
			aaa[i]=scn.nextInt();
		}
		int k=scn.nextInt();
		if(aaa[0]-aaa[1]<=k&&aaa[0]-aaa[2]<=k&&aaa[0]-aaa[3]<=k&&aaa[0]-aaa[4]<=k&&aaa[1]-aaa[2]<=k&&aaa[1]-aaa[3]<=k&&aaa[1]-aaa[4]<=k&&aaa[2]-aaa[3]<=k&&aaa[2]-aaa[4]<=k&&aaa[3]-aaa[4]<=k){
			System.out.println("Yay!");
		}else{
			System.out.println(":(");
		}
	}

}
