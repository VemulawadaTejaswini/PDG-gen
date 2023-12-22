import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int i = Integer.parseInt(sa[0]);
        int o = Integer.parseInt(sa[1]);
        int j = Integer.parseInt(sa[3]);
        int l = Integer.parseInt(sa[4]);
        br.close();
      
        long ans = o;
        boolean x=(j==0);
        boolean y=(l==0);
        boolean z=(i==0);
      
      
        while ((j>0) && (l>0) && (i>0)) {
    		ans += 3;
            i--;
            j--;
            l--;
		}
                  
        if(j==0 && l%2==1 && i%2==1 && x){
            ans +=1;
            j++;
            i--;
            l--;
        }
        if(l==0 && j%2==1 && i%2==1 && y){
            ans +=1;
            l++;
            i--;
            j--;
        }
		if(i==0 && l%2==1 && j%2==1 && z){
            ans +=1;
            i++;
			j--;
			l--;
		}

		ans += i / 2 * 2;
		ans += j / 2 * 2;
		ans += l / 2 * 2;
		System.out.println(ans);
	}
}