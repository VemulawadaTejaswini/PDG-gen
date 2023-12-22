import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        int q = stdIn.nextInt();
        boolean[][] matrix = new boolean[n][n];
        int a, b;
        for(int i=0; i<n-1; i++){
            a = stdIn.nextInt();
            b = stdIn.nextInt();
            matrix[a-1][b-1] = true;
            matrix[b-1][a-1] = true;
        }
        int[] acc = new int[n];
        int p, x;
        for(int i=0; i<q; i++){
            p = stdIn.nextInt();
            x = stdIn.nextInt();
            acc[p-1] += x;
        }

        boolean[] visited = new boolean[n];
        int[] diff = new int[n];
        int[] ans = new int[n];
        ArrayList<Integer> openList = new ArrayList<Integer>();
        openList.add(0);

        int nodeIdx;
        while(!openList.isEmpty()){
            nodeIdx = openList.remove(0);
            visited[nodeIdx] = true;
            ans[nodeIdx] = diff[nodeIdx] + acc[nodeIdx];
            ArrayList<Integer> children = getChildren(nodeIdx, matrix, visited);
            for(int i: children){
                diff[i] = ans[nodeIdx];
            }
            openList = concat(openList, children);
        }

        for(int i=0; i<n; i++){
            System.out.println(ans[i]);
        }
    }

    private static ArrayList<Integer> getChildren(int n, boolean[][] matrix, boolean[] visited){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<matrix[n].length; i++){
            if(matrix[n][i] && !visited[i])
                list.add(i);
        }
        return list;
    }

    private static ArrayList<Integer> concat(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(a);
		list.addAll(b);
		return list;
    }
}