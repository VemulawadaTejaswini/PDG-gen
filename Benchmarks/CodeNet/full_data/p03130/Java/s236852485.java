import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		int[] nums1 = new int[3];
		int[] nums2 = new int[3];
		for(int i=0; i<3; i++) {
			nums1[i] = sc.nextInt();
			nums2[i] = sc.nextInt();
		}
		
		for(int i=0; i<nums1.length; i++) {
			int tmp = nums1[i];
			int count = 0;
			for(int j=0; j<nums2.length; j++) {
				if(tmp == nums2[j]) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
    }

}
