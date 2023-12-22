import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();

	    ArrayList<Integer> h = new ArrayList<Integer>();
	    for(int i = 0; i < n; i++){
	        int tmpH = sc.nextInt();
	        h.add(tmpH);
        }

	    int ans = 0;
	    int tmp = 0;
	    for(int i = 0; i < h.size(); i++){

            if(i == n - 1){
                ans = Math.max(ans, tmp);
                break;
            }

	        if(h.get(i) >= h.get(i + 1)){
	            tmp++;
            } else {
	            ans = Math.max(ans, tmp);
	            tmp = 0;
            }

        }

        System.out.println(ans);

    }
}
