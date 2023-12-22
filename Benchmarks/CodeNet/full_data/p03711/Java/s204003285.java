
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] strlist = str.split(" ");
		int x = Integer.parseInt(strlist[0]);
		int y = Integer.parseInt(strlist[1]);
		int[] A = {1, 3, 5, 7, 8,10, 12};
		int[] B = {4, 6, 9, 11};
		ArrayList<Integer> listA = toList(A);
		ArrayList<Integer> listB = toList(B);

		String answer = "No";
		if(x == 2 && y == 2){
			answer = "Yes";
		}else if(listB.contains(x) && listB.contains(y)){
			answer = "Yes";
		}else if(listA.contains(x) && listA.contains(y)){
			answer = "Yes";
		}
		System.out.println(answer);
	}

	public static ArrayList<Integer> toList(int[] list){
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		for(int i=0; i<list.length; i++){
			returnList.add(list[i]);
		}
		return returnList;
	}

}
