import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int length = str.length();
		char[] charArr = new char[length];
		int[] intArr = new int[length];
		for (int i = 0; i < length; i++) {
			charArr[i] = str.charAt(i);
		}
		sc.close();
		char tmp = 'R';
		int r = 0;
		int l = 0;
		int total = 0;
		for (int i = 0; i < length; i++) {
			if (tmp == 'R') {
				if (charArr[i] == 'R') {
					r++;
				} else {
					l++;
					tmp = 'L';
					if (i == length - 1) {
						if (r - l % 2 == 0) {
							intArr[total + r - 1] = r;
							intArr[total + r] = r;

						} else if (l > r) {
							if (l % 2 == 0) {
								int left = (l + r) / 2;
								int right = l + r - left;
								intArr[total + r - 1] = left;
								intArr[total + r] = right;
							} else {
								int right = (l + r) / 2;
								int left = l + r - right;
								intArr[total + r - 1] = left;
								intArr[total + r] = right;
							}
						} else {
							if (r % 2 == 0) {
								int left = (l + r) / 2;
								int right = l + r - left;
								intArr[total + r - 1] = left;
								intArr[total + r] = right;
							} else {
								int right = (l + r) / 2;
								int left = l + r - right;
								intArr[total + r - 1] = left;
								intArr[total + r] = right;
							}
						}
					}
				}
			} else {
				if (charArr[i] == 'R') {
					if (r - l % 2 == 0) {
						intArr[total + r - 1] = r;
						intArr[total + r] = r;

					} else if (l > r) {
						if (l % 2 == 0) {
							int left = (l + r) / 2;
							int right = l + r - left;
							intArr[total + r - 1] = left;
							intArr[total + r] = right;
						} else {
							int right = (l + r) / 2;
							int left = l + r - right;
							intArr[total + r - 1] = left;
							intArr[total + r] = right;
						}
					} else {
						if (r % 2 == 0) {
							int left = (l + r) / 2;
							int right = l + r - left;
							intArr[total + r - 1] = left;
							intArr[total + r] = right;
						} else {
							int right = (l + r) / 2;
							int left = l + r - right;
							intArr[total + r - 1] = left;
							intArr[total + r] = right;
						}
					}
					total = i;
					l = 0;
					r = 1;
					tmp ='R';
				} else {
					l++;
					tmp = 'L';
					if (i == length - 1) {
						if (r - l % 2 == 0) {
							intArr[total + r - 1] = r;
							intArr[total + r] = r;

						} else if (l > r) {
							if (l % 2 == 0) {
								int left = (l + r) / 2;
								int right = l + r - left;
								intArr[total + r - 1] = left;
								intArr[total + r] = right;
							} else {
								int right = (l + r) / 2;
								int left = l + r - right;
								intArr[total + r - 1] = left;
								intArr[total + r] = right;
							}
						} else {
							if (r % 2 == 0) {
								int left = (l + r) / 2;
								int right = l + r - left;
								intArr[total + r - 1] = left;
								intArr[total + r] = right;
							} else {
								int right = (l + r) / 2;
								int left = l + r - right;
								intArr[total + r - 1] = left;
								intArr[total + r] = right;
							}
						}
					}
				}
			}
		}
		for(int i = 0; i< length; i++) {
			System.out.print(intArr[i] + " ");
		}
	}
}