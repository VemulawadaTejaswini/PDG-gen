import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String S=sc.next();

		String[] str=S.split("");

		List<String> list=Arrays.asList(str);
		List<String> cube=new ArrayList<>(list);

		int ans=0;
		boolean check=true;

		while(check) {

			if(cube.size()<2) break;

			for(int i=0;i<cube.size()-1;i++) {

				if( (cube.get(i).equals("1") && cube.get(i+1).equals("0")) || (cube.get(i).equals("0") && cube.get(i+1).equals("1")) ) {

					cube.remove(i);
					cube.remove(i);

					ans+=2;

					break;

				}

				if(i==cube.size()-2) check=false;


			}

		}


		System.out.println(ans);

		sc.close();
	}

}
