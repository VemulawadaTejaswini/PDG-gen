import java.util.HashMap;
import java.util.Scanner;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        int l[] = new int[Q];
        int r[] = new int[Q];
        for (int i = 0; i < Q; i++) {
        	l[i] = sc.nextInt();
        	r[i] = sc.nextInt();
        }
        String[] arr = S.split("");

        HashMap<String, Integer> countA = new HashMap<>();

        for (int i = 0; i < Q; i++) {
        	int count = 0;
        	for (int j = l[i]-1; j < r[i]; j++) {
        		//System.out.println("j"+j);
        		if (arr[j].equals("A")) {
        			if ((j+1) < r[i] && arr[j+1].equals("C")) {

        			count++;
        		}
        		}
        	}
        	System.out.println(count);
//        	String s = String.valueOf(l[i]);
//        	String s1 = String.valueOf(r[i]);
//        	String set = s + s1;
//        	countA.put(set, count);
        }

    }

}