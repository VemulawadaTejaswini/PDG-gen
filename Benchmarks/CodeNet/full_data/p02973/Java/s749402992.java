import java.io.*; 
import java.math.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int[] nums = new int[N];
        int[][] sorted = new int[N][2];
        for (int i = 0; i < N; i++) {
        	nums[i] = sc.nextInt();
        	sorted[i] = new int[]{nums[i],i};
        }
        sorted = sort(sorted);
        int[] colors = new int[N];
        for (int i = 0; i < N; i++) {
        	colors[i] = -1;
        }
        int col = 0;
        TreeSet<Integer> colIndexes = new TreeSet<Integer>();
        for (int[] ni: sorted) {
        	int i = ni[1];
        	Integer colToBe = colIndexes.floor(i);
        	if (colToBe == null) {
        		colors[i] = col;
        		colIndexes.add(i);
        		col++;
        	} else {
        		colIndexes.remove(colToBe);
        		colors[i] = colors[colToBe];
        		colIndexes.add(i);
        	}
        }
        System.out.println(col);
    }
    
    public static int[][] sort(int[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i< array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array, new Comparator<int[]>() {
			  @Override
			  public int compare(int[] arr1, int[] arr2) {
				  //Ascending order
				  if (arr1[0] != arr2[0])
					  return arr1[0]-arr2[0];
				  else
					  return arr2[1]-arr1[1];
			  }
		});
		return array;
	}
    
    static class FastScanner { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() { 
            String str = ""; 
            try { 
                str = br.readLine(); 
            } catch (IOException e) {
                e.printStackTrace(); 
            } 
            return str; 
        }
    }
}