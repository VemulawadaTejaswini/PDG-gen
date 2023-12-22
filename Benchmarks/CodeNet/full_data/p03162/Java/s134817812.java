import java.util.*;
import java.lang.*;
import java.io.*;

// SHIVAM GUPTA :
//NSIT
//decoder_1671
//BEING PERFECTIONIST IS NOT AN OPTION



// ASCII = 48 + i ;

// SHIVAM GUPTA :


/* Name of the class has to be "Main" only if the class is public. */



public class Main
{
     
     
     
    static PrintWriter out;
    
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
			br=new BufferedReader(new InputStreamReader(System.in));
			out=new PrintWriter(System.out);
		}
		String next(){
			while(st==null || !st.hasMoreElements()){
				try{
					st= new StringTokenizer(br.readLine());
				}
				catch (IOException e){
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt(){
			return Integer.parseInt(next());
		}
		long nextLong(){
			return Long.parseLong(next());
		}
		double nextDouble(){
			return Double.parseDouble(next());
		}
		String nextLine(){
			String str = "";
			try{
				str=br.readLine();
			}
			catch(IOException e){
				e.printStackTrace();
			}
			return str;
		}
	}
	





/////////////////////////////////////////////////////////////////////////////////////

public static int  min(int a ,int b , int c, int d)
{
       
       
       int[] arr = new int[4] ;
       arr[0] = a;
       arr[1] = b ;
       arr[2] = c;
       arr[3] = d;
       Arrays.sort(arr) ;
       
       return arr[0];
       
}
 
 /////////////////////////////////////////////////////////////////////////////
 
 
public static int  max(int a ,int b , int c, int d)
{
       
       
       int[] arr = new int[4] ;
       arr[0] = a;
       arr[1] = b ;
       arr[2] = c;
       arr[3] = d;
       Arrays.sort(arr) ;
       
       return arr[3];
       
}
 
/////////////////////////////////////////////////////////////////////////////////// 
static int sieve =  1000000 ;

 
static boolean[] prime =  new boolean[sieve + 1] ;

 
public static void sieveOfEratosthenes() 
    { 
        // FALSE == prime
        
        // TRUE ==  COMPOSITE
        
        // FALSE== 1
       
        for(int i=0;i< sieve + 1;i++) 
            prime[i] = false; 
          
        for(int p = 2; p*p <= sieve; p++) 
        { 
           
            if(prime[p] == false) 
            { 
                
                for(int i = p*p; i <= sieve; i += p) 
                    prime[i] = true; 
            } 
        } 
          
       
       
    
    } 
 
///////////////////////////////////////////////////////////////////////////////////


public static String reverse(String input)
{
    String op = "" ;
    
    for(int i = 0; i < input.length() ; i++ )
    {
        op = input.charAt(i)+  op ; 
    }
    
return op ;
}


///////////////////////////////////////////////////////////////////////////////////////


public static void sortD(int[] arr)
{
      sort(arr ,0 , arr.length-1) ;
      
      int i =0 ; int j = arr.length -1  ;
      
      while( i < j)
      {
            int temp = arr[i] ;
            arr[i] =arr[j] ;
            arr[j] = temp ;
            i++ ; j-- ;
      }
      
      
      
      return ;
}

///////////////////////////////////////////////////////////////////////////////////////

public static boolean sameParity(long a  ,long b )
{
      
      if(a%2 == b %2)
      {
            return true  ;
      }
      else{
            return false  ;
      }
}

////////////////////////////////////////////////////////////////////////////////////

public static boolean isPossibleTriangle(int a  ,int b , int c)
{
      if( a + b > c && c+b > a && a +c > b)
      {
            return true  ;
      }
      
      return false  ;
      
      
}

/////////////////////////////////////////////////////////////////////
    
public static int gcd(int a, int b )
{

if(b==0)return a ;

else return gcd(b,a%b) ; 


}

////////////////////////////////////////////////////////////////////////////////////

public static int lcm(int a, int b ,int c , int d )
{

int temp = lcm(a,b , c) ;


 
 int ans = lcm(temp ,d ) ;

return ans  ;


}

//////////////////////////////////////////////////////////////////////////////////////

public static int lcm(int a, int b ,int c )
{

int temp = lcm(a,b) ;

int ans =  lcm(temp ,c) ;

return ans  ;


}

////////////////////////////////////////////////////////////////////////////////////////
    
public static int lcm(int a , int b )
{

int gc = gcd(a,b);

return (a*b)/gc ;




}

/////////////////////////////////////////////////////////////////////////////////////////////

static boolean isPrime(int n)
{
      if(n==1)
      {
            return false  ;
      }
      
      boolean ans =  true  ;
      
      for(int i = 2; i*i <= n ;i++)
      {
            if(n% i ==0)
            {
                  ans = false  ;break ;
            }
      }
      
      
      return ans  ;
      
      
}
//////////////////////////////////////////////////////////////////////////////////////////

public static ArrayList<Integer> allFactors(int n)
{   
      ArrayList<Integer> list = new ArrayList<>() ;
      
    for(int i = 1; i*i <= n ;i++)
    {
          if( n % i == 0)
          {
              if(i*i == n)
              {
                    list.add(i) ;
              }
              else{
                    list.add(i) ;
                    list.add(n/i) ;
                    
              }
          }
    }
      
     return list ; 
      
      
}



/////////////////////////////////////////////////////////////////////////////

public static boolean isPowerOfTwo(int n) 
{ 
    if(n==0) 
    return false; 
  
if(((n ) & (n-1)) == 0 ) return true ;
else return false  ;

} 
   
////////////////////////////////////////////////////////////////////////////////////   
   
    public static int countDigit(long n) 
    { 
        return (int)Math.floor(Math.log10(n) + 1); 
    } 
    
 ///////////////////////////////////////////////////////////////////////////////////////// 
  
   static final int MAXN = 100001; 
       
    
    static int spf[] = new int[MAXN]; 
   
    static void sieve() 
    { 
        spf[1] = 1; 
        for (int i=2; i<MAXN; i++) 
       
           
            spf[i] = i; 
       
       
        for (int i=4; i<MAXN; i+=2) 
            spf[i] = 2; 
       
        for (int i=3; i*i<MAXN; i++) 
        { 
           
            if (spf[i] == i) 
            { 
               
                for (int j=i*i; j<MAXN; j+=i) 
       
                    if (spf[j]==j) 
                        spf[j] = i; 
            } 
        } 
    } 
       
// The above code works well for n upto the order of 10^7.
// Beyond this we will face memory issues.

// Time Complexity: The precomputation for smallest prime factor is done in O(n log log n)
// using sieve.
// Where as in the calculation step we are dividing the number every time by 
// the smallest prime number till it becomes 1.
// So, let’s consider a worst case in which every time the SPF is 2 .
// Therefore will have log n division steps.


// Hence, We can say that our Time Complexity will be O(log n) in worst case.


    static Vector<Integer> getFactorization(int x) 
    { 
        Vector<Integer> ret = new Vector<>(); 
        while (x != 1) 
        { 
            ret.add(spf[x]); 
            x = x / spf[x]; 
        } 
        return ret; 
    } 
       
  
   
public static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
  public static void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

      
         

public static void main (String[] args) throws java.lang.Exception
{
  FastReader scn = new FastReader() ;
int n = scn.nextInt() ;

int[][] arr =new int[n][3] ;

for(int i = 0; i < n ; i++)
{
      arr[i][0] = scn.nextInt() ;
      arr[i][1] = scn.nextInt() ;
      arr[i][2] = scn.nextInt() ;
}


int[][] dp =new int[n][3] ;



// dp[i][0] stores thst if we do activity of type A at ith day,total maximum point till 
//ith day 

// dp[i][1] stores thst if we do activity of type B at ith day,total maximum point till 
//ith day 

// dp[i][2] stores thst if we do activity of type C at ith day,total maximum point till 
//ith day 

//BASE CASE

dp[0][0] = arr[0][0] ;
dp[0][1] = arr[0][1] ;
dp[0][2] = arr[0][2] ;




for(int i = 1 ; i < n ; i++)
{
      dp[i][0] =  arr[i][0] +  Math.max(dp[i-1][1] , dp[i-1][2]) ;
      
      dp[i][1] =  arr[i][1] +  Math.max(dp[i-1][0] , dp[i-1][2]) ;
      
      dp[i][2] =   arr[i][2] +  Math.max(dp[i-1][0] , dp[i-1][1]) ;
      
}


int ans =  Math.max(dp[n-1][0] , Math.max(dp[n-1][1] , dp[n-1][2])) ;


out.println(ans) ;


 
 
out.flush() ;
      
}


}
  
 class Pair implements Comparable<Pair>
{
  int val ;
  
  String str  ;
      
Pair(int val , String str)
{
      this.val = val ;
      this.str = str  ;
}

  public int compareTo(Pair o)
    {
        return this.val - o.val;
    }
 
     
}

 