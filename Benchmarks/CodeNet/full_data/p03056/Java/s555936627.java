//package at_coder;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] board = new String[H];
		for(int i=0;i<H;i++) {
			String line = sc.next();
			board[i] = line;
		}

		sc.close();

		Calc calc = new Calc();
		board = calc.cmprsedBoard(calc.cnvrtedBoard(calc.cmprsedBoard(board)));


		System.out.println(calc.log2(board.length)+calc.log2(board[0].length()));
	}
}

class Calc {
	int log2(int length) {
		int binary = 1;
		int count = 0;
		while(length>binary) {
			binary = binary << 1;
			count++;
		}
		return count;
	}

	int min(int[] nums) {
		int min = nums[0];
		for(int num:nums)
			if(min > num)
				min = num;
		return min;
	}

	int max(int x,int y) {
		if(x>y)
			return x;
		else
			return y;
	}

	String[] cmprsedBoard(String[] board) {
		int index =0;
		int index_point = 1;
		int length = board.length;
		for(;index_point<length;index_point++) {
			if(board[index].equals(board[index_point])) {

			}else {
				index++;
				board[index] = board[index_point];
			}
		}
		return Arrays.copyOfRange(board,0,index+1);
	}

	String[] cnvrtedBoard(String[] board){
		int height = board.length;
		int width = board[0].length();
		String[] res = new String[width];

		for(int j=0;j<width;j++) {
			String line = "";
			for(int i=0;i<height;i++) {
				line += board[i].charAt(j);
			}
			res[j] = line;
		}
		return res;
	}

	int complexity(String[] board) {
		int height = board.length;
		int width = board[0].length();
		char mark = board[0].charAt(0);
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				if(board[i].charAt(j)!=mark) {
					int[] scores = new int[height+width-2];

					for(int k=1;k<height;k++) {
						scores[k-1] = max(complexity(Arrays.copyOfRange(board,0,k)),
								complexity(Arrays.copyOfRange(board,k,height)));
					}

					String[] cnvBoard = cnvrtedBoard(board);
					for(int k=1;k<width;k++) {
						scores[k+height-2] = max(complexity(Arrays.copyOfRange(cnvBoard,0,k)),
								complexity(Arrays.copyOfRange(cnvBoard,k,width)));
					}

					return min(scores)+1;
				}
			}
		}

		return 0;

	}
}
