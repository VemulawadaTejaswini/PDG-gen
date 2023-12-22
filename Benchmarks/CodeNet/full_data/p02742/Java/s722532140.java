/*
int a[] = new int[n];
String line = br.readLine(); // to read multiple integers line
String[] strs = line.trim().split("\\s+");
for (int i = 0; i < n; i++) {
    a[i] = Integer.parseInt(strs[i]);
}*/

/*
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
int arr[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
*/



import java.util.*;
import java.io.*;
public class cp {
    public static void main (String[]args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int possibleMoves = 0;
        int boardSize = arr[0]*arr[1];

        while(boardSize>=9) {
            boardSize-=9;
            possibleMoves+=5;

        if(boardSize%2==0 && boardSize>2) {
            possibleMoves = possibleMoves + 1;
        }
        else if(boardSize%3==0 && boardSize>2) {
            possibleMoves = possibleMoves + 1;
        }
        }
       System.out.println(possibleMoves);
    }
}    
