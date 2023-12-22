import java.util.ArrayList;
import java.util.List;
class Swap0and1 {
    public static void main(String[] args) {
		int[] arr = {5, 2, 3, 4, 1};
		int n = 5;
		List<Integer>arr2 = new ArrayList<>();
		for (int count = 1; count <= n; count++) {
			arr2.add(count);
		}
		int[] toArr2 = new int[arr2.size()];
		for (int i = 0; i < arr.length; i++) {
			toArr2[i] = arr2.get(i);
		}
		
		int[] fixed = compare(arr, toArr2);
		boolean flag = isFixed(toArr2, fixed);
		if(flag) System.out.println("Yes");
		else System.out.println("No");
		
	}
    public static int[] compare(int[] arr, int[] arr2) {
		List<Integer> x = new ArrayList<>();
		for (int count = 0; count < arr.length; count++) {
			if(x.size() <= 2 && arr[count] != arr2[count]) {
				x.add(count);
			}
			if(x.size() == 2) {
				break;
			}
		}
		if(x.size() == 0) {
			return arr;
		}
		else
			return swap(x.get(0), x.get(1), arr);
	}
	
	public static boolean isFixed(int[] arr, int[] arr2) {
		boolean flag = false;
		for (int count = 0; count < arr.length; count++) {
			if(arr[count] != arr2[count]) {
				flag = false;
				break;
			}
			else {
				flag = true;
			}
		}
		return flag;
	}


}