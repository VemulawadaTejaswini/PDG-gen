//package javaapplication1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import static java.lang.reflect.Array.set;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import static jdk.nashorn.internal.objects.Global.Infinity;
import static jdk.nashorn.internal.objects.NativeMath.round;
import sun.awt.HKSCS;

/*
   PARTIAL AUTHOR GEORGE
   MAINLY GEEKSFORGEEKS ALL RIGHTS RESERVED.
*/
public class Main {
    static boolean isSubSequence(String str1, String str2, int m, int n)
    {
       
        if (m == 0) 
            return true;
        if (n == 0) 
            return false;
             
        
        if (str1.charAt(m-1) == str2.charAt(n-1))
            return isSubSequence(str1, str2, m-1, n-1);
 
        
        return isSubSequence(str1, str2, m, n-1);
    }

        public static void main(String[] args) throws IOException{
        BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter PW=new PrintWriter(new PrintStream(System.out));
        In IN=new In(BR);
        Out OUT=new Out(PW);
        Scanner SC=new Scanner(System.in);
        //DataStructure DS=new DataStructure();
        Functions F=new Functions();
        //QuickSort QS=new QuickSort();
        //BinarySearch BS=new BinarySearch();
        //FIB fubbonanci=new FIB(93);
        //Map<Character,List<Integer>>Pos=new HashMap<>();
        //Set<Integer>ans=new HashSet<>();
        //StringPermutationGenerator SPG=new StringPermutationGenerator();
        long n,m;
        n=IN.nextLong();
        m=IN.nextLong();
            for (long i = 1; i < Math.pow(10, 18)+3; ++i) {
                if((i%n==0&&i%m!=0)||(i%n!=0&&i%m==0)){System.out.println(i);System.exit(0);}
            }
            System.out.println(-1);
   }

    protected static class In {
        private BufferedReader reader;
        private StringTokenizer tokenizer = new StringTokenizer("");
        public In(BufferedReader reader) {
            this.reader = reader;
        }
        
