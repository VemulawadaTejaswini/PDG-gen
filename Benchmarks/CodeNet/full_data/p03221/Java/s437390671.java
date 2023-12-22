import java.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Main{
	static int N,M;
	static int[] List;
	static int[][] city;
	static int[] Answer;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
		N = ss.nextInt();
		M = ss.nextInt();
		List = new int[M];
		city = new int[M][4];
		for (int i = 0; i < M; i++) {
			city[i][0] = ss.nextInt();
			city[i][1] = ss.nextInt();	
			city[i][2] = 1;
			city[i][3] =i;
		}
		merge_sort(0, M-1 , 1);
		for (int i = 1; i < M; i++) {
			int j;
			for ( j = i-1; j >= 0; j--) {
				if(city[i][0]!=city[j][0])continue;
				if(city[i][0]==city[j][0]) {
					city[i][2]= city[j][2]+1 ;
					break;
				}
			}
		}
		merge_sort(0, M-1, 3);
		for (int i = 0; i < M; i++) {
			String aa = Integer.toString(city[i][0]);
			int len = aa.length();
			int n = 6-len;
			for (int j = 0; j < n; j++) {
				System.out.print("0");
			}
			System.out.print(city[i][0]);
			String bb = Integer.toString(city[i][2]);
			int len1 = bb.length();
			int n1 = 6-len1;
			for (int j = 0; j < n1; j++) {
				System.out.print("0");
			}
			System.out.print(city[i][2]);
			System.out.println();

		}
		
	}
	public static void merge_sort(int start, int end, int x) {
        if (start < end) {
            int mid = (start + end) / 2;
            merge_sort(start, mid, x);
            merge_sort(mid + 1, end, x);
            makesort(city,start, mid, end, x);
        }
    }

	
	
	private static void makesort(int[][] s,int start, int mid, int end, int x) {
		int lenth = end - start + 1;
		int temparr[][] = new int[lenth][4];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (s[i][x] <= s[j][x]) {
                temparr[k] = s[i];
                i++;
            } else {
                temparr[k] = s[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temparr[k] = s[i];
            i++;
            k++;
        }
        while (j <= end) {
            temparr[k] = s[j];
            j++;
            k++;
        }

        for (int n = 0; n < lenth; n++) {
            s[start + n] = temparr[n];
        }
	}

}