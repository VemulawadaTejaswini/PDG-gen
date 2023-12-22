import java.util.Scanner;

public class Main {
	
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
    // 配列内のデータ列を表示する
    static void print_data(int[] d) {
        for(int i = 0; i < d.length; i++) System.out.print(d[i] + " ");
        System.out.println();
    }

	public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] data = new int[2*N-1] ;
		for(int i=0;i<2*N-1;i++) {
			data[i] = scan.nextInt();
			}
        //print_data(data);
        quick_sort(data, 0, data.length-1);
        //print_data(data);
        System.out.println(data[N-1]);

	}
	
	

}