        public String next() throws IOException {
            while (!tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(reader.readLine());
            return tokenizer.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public int[] nextIntArray1(int n) throws IOException {
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++)
                a[i] = nextInt();
            return a;
        }

        public int[] nextIntArraySorted(int n) throws IOException {
            int[] a = nextIntArray(n);
            Random r = new Random();
            for (int i = 0; i < n; i++) {
                int j = i + r.nextInt(n - i);
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
            Arrays.sort(a);
            return a;
        }

        public long[] nextLongArray(int n) throws IOException {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }

        public long[] nextLongArray1(int n) throws IOException {
            long[] a = new long[n + 1];
            for (int i = 1; i <= n; i++)
                a[i] = nextLong();
            return a;
        }

        public long[] nextLongArraySorted(int n) throws IOException {
            long[] a = nextLongArray(n);
            Random r = new Random();
            for (int i = 0; i < n; i++) {
                int j = i + r.nextInt(n - i);
                long t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
            Arrays.sort(a);
            return a;
        }
    }
    protected static class Out {
        private PrintWriter writer;
        private static boolean local = System
                .getProperty("ONLINE_JUDGE") == null;

        public Out(PrintWriter writer) {
            this.writer = writer;
        }

        public void print(char c) {
            writer.print(c);
        }

        public void print(int a) {
            writer.print(a);
        }

        public void println(Object a) {
            writer.println(a);
        }

        public void println(Object[] os) {
            for (int i = 0; i < os.length; i++) {
                writer.print(os[i]);
                writer.print(' ');
            }
            writer.println();
        }

        public void println(int[] a) {
            for (int i = 0; i < a.length; i++) {
                writer.print(a[i]);
                writer.print(' ');
            }
            writer.println();
        }

        public void println(long[] a) {
            for (int i = 0; i < a.length; i++) {
                writer.print(a[i]);
                writer.print(' ');
            }
            writer.println();
        }

        public static void db(Object... objects) {
            if (local)
                System.out.println(Arrays.deepToString(objects));
        }
    }
    public static class QuickSort{ 
    protected static int [] intArray;
    protected static long [] longArray;
    protected static double [] DoubleArray;
    protected static char [] charArray;
    protected static int Size;
        public QuickSort() {
        }
     
    protected static int partition(int arr[],int low,int high)
    {
      int pivot=arr[high];
      int i=low-1;
      int temp=0;
        for (int j = low; j < high; ++j) {
            if(arr[j]<=pivot)
            {
                 ++i;
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
            }
        }
         temp = arr[i+1];
         arr[i+1] = arr[high];
         arr[high] = temp;
         return i+1;
    
    }
    protected static int partition(long arr[],int low,int high)
    {
      long pivot=arr[high];
      int i=low-1;
      long temp=0;
        for (int j = low; j < high; ++j) {
            if(arr[j]<=pivot)
            {
                 ++i;
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
            }
        }
         temp = arr[i+1];
         arr[i+1] = arr[high];
         arr[high] = temp;
         return i+1;
    
    }
    protected static int partition(double arr[],int low,int high)
    {
      double pivot=arr[high];
      int i=low-1;
      double temp=0;
        for (int j = low; j < high; ++j) {
            if(arr[j]<=pivot)
            {
                 ++i;
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
            }
        }
         temp = arr[i+1];
         arr[i+1] = arr[high];
         arr[high] = temp;
         return i+1;
    
    }
    protected static int partition(char arr[],int low,int high)
    {
      char pivot=arr[high];
      int i=low-1;
      char temp=0;
        for (int j = low; j < high; ++j) {
            if(arr[j]<=pivot)
            {
                 ++i;
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
            }
        }
         temp = arr[i+1];
         arr[i+1] = arr[high];
         arr[high] = temp;
         return i+1;
    
    }
    protected static void sort(int arr[],int low, int high)
    {
          if(low < high)
          {
              int pi=partition(arr, low, high);
              sort(arr, low, pi-1);
              sort(arr, pi+1, high);
          
          }
         
    }
   protected static void sort(long arr[],int low, int high)
    {
          if(low < high)
          {
              int pi=partition(arr, low, high);
              sort(arr, low, pi-1);
              sort(arr, pi+1, high);
          
          }
    }

    protected static void sort(double arr[],int low, int high)
    {
          if(low < high)
          {
              int pi=partition(arr, low, high);
              sort(arr, low, pi-1);
              sort(arr, pi+1, high);
          
          }
    }
    protected static void sort(char arr[],int low, int high)
    {
          if(low < high)
          {
              int pi=partition(arr, low, high);
              sort(arr, low, pi-1);
              sort(arr, pi+1, high);
          
          }
    }
    protected  static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    protected  static void printArray(char arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    protected  static void printArray(double arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
     protected  static void printArray(long arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
  }
    public static class Functions{

        public Functions() {
        }
        protected static boolean [] sieveOfEratosthenesPrimes(int limit){
        boolean prime[] = new boolean[limit+1];
        for(int i=0;i<limit;i++)
            prime[i] = true;
        for(int p = 2; p*p <=limit; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= limit; i += p)
                    prime[i] = false;
            }
        }
         return prime;
    }
    protected static boolean checkAnagram(String str1, String str2) {
        int i=0;
        for (char c : str1.toCharArray()) {
        i = str2.indexOf(c, i) + 1;
        if (i <= 0) { return false; }
    }
    return true;
    }
    protected static boolean contains(final int[] arr, final int key) {
    return Arrays.stream(arr).anyMatch(i -> i == key);
    }
    public static boolean contains(final long[] arr, final long key) {
    return Arrays.stream(arr).anyMatch(i -> i == key);
    }
    public static boolean contains(final double[] arr, final double key) {
    return Arrays.stream(arr).anyMatch(i -> i == key);
    }
    protected static long NCR(long N, long R){
    if(N < R)
        return 0;
    if(R == 0 || R == N)
        return 1;
    return NCR(N-1,R-1)+NCR(N-1,R);
    }
    protected static long NCR(int N, int R){
    if(N < R)
        return 0;
    if(R == 0 || R == N)
        return 1;
    return NCR(N-1,R-1)+NCR(N-1,R);
    }
    protected static String changeCharInPosition(int position, char ch, String str){
    char[] charArray = str.toCharArray();
    charArray[position] = ch;
    return new String(charArray);
    }
    protected static boolean isPrime(long n) {
    if(n < 2) return false;
    if(n == 2 || n == 3) return true;
    if(n%2 == 0 || n%3 == 0) return false;
    long sqrtN = (long)Math.sqrt(n)+1;
    for(long i = 6L; i <= sqrtN; i += 6) {
        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
    }
    return true;
    }
    protected static long Gcd(long p, long q) {
        if (q == 0) return p;
        else return Gcd(q, p % q);
     }
    protected static boolean isPrime(int n) {
    if(n < 2) return false;
    if(n == 2 || n == 3) return true;
    if(n%2 == 0 || n%3 == 0) return false;
    int sqrtN = (int)Math.sqrt(n)+1;
    for(long i = 6L; i <= sqrtN; i += 6) {
        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
    }
    return true;
    }
 }
  public static class BinarySearch{
        private static int middle;
        private static int L;
        private static int R;
        public BinarySearch() {
            
        }
        protected static int Search(int [] arr,int element){
         R=arr.length-1;
         L=0;
         return BS(arr, L, R, element);
        }
        protected static int Search(long [] arr,long element){
         R=arr.length-1;
         L=0;
         return BS(arr, L, R, element);
        }
        protected static int Search(char [] arr,char element){
         R=arr.length-1;
         L=0;
         return BS(arr, L, R, element);
        }
        protected static int Search(double [] arr,double element){
         R=arr.length-1;
         L=0;
         return BS(arr, L, R, element);
        }
         protected static int BS(int [] arr,int L,int R,int element){   
          if(R>=L)                  
          {
            middle=L+(R-L)/2;  
            if(arr[middle]==element)
            { 
                return middle;
            }    
            else if(arr[middle]>element)
            {
                return BS(arr, L,middle-1, element);
            }    
            else 
            {    
                return BS(arr, middle+1, R, element);
            }    
          } 
          else
            {
              return -1;
            }
          }
         protected static int BS(long [] arr,int L,int R,long element){   
          if(R>=L)                  
          {
            middle=L+(R-L)/2;  
            if(arr[middle]==element)
            { 
                return middle;
            }    
            else if(arr[middle]>element)
            {
                return BS(arr, L,middle-1, element);
            }    
            else 
            {    
                return BS(arr, middle+1, R, element);
            }    
          } 
          else
            {
              return -1;
            }
          }
         protected static int BS(char [] arr,int L,int R,char element){   
          if(R>=L)                  
          {
            middle=L+(R-L)/2;  
            if(arr[middle]==element)
            { 
                return middle;
            }    
            else if(arr[middle]>element)
            {
                return BS(arr, L,middle-1, element);
            }    
            else 
            {    
                return BS(arr, middle+1, R, element);
            }    
          } 
          else
            {
              return -1;
            }
          }
         protected static int BS(double [] arr,int L,int R,double element){   
          if(R>=L)                  
          {
            middle=L+(R-L)/2;  
            if(arr[middle]==element)
            { 
                return middle;
            }    
            else if(arr[middle]>element)
            {
                return BS(arr, L,middle-1, element);
            }    
            else 
            {    
                return BS(arr, middle+1, R, element);
            }    
          } 
          else
            {
              return -1;
            }
          }
    } 
    public static class DataStructure{

        public DataStructure() {
        }
    
    
     static void stack_push(Stack<Integer> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.push(i);
        }
    }
     
     
    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop :");
 
        for(int i = 0; i < 5; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }
 
    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top : " + element);
    }
     
    // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);
 
        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);
    }
    
    }
   public static class FIB {
     
