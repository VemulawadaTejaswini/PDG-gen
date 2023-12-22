
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

		Vector<Integer> colorValue = new Vector<Integer>();

		colorValue.add(a[n - 1]);

		for(int i = n - 2; i >= 0; i--){
			//Collections.sort(colorValue);

			if(a[i] >= colorValue.get(colorValue.size() - 1)){
				colorValue.add(a[i]);
			}
			else {
				int tmpIndex = Collections.binarySearch(colorValue, a[i]);
//				System.out.println("tmpIndex "+tmpIndex);
				if(tmpIndex < 0){
					tmpIndex = -tmpIndex - 1;
//					System.out.println("modified index "+tmpIndex);
					colorValue.set(tmpIndex, a[i]);
				}
				else {
					colorValue.set(tmpIndex + 1, a[i]);
				}
			}

			//debug
			for(int j = 0; j < colorValue.size(); j++){
//				System.out.print(colorValue.get(j)+" ");
			}
//			System.out.println();
		}

		System.out.println(colorValue.size());
	}

}
