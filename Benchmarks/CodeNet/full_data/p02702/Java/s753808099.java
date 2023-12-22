import java.util.*;
class KMP_String_Matching 
{ 
    int KMPSearch(String pat, String txt) 
    { 
        int M = pat.length(); 
        int N = txt.length(); 
   
        int lps[] = new int[M]; 
        int j = 0;  // index for pat[] 
   
        computeLPSArray(pat,M,lps); 
   
        int i = 0;  // index for txt[] 
        int res = 0;  
        int next_i = 0;   
          
        while (i < N) 
        { 
            if (pat.charAt(j) == txt.charAt(i)) 
            { 
                j++; 
                i++; 
            } 
            if (j == M) 
            { 
                j = lps[j-1]; 
                res++; 
                if (lps[j]!=0) 
                    i = ++next_i; 
                j = 0; 
            } 
   
            else if (i < N && pat.charAt(j) != txt.charAt(i)) 
            { 
                if (j != 0) 
                    j = lps[j-1]; 
                else
                    i = i+1; 
            } 
        } 
        return res; 
    } 
   
    void computeLPSArray(String pat, int M, int lps[]) 
    { 
        int len = 0; 
        int i = 1; 
        lps[0] = 0;  // lps[0] is always 0 
   
        while (i < M) 
        { 
            if (pat.charAt(i) == pat.charAt(len)) 
            { 
                len++; 
                lps[i] = len; 
                i++; 
            } 
            else  // (pat[i] != pat[len]) 
            { 
                // This is tricky. Consider the example. 
                // AAACAAAA and i = 7. The idea is similar  
                // to search step. 
                if (len != 0) 
                { 
                    len = lps[len-1]; 
   
                    // Also, note that we do not increment 
                    // i here 
                } 
                else  // if (len == 0) 
                { 
                    lps[i] = len; 
                    i++; 
                } 
            } 
        } 
    } 
}

class Main{
   
    public static void main(String args[]) 
    { 
        Scanner sc= new Scanner(System.in); 
        String s=sc.nextLine();
        int count=0;
        int index=0;
        while (index*2019<=999999){
            String value=String.valueOf(index*2019);   
            count=new KMP_String_Matching().KMPSearch(value,s); 
            index+=1;
        }
        System.out.println(count); 
    } 
}    