    protected static int MAX = 1000;
    protected static long f[];
    protected static int size=0;
    // Returns n'th fibonacci number using 
    // table f[]
    
    public FIB(int n)
    {
        f=new long[MAX];
        this.size=n;
        fib();
    }

        protected static void fib() {
            f[0]=0;f[1]=1;
            for (int i = 2; i < size; i++) {
                //if(f[i-1]+f[i-2]>Long.MAX_VALUE){f[i]=0;continue;}
                f[i]=f[i-1]+f[i-2];
            }
        }
        protected static void printSeries(){
            for (int i = 0; i <size; i++) {
                System.out.print(f[i]+" ");
            }
        
        }
    }
    public static class Graph{
 
    
    }
   public static class StringPermutationGenerator {
    // Generate all permutations of a string in Java
    private Set<String> generatePermutations(String input) {

        input = input.toLowerCase();
        Set<String> result = new HashSet<>();
        permutations("", input, result);
        return result;

    }
     private void permutations(String prefix, String letters, Set<String> result) {

        if (letters.length() == 0) {

            result.add(prefix);

        } else {

            for (int i = 0; i < letters.length(); i++) {

                String letter = letters.substring(i, i + 1);

                String otherLetters = letters.substring(0, i) + letters.substring(i + 1);

                permutations(prefix + letter, otherLetters, result);

            }

        }

    }

    } 
}
/*
Some References for doing things 
-Removing all Leading zeros in a string 
s.replaceFirst("^0+(?!$)", "");
-Creating comprator
public static class CustomComparator implements Comparator<c> {
    @Override
    public int compare(c o1, c o2) {
        return o1.score.compareTo(o2.score);
    }
}
-how to write switch case
   switch(x)
   {
    case 1:
    return l;
    ...
    default:
    return m;
   }
-Convert numbers of and to different bases
  Integer.toString(Integer.parseInt(number, base1), base2);
-Split over white spaces:
  myString.split("\\s+");
-how to know if 4 points will form a square or a rectangle:
    public static class point{
            int a,b;
            public point(int a, int b) {
                this.a = a;
                this.b = b;
                }

            @Override
            public String toString() {
                return "point{" + "a=" + a + ", b=" + b + '}';
                }
            }
            public static int distSq(point p, point q)
            {
            return (p.a - q.a)*(p.a - q.a) +
                    (p.b - q.b)*(p.b - q.b);
             }
         public static boolean isSquare(point p1, point p2, point p3, point p4)
    {
        int d2 = distSq(p1, p2);  // from p1 to p2
        int d3 = distSq(p1, p3);  // from p1 to p3
        int d4 = distSq(p1, p4);  // from p1 to p4

        // If lengths if (p1, p2) and (p1, p3) are same, then
        // following conditions must met to form a square.
        // 1) Square of length of (p1, p4) is same as twice
        //    the square of (p1, p2)
        // 2) p4 is at same distance from p2 and p3
        if (d2 == d3 && 2*d2 == d4)
        {
            int d = distSq(p2, p4);
            return (d == distSq(p3, p4) && d == d2);
        }

        // The below two cases are similar to above case
        if (d3 == d4 && 2*d3 == d2)
        {
            int d = distSq(p2, p3);
            return (d == distSq(p2, p4) && d == d3);
        }
        if (d2 == d4 && 2*d2 == d3)
        {
            int d = distSq(p2, p3);
            return (d == distSq(p3, p4) && d == d2);
        }

        return false;
    }
      public static boolean isRectangle(point p1,point p2,point p3,point p4)
    {
      double cx,cy;
      double dd1,dd2,dd3,dd4;
      double x1,y1,x2,y2,x3,y3,x4,y4;
      x1=p1.a;y1=p1.b;x2=p2.a;y2=p2.b;x3=p3.a;y3=p3.b;x4=p4.a;y4=p4.b;
      cx=(x1+x2+x3+x4)/4;
      cy=(y1+y2+y3+y4)/4;

      dd1=(cx-x1)*(cx-x1)+(cy-y1)*(cy-y1);
      dd2=(cx-x2)*(cx-x2)+(cy-y2)*(cy-y2);
      dd3=(cx-x3)*(cx-x3)+(cy-y3)*(cy-y3);
      dd4=(cx-x4)*(cx-x4)+(cy-y4)*(cy-y4);
      return dd1==dd2 && dd1==dd3 && dd1==dd4;
    }
*/
