//  PDF 解法2.横に切って、その後縦に切る
import java.util.*;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();

        char[][] cake = new char[H][W];
        int[][] cutCake = new int[H][W];
        String[] str = new String[H];
        boolean hasIchigo = false;
        int a = 1;

        for (int i = 0; i < H; i++) 
        	str[i] = sc.next();

        for (int i = 0; i < H; i++) {
            String s = str[i];
            if (s.contains("#"))
            	hasIchigo = true;

            for (int j = 0; j < W; j++) {
                cake[i][j] = s.charAt(j);
  				cutCake[i][j] = a;
            }
            int k = 1;
  			while (i+k < H && !str[i+k].contains("#")) {
   				for (int l = 0; l < W; l++)
  					cutCake[i+k][l] = a;
  				k++;
  			}
  			i += k-1;
            if (hasIchigo)
            	a++;
            hasIchigo = false;
        }

        for (int i = 0; i < H; i++) {

        	String s = str[i];
        	int firstIndexOfIchigo = s.indexOf('#');
        	int lastIndexOfIchigo = s.lastIndexOf('#');
     
        	if (firstIndexOfIchigo == -1)
        		continue;

        	if (firstIndexOfIchigo == lastIndexOfIchigo)
        		continue;		

        	for (int j = 0; j < W; j++) {

        		if (j <= firstIndexOfIchigo) {

        			int k = 1;
     				while (i-k >= 0 && cutCake[i-k][j] == cutCake[i][j]) {
        				cutCake[i-k][j] = a;
        				k++;
     				}
     				k = 1;
        			while (i+k < H && cutCake[i+k][j] == cutCake[i][j]) {
        				cutCake[i+k][j] = a;
        				k++;
        			}
        			cutCake[i][j] = a;
        		}

        		if (j == firstIndexOfIchigo) {
        			if (!s.contains("#")) 
        				break;
        			s = s.replaceFirst("#", ".");
        			a++;
        			firstIndexOfIchigo = s.indexOf('#');
        			lastIndexOfIchigo = s.lastIndexOf('#');
        			if (firstIndexOfIchigo == lastIndexOfIchigo)
        				break;
        		}
        	}
        }

        for (int i = 0; i < H; i++) {
        	for (int j = 0; j < W; j++) {
        		System.out.print(cutCake[i][j] + " ");
        	}
        	System.out.println();
        }
    }
}