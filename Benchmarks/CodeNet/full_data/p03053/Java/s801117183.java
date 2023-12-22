package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        byte a[][] = new byte[h][w];
        for(int i = 0; i < h; i++){
        	String s = sc.next();
        	byte sb[] = s.getBytes();
        	for (int j = 0; j < w; j++){
        		a[i][j] = sb[j];
        	}
        }

        int depth[][] = new int[h][w];
        Deque<Integer> q = new ArrayDeque<Integer>();
        for(int i = 0; i < h; i++){
        	for(int j = 0; j < w; j++){
                if (a[i][j] == (byte)('#') ){
                	depth[i][j] = 0;
                	q.addLast(i * 1000 + j);
                }
        	}
        }
        while(! q.isEmpty()){
        	Integer r = q.removeFirst();
        	int i = r / 1000;
        	int j = r % 1000;
        	if (i > 0 && a[i-1][j] == (byte)('.') && depth[i-1][j] == 0){
        		depth[i-1][j] = depth[i][j] + 1;
        		q.addLast(i * 1000 - 1000 + j);
        	}
        	if (i < h-1 && a[i+1][j] == (byte)('.') && depth[i+1][j] == 0){
        		depth[i+1][j] = depth[i][j] + 1;
        		q.addLast(i * 1000 + 1000 + j);
        	}
        	if (j > 0 && a[i][j-1] == (byte)('.') && depth[i][j-1] == 0){
        		depth[i][j-1] = depth[i][j] + 1;
        		q.addLast(i * 1000 + j - 1);
        	}
        	if (j < w-1 && a[i][j+1] == (byte)('.') && depth[i][j+1] == 0){
        		depth[i][j+1] = depth[i][j] + 1;
        		q.addLast(i * 1000 + j + 1);
        	}
        }
        int ret = 0;
        for(int i = 0; i < h; i++){
        	for(int j = 0; j < w; j++){
        		if (ret < depth[i][j]) ret = depth[i][j];
        	}
    	}
        System.out.println(ret);
	}
}
