import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N =	sc.nextInt();
	HashSet<String>	set = new HashSet<String>();
	set.add(sc.next());
	System.out.println((set.size()==3)?"Three":"Four");
    }
}