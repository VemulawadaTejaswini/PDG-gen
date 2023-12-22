import java.util.*;

public class Main {

    // クイックソートのメソッド
    public static int[] quickSort(int[] input) {
    	return quick(input, 0, input.length - 1);
    }

    private static int[] quick(int[] input, int left, int right) {
    	int[] array = input;
    	int currentLeft = left;
    	int currentRight = right;

    	// 要素数が1以下のときは、何もせず返却する
    	if (array.length < 2)
    		return array;

    	// クイックソートの場合、軸の選び方は色々あるが、このメソッドでは
    	// 軸は、currentLeftとcurrentRightの真ん中にある要素とする。
    	int pivot = array[(currentLeft + currentRight) / 2];

    	do {
    		while (array[currentLeft] < pivot) {
    			currentLeft++;
    		}

    		while (array[currentRight] > pivot) {
    			currentRight--;
    		}
    		if (currentLeft <= currentRight) {
    			int index1 = currentLeft++;
    			int index2 = currentRight--;
    			int temp = array[index1];
    			array[index1] = array[index2];
    			array[index2] = temp;
    		}
    	} while (currentLeft <= currentRight);

    	if (left < currentRight)
    		quick(array, left, currentRight);

    	if (currentLeft < right)
    		quick(array, currentLeft, right);
    	return array;
    }

    public static int maxBArg(int[] b, boolean[] lost, int N) {
        int arg = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (lost[i] == false && max < b[i]) {
                max = b[i];
                arg = i;
            }
        }
        return arg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int damage = 0;
        int count = 0;
        int needB = N;
        boolean[] lost = new boolean[N];
        //値の入力とaの最大値の発見
        int a_max = 0;
        int a_max_arg = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            if (a_max < a[i]) {
                a_max = a[i];
                a_max_arg = i;
            }
        }
        //Bをソート
        b = quickSort(b);
        //aの最大値とbの比較
        int base = 0;
        for (int i = 0; i < N; i++) {
            if (b[i] > a_max) {
                base = i;
                break;
            }
        }
        //bのみで撃破
        for (int i = N - 1; i >= base; i--) {
            damage += b[i];
            count++;
            if (damage > H) {
                System.out.println(count);
                return;
            }
        }
        while (damage < H) {
            damage += a_max;
            count++;
        }
        System.out.println(count);
    }

}
