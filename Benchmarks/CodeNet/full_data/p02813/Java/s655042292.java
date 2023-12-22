

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        String str = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        sc.close();
        int [] seed = getSeed(n);
        int[] perm = new int[seed.length];
        boolean[] used = new boolean[seed.length];
        buildPerm(seed, perm, used, 0);
        int [] p_array = comvertIntArray(p);
        int [] q_array = comvertIntArray(q);
        int p_num = comparePermArray(p_array,1);
        int q_num = comparePermArray(q_array,1);;
        System.out.println(Math.abs(p_num-q_num));
	}

	private static void buildPerm(int[] seed, int[] perm, boolean[] used, int index) {
	    if (index == seed.length) {
	        procPerm(perm);
	        return;
	    }

	    for (int i = 0; i < seed.length; ++i) {
	        if (used[i]) { continue; }
	        perm[index] = seed[i];
	        used[i] = true;
	        buildPerm(seed, perm, used, index + 1);
	        used[i] = false;
	    }
	}

	private static ArrayList<int[]> perm_array = new ArrayList<int[]>();
	private static void procPerm(int[] perm) {
//	    System.out.println(Arrays.toString(perm));
	    perm_array.add(perm.clone());
	}

	private static int[] getSeed(int i) {
	    int [] array = new int[i];
	    for(int j=0;j<array.length;j++) {
	        array[j] = j+1;
	    }
	    return array;
	}

	private static int comparePermArray(int[] array,int j) {
		for(int[] i:perm_array) {
        	if(Arrays.compare(array, i)==0) {return j;}
        	j++;
        }
		return 0;
	}

	private static int[] comvertIntArray(String str) {
		String[] srt_array = str.split(" ");
		int[] int_array = new int[srt_array.length];
		int idx = 0;
		for(String tmp:srt_array) {
			int_array[idx] = Integer.parseInt(tmp);
			idx++;
		}
		return int_array;
	}
}
