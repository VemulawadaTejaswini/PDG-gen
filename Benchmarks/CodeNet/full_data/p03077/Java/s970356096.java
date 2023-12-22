import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long A = scan.nextLong();
		long B = scan.nextLong();
		long C = scan.nextLong();
		long D = scan.nextLong();
		long E = scan.nextLong();

		long Now1 = N;
		long Now2 = 0;
		long Now3 = 0;
		long Now4 = 0;
		long Now5 = 0;
		long Now6 = 0;
		long count = 0;
		boolean Continue = true;
		while(Continue){

			count++;

			
			if(Now5>0) {//Now5に人がいるとき
				//System.out.print("Now5 ");
				if(Now5-E>=0) {//Now5からE人いなくなってもマイナスにならない。
					Now6 = Now6+E;
					Now5=Now5-E;
				}else {        //Now5から全員がいなくなる。
					Now6 = Now6+Now5;
					Now5 = 0;
				}
			}
			
			if(Now4>0) {//Now4に人がいるとき
				//System.out.print("Now4 ");
				if(Now4-D>=0) {//Now4からD人いなくなってもマイナスにならない。
					Now5 =Now5+D;
					Now4=Now4-D;
				}else {        //Now4から全員がいなくなる。
					Now5 = Now5+Now4;
					Now4 = 0;
				}
			}
			if(Now3>0) {//Now3に人がいるとき
				//System.out.print("Now3 ");
				if(Now3-C>=0) {//Now3からC人いなくなってもマイナスにならない。
					Now4 =Now4+ C;
					Now3=Now3-C;
				}else {        //Now3から全員がいなくなる。
					Now4 = Now4 + Now3;
					Now3 = 0;
				}
			}
			if(Now2>0) {//Now2に人がいるとき
				//System.out.print("Now2 ");
				if(Now2-B>=0) {//Now2からB人いなくなってもマイナスにならない。
					Now3 =Now3+B;
					Now2=Now2-B;
				}else {        //Now2から全員がいなくなる。
					Now3 = Now3+ Now2;
					Now2 = 0;
				}
			}
			if(Now1>0) {//Now1に人がいるとき
				//System.out.print("Now1 ");
				if(Now1-A>=0) {//Now1からA人いなくなってもマイナスにならない。
					Now2  =Now2+A;
					Now1=Now1-A;
				}else {        //Now1から全員がいなくなる。
					Now2 = Now2 + Now1;
					Now1 = 0;
				}
			}
			if(Now6==N) {
				Continue = false;
			}
			System.out.print(Now1+" ");
			System.out.print(Now2+" ");
			System.out.print(Now3+" ");
			System.out.print(Now4+" ");
			System.out.print(Now5+" ");
			System.out.println(Now6+" ");

			//LocalDateTime date1 = LocalDateTime.now();
			//LocalDateTime date2 = LocalDateTime.now();
			boolean goon = true;
			//long i = 0;
			//while(goon) {
				//i++;
				//if(i>1000000000) {
					//goon = false;
				//}
			//}

		}



		System.out.println(count);

	}


}