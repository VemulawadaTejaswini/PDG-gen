import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ary = new int[n];
        long sum = 0;
        for(int i = 0;i < n; i++){
        	ary[i] = sc.nextInt();
        	sum += ary[i];
        }
        sc.close();
        int m2 = 0;
        for(int i = 0;i < n; i++){
        	if(ary[i]*(4*m) >= sum){
        		m2++;
        	}
        }
        System.out.println(m2>=m?"Yes":"No");

    }
}