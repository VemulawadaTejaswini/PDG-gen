import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strArray = str.split("");
		int count = 0;

		for (int i = 0; i < strArray.length; i++) {
			count = 0;
		    for(int j = 0; j < strArray.length; j++) {
		    	if(!(strArray[i].equals(strArray[j]))) {
		    		count++;
		    	}
		    }
		    if(count % 2 == 0) {
		    	str = "Yes";
		    }else{
		    	str = "No";
		    	break;
		    }
		}
		System.out.println(str);
	}

}
