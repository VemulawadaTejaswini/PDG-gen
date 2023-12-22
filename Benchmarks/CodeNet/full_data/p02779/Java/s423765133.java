import java.util.Scanner;


public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < n; i++){
			list[i] = sc.nextInt();
		}

		quick_sort(list, 0, list.length-1);

		boolean result = false;
		for(int i = 1; i < n; i++){
			if(list[i-1] == list[i]) {
				result = true;
				break;
			}
		}


		if(!result){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	static void quick_sort(int[] d, int left, int right) {
        if (left>=right) {
            return;
        }
        int p = d[(left+right)/2];
        int l = left, r = right, tmp;
        while(l<=r) {
            while(d[l] < p) { l++; }
            while(d[r] > p) { r--; }
            if (l<=r) {
                tmp = d[l]; d[l] = d[r]; d[r] = tmp;
                l++; r--;
            }
        }
        quick_sort(d, left, r);  // ピボットより左側をクイックソート
        quick_sort(d, l, right); // ピボットより右側をクイックソート
    }
}
