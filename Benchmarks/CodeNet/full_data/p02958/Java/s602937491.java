import java.util.*;

public class Main {
	int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		if(sort(a) < 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}
	
	public static int sort(int[] array){
		int count = 0;
        for(int i = 0; i < array.length; i++ ){
            int index = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[index]){
                    index = j;
                }
            }
            if(i != index){
                int tmp = array[index];
                array[index] = array[i];
                array[i] = tmp;
                count++;
            }
        }
        return count;
    }
}
