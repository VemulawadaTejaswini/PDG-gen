import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int a = sc.nextInt();
		Monster[] monsters = new Monster[n];
		for (int i = 0; i < n; i++) {
		    monsters[i] = new Monster(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(monsters);
		TreeSet<Bomb> bombs = new TreeSet<>();
		long total = 0;
		for (int i = 0; i < n; i++) {
		    while (bombs.size() > 0 && bombs.first().position < monsters[i].position) {
		        bombs.pollFirst();
		    }
		    for (Bomb b : bombs) {
		        monsters[i].power -= b.power;
		        if (monsters[i].power <= 0) {
		            break;
		        }
		    }
		    if (monsters[i].power > 0) {
		        int count = (monsters[i].power + a - 1) / a;
		        total += count;
		        bombs.add(new Bomb(monsters[i].position + d * 2, count * a));
		    }
		}
		System.out.println(total);
   }
   
   static class Monster implements Comparable<Monster> {
       int position;
       int power;
       
       public Monster(int position, int power) {
           this.position = position;
           this.power = power;
       }
       
       public int compareTo(Monster another) {
           return position - another.position;
       }
   }
   
   static class Bomb implements Comparable<Bomb> {
       int position;
       int power;
       
       public Bomb(int position, int power) {
           this.position = position;
           this.power = power;
       }
       
       public int hashCode() {
           return position;
       }
       
       public boolean equals(Object o) {
           Bomb b = (Bomb) o;
           return b.position == position && b.power == power;
       }
       
       public int compareTo(Bomb another) {
           if (another.position == position) {
               return power - another.power;
           } else {
               return position - another.position;
           }
       }
   }
}
