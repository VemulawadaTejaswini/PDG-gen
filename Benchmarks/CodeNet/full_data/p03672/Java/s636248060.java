import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		
		StringBuilder sb1 = new StringBuilder();
		while(sb.length() > 0){
			sb.delete(sb.length()-1, sb.length());

			if (sb.length() % 2 == 1){ continue; }
			sb1.delete(0, sb1.length());
			sb1.append(sb.substring(sb.length()/2));
			sb1.append(sb.substring(0, sb.length()/2));

			if(sb.toString().equals(sb1.toString())){
				break;
			}
//			System.out.println(sb + " " + sb1);

		}


//		System.out.println(sb + " " + sb1);
		System.out.println(sb.length());
	return;
	}

}
