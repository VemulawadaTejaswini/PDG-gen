import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	static int[][] lengthGrid;
	static int[][] grid;
	static int h;
	static int w;

	static List<Entry<Integer,Integer>> pairList = new ArrayList<>();

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		h = Integer.parseInt(s[0]);
		w = Integer.parseInt(s[1]);
		int max = Integer.MAX_VALUE;
		grid = new int[h][w];
		lengthGrid = new int[h][w];
		for(int i = 0;i < h;i++){
			char[] array = sc.nextLine().toCharArray();
			for(int j =0;j<w;j++){
				grid[i][j] = array[j] == '.' ? 1 : 0;
				lengthGrid[i][j] = -1;
			}
		}
		search(0,0,0);
		/*
		for(int[] array : grid){
			for(int i : array){
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		for(int[] array : lengthGrid){
			for(int i : array){
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		*/
		if(lengthGrid[h-1][w-1] == -1){
			System.out.println(-1);
			return;
		}
		back(h-1,w-1, lengthGrid[h-1][w-1]);
		int score = 0;
		for(int i = 0;i < h;i++){
			for(int j = 0; j < w;j++){
				score += grid[i][j];
			}
		}
		System.out.println(score-1);
	}

	public static void back(int i, int j, int length){
		if(i == 0 && j == 0) return;
		grid[i][j] = 0;
		length--;
		if(i != h-1 && lengthGrid[i+1][j] == length) back(i+1,j,length);
		else if(j != w-1 && lengthGrid[i][j+1] == length) back(i,j+1,length);
		else{
			if(i > 0 && lengthGrid[i-1][j] == length) back(i-1,j,length);
			else if(j > 0)back(i,j-1,length);
		}
	}

	public static void search(int i, int j, int length){
		if(i == h || j == w) return;
		if(lengthGrid[i][j] != -1 && lengthGrid[i][j] <= length) return;
		if(grid[i][j] == 0) return;
		lengthGrid[i][j] = length;
		if(i == h-1 && j == w-1) return;
		length++;
		if(i != 0) search(i-1,j,length);
		if(j != 0) search(i,j-1,length);
		search(i+1,j,length);
		search(i,j+1,length);
	}
}