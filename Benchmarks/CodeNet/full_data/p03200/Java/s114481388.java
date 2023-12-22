import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str=sc.nextLine();
		char[] cArr=str.toCharArray();
		int count=0;
		int res=0;
		for(int i=cArr.length-1;i>=0;i--){
			if(cArr[i]=='B'){
				res+=count;
			}
			else{
				count++;
			}
		}
		System.out.println(res);
		

	}

}
