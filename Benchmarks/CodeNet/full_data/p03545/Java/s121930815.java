import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 0;i<4;i++){
			array.add(Integer.parseInt(a.substring(i,i+1)));
		}
		String[] param = a.split("");
		if(array.get(0) + array.get(1) + array.get(2) + array.get(3) == 7){ //+++

			System.out.println(array.get(0) + "+" + array.get(1) + "+" + array.get(2) + "+" + array.get(3) +"=7" );

		}else if(array.get(0) + array.get(1) + array.get(2) - array.get(3) == 7){ //++-

			System.out.println(array.get(0) + "+" + array.get(1) + "+" + array.get(2) + "-" + array.get(3) +"=7" );

		}else if(array.get(0) + array.get(1) - array.get(2) - array.get(3) == 7){ //+--

			System.out.println(array.get(0) + "+" + array.get(1) + "-" + array.get(2) + "-" + array.get(3) +"=7" );

		}else if(array.get(0) + array.get(1) - array.get(2) + array.get(3) == 7){ //+-+

			System.out.println(array.get(0) + "+" + array.get(1) + "-" + array.get(2) + "+" + array.get(3) +"=7" );

		}else if(array.get(0) - array.get(1) + array.get(2) + array.get(3) == 7){ //-++

			System.out.println(array.get(0) + "-" + array.get(1) + "+" + array.get(2) + "+" + array.get(3) +"=7" );

		}else if(array.get(0) - array.get(1) - array.get(2) + array.get(3) == 7){ //--+

			System.out.println(array.get(0) + "-" + array.get(1) + "-" + array.get(2) + "+" + array.get(3) +"=7" );

		}else if(array.get(0) - array.get(1) - array.get(2) - array.get(3) == 7){ //---

			System.out.println(array.get(0) + "-" + array.get(1) + "-" + array.get(2) + "-" + array.get(3) +"=7" );

		}else if(array.get(0) - array.get(1) + array.get(2) - array.get(3) == 7){ //-+-

			System.out.println(array.get(0) + "-" + array.get(1) + "+" + array.get(2) + "-" + array.get(3) +"=7" );
		}
	}
}