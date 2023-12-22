import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashSet<Long> set = new HashSet<Long>();
	int N =	Integer.parseInt(sc.next());
	for(int i = 0; i<N; i++) {
            long num = Long.parseLong(sc.next());
	    if(set.contains()) {
		set.remove(num);
            }else{
		set.add(num);
            }
        }
	System.out.println(set.size());

    }
}