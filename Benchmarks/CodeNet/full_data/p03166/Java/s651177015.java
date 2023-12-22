import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] v = new int[2][m];
        int[] v1Sorted = new int[m];
        for(int i = 0; i < m; i++) {
        	v[0][i] = sc.nextInt()-1;
        	v[1][i] = sc.nextInt()-1;
        	v1Sorted[i] = v[1][i];
        }

        Arrays.sort(v1Sorted);


        HashMap<Integer,ArrayList<Integer>> rootToSub = new HashMap<Integer,ArrayList<Integer>>(n);
        ArrayList<Integer> farstRoot = new ArrayList<Integer>();
        farstRoot.add(v[1][0]);
        rootToSub.put(new Integer(v[0][0]),farstRoot);

        ArrayList<Integer> subNode = new ArrayList<Integer>();
    	subNode.add(v1Sorted[0]);
        for(int i = 1; i < m; i++) {

        	if(rootToSub.containsKey(v[0][i])) {
        		rootToSub.get(v[0][i]).add(v[1][i]);
        	}else {
        		ArrayList<Integer> newRoot = new ArrayList<Integer>();
        		newRoot.add(v[1][i]);
        		rootToSub.put(v[0][i], newRoot);
        	}

        	if(v1Sorted[i] != subNode.get(0)){
        		subNode.add(0,v1Sorted[i]);
        	}
        }

        ArrayList<Integer> rootNode = new ArrayList<Integer>();
        for(int i = n-1; i > subNode.get(0); i--) {
        	rootNode.add(0,i);
        }
        for(int i = 0; i < subNode.size()-1; i++) {
        	for(int j = subNode.get(i)-1; j > subNode.get(i+1); j--) {
        		rootNode.add(0,j);
        	}
        }
        for(int i = subNode.get(subNode.size()-1)-1; i >= 0; i--) {
        	rootNode.add(0,i);
        }

        ArrayList<Integer> before = new ArrayList<Integer>(rootNode);

        int max;
        for(max = 0; max <= n; max++) {
        	ArrayList<Integer> after = new ArrayList<Integer>();
        	ArrayList<Integer> dltRootNode = new ArrayList<Integer>();
        	for (int a : before) {
        		if(rootToSub.containsKey(a)) {
        			after.addAll(rootToSub.get(a));
        		}
            }

        	if(after.isEmpty()) {
        		break;
        	}

        	before.clear();
        	before.addAll(after);
        }

        System.out.println(max);

    }

}