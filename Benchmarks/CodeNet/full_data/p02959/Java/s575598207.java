import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	PrintWriter out = new PrintWriter(System.out);
      	int N = sc.nextInt();
      	int[] monsters = new int[N + 1];
      	int[] strength = new int[N];
      	for (int i = 0; i < N + 1; i++) {
        	monsters[i] = sc.nextInt(); 
        }
      	for (int i = 0; i < N; i++) {
        	strength[i] = sc.nextInt(); 
        }
      	int total = 0;
      	for (int i = 0; i < N; i++) {
          	int killedFirst = (Math.min(monsters[i], strength[i]));
         	monsters[i] -= killedFirst;
          	int killedSecond = (strength[i] - killedFirst);
          	monsters[i + 1] -= killedSecond;
          	total += (killedFirst + killedSecond);
        }
      	out.println(total);
      	out.close();
    }
}