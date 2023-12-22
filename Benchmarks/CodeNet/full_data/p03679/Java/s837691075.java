import java.io.BufferedReader;

import java.io.InputStreamReader;







public class Mon3 {




	public static void main(String[] args) {

		int d,A,B;

		int min = 1;

		Double max = Math.pow(10, 9);




		String str;

		InputStreamReader inp = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(inp);




		try {

			str = br.readLine();

			d = Integer.parseInt(str);

			while(d < min){

				System.out.println("1以上の整数を入力してください");

				str = br.readLine();

				d = Integer.parseInt(str);

			}

			str = br.readLine();

			A = Integer.parseInt(str);

			while(max < A){

				System.out.println("10^9以下の整数を入力してください");

				str = br.readLine();

				A = Integer.parseInt(str);

			}

			str = br.readLine();

			B = Integer.parseInt(str);

			while(max < A){

				System.out.println("10^9以下の整数を入力してください");

				str = br.readLine();

				B = Integer.parseInt(str);

			}

			Mon3 mon3 = new Mon3();

			mon3.method(d,A,B);




		} catch (Exception e) {

			System.out.println("数字以外の入力がありました");

			e.printStackTrace();

		}




	}




	void method(int d,int A,int B){

		int deadLine;

		deadLine = -A+B;

		if(deadLine <= 0){

			System.out.println("delicious");

		}

		if(0 < deadLine && deadLine <=d ){

			System.out.println("Safe");

		}

		if(d < deadLine  ){

			System.out.println("dangerous");

		}

	}

}