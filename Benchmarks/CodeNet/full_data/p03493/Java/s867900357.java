import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // two inputs
        String s1 = sc.next(); 
        String s2 = sc.next(); 
        String s3 = sc.next();
        
        int nums1 =Integer.parseInt(s1);
        int nums2 =Integer.parseInt(s2);
        int nums3 =Integer.parseInt(s3);
        
        int sum = nums1 + nums2 + nums3;
        	System.out.println(sum);

}
}