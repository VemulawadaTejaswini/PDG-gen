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
		ArrayDeque<Bomb> bombs = new ArrayDeque<>();
		long total = 0;
		long damage = 0;
		for (int i = 0; i < n; i++) {
		    while (bombs.size() > 0 && bombs.peek().position < monsters[i].position) {
		        damage -= bombs.poll().power;
		    }
		    monsters[i].power -= damage;
		    if (monsters[i].power > 0) {
		        int count = (int)((monsters[i].power + a - 1) / a);
		        total += count;
		        bombs.add(new Bomb(monsters[i].position + d * 2, count * a));
		        damage += count * a;
		    }
		}
		System.out.println(total);
   }
   
   static class Monster implements Comparable<Monster> {
       int position;
       long power;
       
       public Monster(int position, long power) {
           this.position = position;
           this.power = power;
       }
       
       public int compareTo(Monster another) {
           return position - another.position;
       }
   }
   
   static class Bomb implements Comparable<Bomb> {
       int position;
       long power;
       
       public Bomb(int position, long power) {
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
               return (int)(power - another.power);
           } else {
               return position - another.position;
           }
       }
   }
}
