import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] a = new int[5];
	int[] b = new int[5];

	for(int i = 0; i<5; i++) {
	    a[i] = sc.nextInt();
	    b[i] = a[i];
	}
	int k = sc.nextInt();
	for(int i = 0; i<5; i++) {
            for(int j = 0; j<5; j++) {
		if(Math.abs(a[i]-b[j]) > k) {
		    System.out.println(":(");
		    return;
		}
            }
        }
	System.out.println("Yay!");
    }
}