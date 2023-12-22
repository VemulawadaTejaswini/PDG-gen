import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int mojiCount = n.length()-2;
		int[] arrays = new int[mojiCount];
		for (int i = 0; i < mojiCount ;i ++) {
			arrays[i] = Integer.parseInt(n.substring(i,i+3));
		}
		int min = 753;
		for (int i = 0; i < mojiCount ;i ++) {
			arrays[i] = Integer.parseInt(n.substring(i,i+3));
			min = Math.min(min,Math.abs(753-arrays[i]));
		}
		System.out.println(min);
		
		

    }
}