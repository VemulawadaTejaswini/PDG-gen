import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Person[] arr = new Person[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = new Person(i + 1, sc.nextInt());
		}
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    if (i != 0) {
		        sb.append(" ");
		    }
		    sb.append(arr[i].idx);
		}
		System.out.println(sb);
   }
   
   static class Person implements Comparable<Person> {
       int idx;
       int num;
       
       public Person (int idx, int num) {
           this.idx = idx;
           this.num = num;
       }
       
       public int compareTo(Person another) {
           return num - another.num;
       }
   }
}
