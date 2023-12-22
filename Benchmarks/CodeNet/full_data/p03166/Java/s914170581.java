import javax.swing.*;
import java.io.*;
import java.sql.Struct;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer>[] graph = new ArrayList[n];
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<Integer>();
            arr[i] = -1;
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            graph[start - 1].add(end - 1);
        }

        int length = 0;
        for (int i = 0; i < n; i++) {
           int curLength = calculate(i, graph, arr);
           if (curLength > length) {
               length = curLength;
            }
        }
        System.out.println(length);
    }

    static int calculate(int vertex,  ArrayList<Integer>[] graph, int[] arr) {
        if (arr[vertex] != -1) {
            return arr[vertex];
        }
        int length = 0;
        for(int i = 0; i < graph[vertex].size(); i++) {
            int neghbourLength = calculate(graph[vertex].get(i), graph, arr);
            if (neghbourLength + 1 > length) {
                length = neghbourLength + 1;
            }
        }
        arr[vertex] = length;
        return length;
    }
}