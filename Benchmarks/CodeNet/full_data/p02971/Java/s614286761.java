import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String[] s1 = sc.nextLine().split(" ");

        int n = Integer.parseInt(sc.nextLine());
        String[] s1 = new String[n];
        int[] intS1 = new int[n];

        int max1=0;
        int max2=0;
        for (int i = 0;i < s1.length;i++) {
        	intS1[i]=Integer.parseInt(sc.nextLine());
        	if (max1<=intS1[i]) {
        		max2=max1;
        		max1=intS1[i];
        	} else if (max2<=intS1[i]) {
        		max2=intS1[i];
        	}
        }

        for (int i = 0;i < s1.length;i++) {
        	if (intS1[i]==max1) {
        		System.out.println(max2);
        	} else {
        		System.out.println(max1);
        	}
        }
    }
}