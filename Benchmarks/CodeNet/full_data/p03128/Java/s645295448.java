import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main implements Runnable {
    
    private int n;
    private int m;
    private int[] a;
    private int[] use;
    private int[] mat = {2,5,5,4,5,6,3,7,6};

    public static void main(String[] args) throws IOException {
        Main m = new Main();
		m.run();
    }

    private void set() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	  		String[] parts = br.readLine().split("[\\s]+");
	 	   	n = Integer.parseInt(parts[0]);
	 	   	m = Integer.parseInt(parts[1]);
	 	   	a = Arrays.stream(br.readLine().split("[\\s]+"))
				.mapToInt(Integer::parseInt).toArray();
		    use = new int[m];
		    sort();
		} catch (IOException e) {
		    e.printStackTrace();
		}
    }

    private void sort() {
		for (int i=m-1;i>0;i--) {
		    for (int j=0;j<i;j++) {
				if ((mat[a[j]-1] > mat[a[j+1]-1]) ||
				    (mat[a[j]-1] == mat[a[j+1]-1] && a[j] < a[j+1])) {
				    int b = a[j];
		    		a[j] = a[j+1];
		   		 	a[j+1] = b;
				}
	    	}
		}
    }

    private int sum() {
		int s = 0;
		for (int i=0;i<m;i++) {
	  		s += use[i]*mat[a[i]-1];
		}
		return s;
    }

    @Override
    public void run() {
		set();
		use[0] = n/mat[a[0]-1];
		int idx = 0;
		while (sum() != n) {
	    	if (use[idx] > 0) {
				use[idx]--;
	    	} else {
				idx++;
				if (idx == m) idx = 0;
	    	}
	    	int left = n - sum();
	    	for (int i=idx+1;i<m;i++) {
				if (mat[a[i]-1] <= left) {
		    		use[i] += left/mat[a[i]-1];
		    		left = n - sum();
				}
	    	}
		}
		StringBuilder sb = new StringBuilder();
		while (sum() != 0) {
	    	int num = 0;
	    	idx = 0;
	    	for (int i=0;i<m;i++) {
				if (num < a[i] && use[i] != 0) {
		    		num = a[i];
		    		idx = i;
				}
	    	}
	    	for (int i=0;i<use[idx];i++) {
				sb.append(num);
	    	}
	    	use[idx] = 0;
		}
		System.out.println(sb.toString());
    }

}