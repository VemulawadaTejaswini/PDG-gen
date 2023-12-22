package Nov01.A;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

/**
 * Created by pc on 2019/12/01.
 */
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[][] Days= {{0,0},{0,0}};

		for(int i = 0; i<2; i++){
			Days[i][0] = sc.nextInt();
			Days[i][1] = sc.nextInt();
		}

		boolean isLastday = false;
		if(Days[0][0]  != Days[1][0]){
			isLastday = true;
		}
		System.out.print(isLastday ? 1 :0);

	}
}
