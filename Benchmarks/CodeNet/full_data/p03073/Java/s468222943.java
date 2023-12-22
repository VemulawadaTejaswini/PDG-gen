import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int ans;
		int count = S.length();
		String[] colorArray = S.split("");;

		int start0 = 0;
		int start1 = 0;

		String lastLetter = "0";
		for(int i=0; i<count; i++){
			if(!colorArray[i].equals(lastLetter)){
				start0++;
			}
			if(lastLetter.equals("0")){
				lastLetter = "1";
			}else{
				lastLetter = "0";
			}
		}

		lastLetter = "1";

		for(int i=0; i<count; i++){
			if(!colorArray[i].equals(lastLetter)){
				start1++;
			}
			if(lastLetter.equals("0")){
				lastLetter = "1";
			}else{
				lastLetter = "0";
			}
		}


		System.out.println(Math.min(start0, start1));

	}


}
