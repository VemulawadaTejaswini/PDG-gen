import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		int[] a= new int[n];
 		int[] b = new int[n];
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		for(int i = 0;i<n;i++){
 			a[i] = Integer.parseInt(st.nextToken());
 		}
 		StringTokenizer st1 = new StringTokenizer(bf.readLine());
 		for(int j = 0;j<n;j++){
 			b[j] = Integer.parseInt(st1.nextToken());
 		}
 		
 		int[] axor = new int[n];
 		int[] bxor = new int[n];
 		for(int i = 0;i<n;i++){
 			axor[i] = a[i]^a[(i+1)%n];
 			bxor[i] = b[i]^b[(i+1)%n];
 		}
 		int[] axordouble = new int[2*n];
 		int[] bxordouble = new int[2*n];
 		for(int i = 0;i<2*n;i++){
 			axordouble[i] = axor[i%n];
 			bxordouble[i] = bxor[i%n];
 		}
 		ArrayList<Integer> ks = KMPSearchInt(bxor, axordouble);
 		for(int index : ks){
 			if (index < n){
 				out.println(index + " " + (a[index%n]^b[0]));
 			}
 		}
 		out.close();
 		
 	}
	 /* pat -> pattern 
    txt -> text */
	public static void KMPSearch(String pat, String txt) 
    { 
		ArrayList<Integer> indices = new ArrayList<Integer>();
        int M = pat.length(); 
        int N = txt.length(); 
  
        // create lps[] that will hold the longest 
        // prefix suffix values for pattern 
        int lps[] = new int[M]; 
        int j = 0; // index for pat[] 
  
        // Preprocess the pattern (calculate lps[] 
        // array) 
        computeLPSArray(pat, M, lps); 
  
        int i = 0; // index for txt[] 
        while (i < N) { 
            if (pat.charAt(j) == txt.charAt(i)) { 
                j++; 
                i++; 
            } 
            if (j == M) { 
                indices.add(i-j);
                j = lps[j - 1]; 
            } 
  
            // mismatch after j matches 
            else if (i < N && pat.charAt(j) != txt.charAt(i)) { 
                // Do not match lps[0..lps[j-1]] characters, 
                // they will match anyway 
                if (j != 0) 
                    j = lps[j - 1]; 
                else
                    i = i + 1; 
            } 
        } 
    } 
  
    public static void computeLPSArray(String pat, int M, int lps[]){ 
        // length of the previous longest prefix suffix 
        int len = 0; 
        int i = 1; 
        lps[0] = 0; // lps[0] is always 0 
  
        // the loop calculates lps[i] for i = 1 to M-1 
        while (i < M) { 
            if (pat.charAt(i) == pat.charAt(len)) { 
                len++; 
                lps[i] = len; 
                i++; 
            } 
            else // (pat[i] != pat[len]) 
            { 
                // This is tricky. Consider the example. 
                // AAACAAAA and i = 7. The idea is similar 
                // to search step. 
                if (len != 0) { 
                    len = lps[len - 1]; 
  
                    // Also, note that we do not increment 
                    // i here 
                } 
                else // if (len == 0) 
                { 
                    lps[i] = len; 
                    i++; 
                } 
            } 
        } 
    } 
	
    public static ArrayList<Integer> KMPSearchInt(int[] pat, int[] txt) 
    { 
		ArrayList<Integer> indices = new ArrayList<Integer>();
        int M = pat.length; 
        int N = txt.length; 
  
        // create lps[] that will hold the longest 
        // prefix suffix values for pattern 
        int lps[] = new int[M]; 
        int j = 0; // index for pat[] 
  
        // Preprocess the pattern (calculate lps[] 
        // array) 
        computeLPSArrayInt(pat, M, lps); 
  
        int i = 0; // index for txt[] 
        while (i < N) { 
            if (pat[j] == txt[i]) { 
                j++; 
                i++; 
            } 
            if (j == M) { 
                indices.add(i-j);
                j = lps[j - 1]; 
            } 
  
            // mismatch after j matches 
            else if (i < N && pat[j] != txt[i]) { 
                // Do not match lps[0..lps[j-1]] characters, 
                // they will match anyway 
                if (j != 0) 
                    j = lps[j - 1]; 
                else
                    i = i + 1; 
            } 
        }
        return indices;
    } 
  
    public static void computeLPSArrayInt(int[] pat, int M, int lps[]){ 
        // length of the previous longest prefix suffix 
        int len = 0; 
        int i = 1; 
        lps[0] = 0; // lps[0] is always 0 
  
        // the loop calculates lps[i] for i = 1 to M-1 
        while (i < M) { 
            if (pat[i] == pat[len]) { 
                len++; 
                lps[i] = len; 
                i++; 
            } 
            else // (pat[i] != pat[len]) 
            { 
                // This is tricky. Consider the example. 
                // AAACAAAA and i = 7. The idea is similar 
                // to search step. 
                if (len != 0) { 
                    len = lps[len - 1]; 
  
                    // Also, note that we do not increment 
                    // i here 
                } 
                else // if (len == 0) 
                { 
                    lps[i] = len; 
                    i++; 
                } 
            } 
        } 
    } 
 }
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


