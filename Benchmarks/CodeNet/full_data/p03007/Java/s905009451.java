import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        
        int minIndex = 0;
        int min = a.get(minIndex);

        int index = 0;
        while (index < n) {
            if (min > a.get(index)) {
                min = a.get(index);
                minIndex = index;
            }
            index++;
        }
        a.remove(minIndex);

        int result = min;
        index = 0;
        while (index < n - 2) {
            result = result - a.get(index);
            index++;
        }
        System.out.println(a.get(index) - result);

        index = 0;
        while (index < n-1) {
            System.out.println(a.get(index) + " " + min);
            min = min - a.get(index);
            index++;
        }
	}
}
