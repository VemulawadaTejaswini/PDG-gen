import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

		try {

String num = bf.readLine();
			int number = Integer.parseInt(num);

			//int number = bf.read();


			String str=bf.readLine();




		int sum=0;

		int z=0;


		//
			while(z<number) {

				int count=0;
				int count2=0;



					while(str.charAt(z)=='#') {
						count++;
						z++;
						if(z>=number) break;}

						if(z>=number) break;
					while(str.charAt(z)=='.' && count2<count) {
						count2++;
						sum++;
						z++;
						if(z>=number) break;
					}


					//z--;



	}
			//sc.close();
		System.out.print(sum);}catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

}}
