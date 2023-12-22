import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        
        for(int i = 1; i < N ;i++){
            int d = N / i;
            int l = N % i;
            if(d == l){
                a.add(i);
            }
            
        }
        
        System.out.println(accumulate(a));
    }
    
public static int accumulate(ArrayList<Integer> arrayListA){
		int sum = 0;
		for( Integer tmp : arrayListA )
			sum += tmp;

		return sum;
	}
}