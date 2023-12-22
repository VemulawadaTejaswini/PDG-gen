import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = 0;
		String s = "";

		n = sc.nextInt();
		sc.nextLine();
		s = sc.nextLine();

        String[] array = s.split("");

		long ans = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = i + 1; j < n-1; j++) {
                if(!(array[i].equals(array[j]))){
                    for (int m = j + 1; m < n; m++) {
                        if(!(array[i].equals(array[m]))){
                        	if((j - i != m -j) && !(array[j].equals(array[m]))){
                        		ans++;
                        }
                    }
                }
            }
        }
        }
			System.out.println(ans);
	}
}