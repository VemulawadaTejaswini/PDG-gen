import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Person[] persons = new Person[n];
		for (int i = 0; i < n; i++) {
		    persons[i] = new Person(i, sc.nextInt());
		}
		Arrays.sort(persons);
		long[][] dp = new long[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
		    for (int j = 0; j <= i; j++) {
		        if (j != 0) {
		            dp[j][i - j] = Math.max(dp[j][i - j], dp[j - 1][i - j] + Math.abs(j - 1 - persons[i - 1].idx) * (long)persons[i - 1].value);
		        }
		        if (j != i) {
		            dp[j][i - j] = Math.max(dp[j][i - j], dp[j][i - j - 1] + Math.abs(n - (i - j) - persons[i - 1].idx) * (long)persons[i - 1].value);
		        }
		    }
		}
		long max = 0;
		for (int i = 0; i <= n; i++) {
		    max = Math.max(max, dp[i][n - i]);
		}
		System.out.println(max);
   }
   
   static class Person implements Comparable<Person>{
       int idx;
       int value;
       
       public Person(int idx, int value) {
           this.idx = idx;
           this.value = value;
       }
       
       public int compareTo(Person another) {
           return another.value - value;
       }
   }
}

