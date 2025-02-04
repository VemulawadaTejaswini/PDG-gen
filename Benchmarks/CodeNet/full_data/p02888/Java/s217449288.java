import java.io.*;
import java.util.*;
class Main
{
    public static void main(String[] args) throws IOException
    {
        Reader in = new Reader();
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = in.nextInt();
        long[] A = new long[n];
        for (int i=0;i<n;i++)
            A[i] = in.nextLong();

        Arrays.sort(A);
        long ans = 0L;
        for (int i=0;i<n;i++)
        {
            for (int j=i + 1;j<n;j++)
            {
                long rem = A[i] + A[j] - 1;
                int idx = Arrays.binarySearch(A, rem);
                if (idx < 0)
                {
                    idx = -idx - 2;
                    if (idx - j > 0)
                        ans += idx - j;
                }
                else
                {
                    int k = new LastOccurrence().findLastOccurrence(A, rem);
                    ans += k - j;
                }
            }
        }
        System.out.println(ans);
    }
}
class LastOccurrence
{
    // Function to find last occurrence of a given number
    // in sorted array of integers
    public int findLastOccurrence(long[] A, long x)
    {
        // search space is A[left..right]
        int left = 0;
        int right = A.length - 1;

        // initialize the result by -1
        int result = -1;

        // iterate till search space contains at-least one element
        while (left <= right)
        {
            // find the mid value in the search space and
            // compares it with key value
            int mid = (left + right) / 2;

            // if key is found, update the result and
            // go on searching towards right (higher indices)
            if (x == A[mid]) {
                result = mid;
                left = mid + 1;
            }

            // if key is less than the mid element, discard right half
            else if (x < A[mid]) {
                right = mid - 1;
            }

            // if key is more than the mid element, discard left half
            else {
                left = mid + 1;
            }
        }

        // return the leftmost index or -1 if the element is not found
        return result;
    }

}
class Game implements Comparable<Game>
{
    int x;
    int y;

    public Game(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Game ob)
    {
        if (this.x < ob.x)
            return -1;
        else if (this.x > ob.x)
            return 1;
        else
        {
            if (this.y < ob.y)
                return -1;
            return 1;
        }
    }
}
class DSU
{
    int[] parent;
    int[] size;
    //Pass number of total nodes as parameter to the constructor
    DSU(int n)
    {
        this.parent = new int[n];
        this.size = new int[n];
        Arrays.fill(parent, -1);
    }

    public void makeSet(int v)
    {
        parent[v] = v;
        size[v] = 1;
    }

    public int findSet(int v)
    {
        if (v == parent[v]) return v;
        return parent[v] = findSet(parent[v]);
    }

    public void unionSets(int a, int b)
    {
        a = findSet(a);
        b = findSet(b);
        if (a != b)
        {
            if (size[a] < size[b])
            {
                int temp = a;
                a = b;
                b = temp;
            }
            parent[b] = a;
            size[a] += size[b];
        }
    }
}
class FastFourierTransform
{
    private void fft(double[] a, double[] b, boolean invert)
    {
        int count = a.length;
        for (int i = 1, j = 0; i < count; i++)
        {
            int bit = count >> 1;
            for (; j >= bit; bit >>= 1)
                j -= bit;
            j += bit;
            if (i < j)
            {
                double temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                temp = b[i];
                b[i] = b[j];
                b[j] = temp;
            }
        }
        for (int len = 2; len <= count; len <<= 1)
        {
            int halfLen = len >> 1;
            double angle = 2 * Math.PI / len;
            if (invert)
                angle = -angle;
            double wLenA = Math.cos(angle);
            double wLenB = Math.sin(angle);
            for (int i = 0; i < count; i += len)
            {
                double wA = 1;
                double wB = 0;
                for (int j = 0; j < halfLen; j++)
                {
                    double uA = a[i + j];
                    double uB = b[i + j];
                    double vA = a[i + j + halfLen] * wA - b[i + j + halfLen] * wB;
                    double vB = a[i + j + halfLen] * wB + b[i + j + halfLen] * wA;
                    a[i + j] = uA + vA;
                    b[i + j] = uB + vB;
                    a[i + j + halfLen] = uA - vA;
                    b[i + j + halfLen] = uB - vB;
                    double nextWA = wA * wLenA - wB * wLenB;
                    wB = wA * wLenB + wB * wLenA;
                    wA = nextWA;
                }
            }
        }
        if (invert)
        {
            for (int i = 0; i < count; i++)
            {
                a[i] /= count;
                b[i] /= count;
            }
        }
    }

    public long[] multiply(long[] a, long[] b)
    {
        int resultSize = Integer.highestOneBit(Math.max(a.length, b.length) - 1) << 2;
        resultSize = Math.max(resultSize, 1);
        double[] aReal = new double[resultSize];
        double[] aImaginary = new double[resultSize];
        double[] bReal = new double[resultSize];
        double[] bImaginary = new double[resultSize];
        for (int i = 0; i < a.length; i++)
            aReal[i] = a[i];
        for (int i = 0; i < b.length; i++)
            bReal[i] = b[i];
        fft(aReal, aImaginary, false);
        fft(bReal, bImaginary, false);
        for (int i = 0; i < resultSize; i++)
        {
            double real = aReal[i] * bReal[i] - aImaginary[i] * bImaginary[i];
            aImaginary[i] = aImaginary[i] * bReal[i] + bImaginary[i] * aReal[i];
            aReal[i] = real;
        }
        fft(aReal, aImaginary, true);
        long[] result = new long[resultSize];
        for (int i = 0; i < resultSize; i++)
            result[i] = Math.round(aReal[i]);
        return result;
    }
}
class NumberTheory
{
    public boolean isPrime(long n)
    {
        if(n < 2)
            return false;
        for(long x = 2;x * x <= n;x++)
        {
            if(n % x == 0)
                return false;
        }
        return true;
    }
    public ArrayList<Long> primeFactorisation(long n)
    {
        ArrayList<Long> f = new ArrayList<>();
        for(long x=2;x * x <= n;x++)
        {
            while(n % x == 0)
            {
                f.add(x);
                n /= x;
            }
        }
        if(n > 1)
            f.add(n);
        return f;
    }
    public int[] sieveOfEratosthenes(int n)
    {
        //Returns an array with the smallest prime factor for each number and primes marked as 0
        int[] sieve = new int[n + 1];
        for(int x=2;x * x <= n;x++)
        {
            if(sieve[x] != 0)
                continue;
            for(int u=x*x;u<=n;u+=x)
            {
                if(sieve[u] == 0)
                {
                    sieve[u] = x;
                }
            }
        }
        return sieve;
    }
    public long gcd(long a, long b)
    {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
    public long phi(long n)
    {
        double result = n;

        for(long p=2;p*p<=n;p++)
        {
            if(n % p == 0)
            {
                while (n % p == 0)
                    n /= p;
                result *= (1.0 - (1.0 / (double)p));
            }
        }
        if(n > 1)
            result *= (1.0 - (1.0 / (double)n));
        return (long)result;
    }
    public Name extendedEuclid(long a, long b)
    {
        if(b == 0)
            return new Name(a, 1, 0);
        Name n1 = extendedEuclid(b, a % b);
        Name n2 = new Name(n1.d, n1.y, n1.x - (long)Math.floor((double)a / b) * n1.y);
        return n2;
    }
    public long modularExponentiation(long a, long b, long n)
    {
        long d = 1L;
        String bString = Long.toBinaryString(b);
        for(int i=0;i<bString.length();i++)
        {
            d = (d * d) % n;
            if(bString.charAt(i) == '1')
                d = (d * a) % n;
        }
        return d;
    }
}
class Name
{
    long d;
    long x;
    long y;

    public Name(long d, long x, long y)
    {
        this.d = d;
        this.x = x;
        this.y = y;
    }
}
class SuffixArray
{
    int ALPHABET_SZ = 256, N;
    int[] T, lcp, sa, sa2, rank, tmp, c;

    public SuffixArray(String str)
    {
        this(toIntArray(str));
    }

    private static int[] toIntArray(String s)
    {
        int[] text = new int[s.length()];
        for (int i = 0; i < s.length(); i++) text[i] = s.charAt(i);
        return text;
    }

    public SuffixArray(int[] text)
    {
        T = text;
        N = text.length;
        sa = new int[N];
        sa2 = new int[N];
        rank = new int[N];
        c = new int[Math.max(ALPHABET_SZ, N)];
        construct();
        kasai();
    }

    private void construct()
    {
        int i, p, r;
        for (i = 0; i < N; ++i) c[rank[i] = T[i]]++;
        for (i = 1; i < ALPHABET_SZ; ++i) c[i] += c[i - 1];
        for (i = N - 1; i >= 0; --i) sa[--c[T[i]]] = i;
        for (p = 1; p < N; p <<= 1)
        {
            for (r = 0, i = N - p; i < N; ++i) sa2[r++] = i;
            for (i = 0; i < N; ++i) if (sa[i] >= p) sa2[r++] = sa[i] - p;
            Arrays.fill(c, 0, ALPHABET_SZ, 0);
            for (i = 0; i < N; ++i) c[rank[i]]++;
            for (i = 1; i < ALPHABET_SZ; ++i) c[i] += c[i - 1];
            for (i = N - 1; i >= 0; --i) sa[--c[rank[sa2[i]]]] = sa2[i];
            for (sa2[sa[0]] = r = 0, i = 1; i < N; ++i)
            {
                if (!(rank[sa[i - 1]] == rank[sa[i]]
                        && sa[i - 1] + p < N
                        && sa[i] + p < N
                        && rank[sa[i - 1] + p] == rank[sa[i] + p])) r++;
                sa2[sa[i]] = r;
            }
            tmp = rank;
            rank = sa2;
            sa2 = tmp;
            if (r == N - 1) break;
            ALPHABET_SZ = r + 1;
        }
    }

    private void kasai()
    {
        lcp = new int[N];
        int[] inv = new int[N];
        for (int i = 0; i < N; i++) inv[sa[i]] = i;
        for (int i = 0, len = 0; i < N; i++)
        {
            if (inv[i] > 0)
            {
                int k = sa[inv[i] - 1];
                while ((i + len < N) && (k + len < N) && T[i + len] == T[k + len]) len++;
                lcp[inv[i] - 1] = len;
                if (len > 0) len--;
            }
        }
    }
}
class ZAlgorithm
{
    public int[] calculateZ(char input[])
    {
        int Z[] = new int[input.length];
        int left = 0;
        int right = 0;
        for(int k = 1; k < input.length; k++) {
            if(k > right) {
                left = right = k;
                while(right < input.length && input[right] == input[right - left]) {
                    right++;
                }
                Z[k] = right - left;
                right--;
            } else {
                //we are operating inside box
                int k1 = k - left;
                //if value does not stretches till right bound then just copy it.
                if(Z[k1] < right - k + 1) {
                    Z[k] = Z[k1];
                } else { //otherwise try to see if there are more matches.
                    left = k;
                    while(right < input.length && input[right] == input[right - left]) {
                        right++;
                    }
                    Z[k] = right - left;
                    right--;
                }
            }
        }
        return Z;
    }
    public ArrayList<Integer> matchPattern(char text[], char pattern[])
    {
        char newString[] = new char[text.length + pattern.length + 1];
        int i = 0;
        for(char ch : pattern) {
            newString[i] = ch;
            i++;
        }
        newString[i] = '$';
        i++;
        for(char ch : text) {
            newString[i] = ch;
            i++;
        }
        ArrayList<Integer> result = new ArrayList<>();
        int Z[] = calculateZ(newString);

        for(i = 0; i < Z.length ; i++) {
            if(Z[i] == pattern.length) {
                result.add(i - pattern.length - 1);
            }
        }
        return result;
    }
}
class KMPAlgorithm
{
    public int[] computeTemporalArray(char[] pattern)
    {
        int[] lps = new int[pattern.length];

        int index = 0;
        for(int i=1;i<pattern.length;)
        {
            if(pattern[i] == pattern[index])
            {
                lps[i] = index + 1;
                index++;
                i++;
            }
            else
            {
                if(index != 0)
                {
                    index = lps[index - 1];
                }
                else
                {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public ArrayList<Integer> KMPMatcher(char[] text, char[] pattern)
    {
        int[] lps = computeTemporalArray(pattern);

        int j = 0;
        int i = 0;
        int n = text.length;
        int m = pattern.length;
        ArrayList<Integer> indices = new ArrayList<>();
        while(i < n)
        {
            if(pattern[j] == text[i])
            {
                i++;
                j++;
            }
            if(j == m)
            {
                indices.add(i - j);
                j = lps[j - 1];
            }
            else if(i < n && pattern[j] != text[i])
            {
                if(j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
        return indices;
    }
}
class Hashing
{
    public long[] computePowers(long p, int n, long m)
    {
        long[] powers = new long[n];
        powers[0] = 1;
        for(int i=1;i<n;i++)
        {
            powers[i] = (powers[i - 1] * p) % m;
        }
        return powers;
    }
    public long computeHash(String s)
    {
        long p = 31;
        long m = 1_000_000_009;
        long hashValue = 0L;
        long[] powers = computePowers(p, s.length(), m);
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            hashValue = (hashValue + (ch - 'a' + 1) * powers[i]) % m;
        }
        return hashValue;
    }
}
class BasicFunctions
{
    public long min(long[] A)
    {
        long min = Long.MAX_VALUE;
        for(int i=0;i<A.length;i++)
        {
            min = Math.min(min, A[i]);
        }
        return min;
    }
    public long max(long[] A)
    {
        long max = Long.MAX_VALUE;
        for(int i=0;i<A.length;i++)
        {
            max = Math.max(max, A[i]);
        }
        return max;
    }
}
class MergeSortInt
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

}
class MergeSortLong
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(long arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        long L[] = new long[n1];
        long R[] = new long[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(long arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}
class Node
{

    int x;
    int y;

    public Node(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object ob)
    {
        if(ob == null)
            return false;
        if(!(ob instanceof Node))
            return false;
        if(ob == this)
            return true;
        Node obj = (Node)ob;
        if(this.x == obj.x && this.y == obj.y)
            return true;
        return false;
    }

    @Override
    public int hashCode()
    {
        return (int)this.x;
    }
}
class Reader
{
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Reader()
    {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public Reader(String file_name) throws IOException
    {
        din = new DataInputStream(new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public String readLine() throws IOException
    {
        byte[] buf = new byte[64]; // line length
        int cnt = 0, c;
        while ((c = read()) != -1)
        {
            if (c == '\n')
                break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }

    public int nextInt() throws IOException
    {
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do
        {
            ret = ret * 10 + c - '0';
        }  while ((c = read()) >= '0' && c <= '9');

        if (neg)
            return -ret;
        return ret;
    }

    public long nextLong() throws IOException
    {
        long ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }

    public double nextDouble() throws IOException
    {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();

        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');

        if (c == '.')
        {
            while ((c = read()) >= '0' && c <= '9')
            {
                ret += (c - '0') / (div *= 10);
            }
        }

        if (neg)
            return -ret;
        return ret;
    }

    private void fillBuffer() throws IOException
    {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1)
            buffer[0] = -1;
    }

    private byte read() throws IOException
    {
        if (bufferPointer == bytesRead)
            fillBuffer();
        return buffer[bufferPointer++];
    }

    public void close() throws IOException
    {
        if (din == null)
            return;
        din.close();
    }
}
class FenwickTree
{
    public void update(long[] fenwickTree,long delta,int index)
    {
        index += 1;
        while(index < fenwickTree.length)
        {
            fenwickTree[index] += delta;
            index = index + (index & (-index));
        }
    }
    public long prefixSum(long[] fenwickTree,int index)
    {
        long sum = 0L;
        index += 1;
        while(index > 0)
        {
            sum += fenwickTree[index];
            index -= (index & (-index));
        }
        return sum;
    }
}
class SegmentTree
{
    public int nextPowerOfTwo(int num)
    {
        if(num == 0)
            return 1;
        if(num > 0 && (num & (num - 1)) == 0)
            return num;
        while((num &(num - 1)) > 0)
        {
            num = num & (num - 1);
        }
        return num << 1;
    }
    public int[] createSegmentTree(int[] input)
    {
        int np2 = nextPowerOfTwo(input.length);
        int[] segmentTree = new int[np2 * 2 - 1];

        for(int i=0;i<segmentTree.length;i++)
            segmentTree[i] = Integer.MIN_VALUE;

        constructSegmentTree(segmentTree,input,0,input.length-1,0);
        return segmentTree;

    }
    private void constructSegmentTree(int[] segmentTree,int[] input,int low,int high,int pos)
    {
        if(low == high)
        {
            segmentTree[pos] = input[low];
            return;
        }
        int mid = (low + high)/ 2;
        constructSegmentTree(segmentTree,input,low,mid,2*pos + 1);
        constructSegmentTree(segmentTree,input,mid+1,high,2*pos + 2);
        segmentTree[pos] = Math.max(segmentTree[2*pos + 1],segmentTree[2*pos + 2]);
    }
    public int rangeMinimumQuery(int []segmentTree,int qlow,int qhigh,int len)
    {
        return rangeMinimumQuery(segmentTree,0,len-1,qlow,qhigh,0);
    }
    private int rangeMinimumQuery(int segmentTree[],int low,int high,int qlow,int qhigh,int pos)
    {
        if(qlow <= low && qhigh >= high){
            return segmentTree[pos];
        }
        if(qlow > high || qhigh < low){
            return Integer.MIN_VALUE;
        }
        int mid = (low+high)/2;
        return Math.max(rangeMinimumQuery(segmentTree, low, mid, qlow, qhigh, 2 * pos + 1),
                rangeMinimumQuery(segmentTree, mid + 1, high, qlow, qhigh, 2 * pos + 2));
    }
}
class Trie
{

    private class TrieNode
    {
        Map<Character, TrieNode> children;
        boolean endOfWord;
        public TrieNode()
        {
            children = new HashMap<>();
            endOfWord = false;
        }
    }

    private final TrieNode root;
    public Trie()
    {
        root = new TrieNode();
    }

    public void insert(String word)
    {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null)
            {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfWord = true;
    }

    public boolean search(String word)
    {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null)
            {
                return false;
            }
            current = node;
        }
        return current.endOfWord;
    }

    public void delete(String word)
    {
        delete(root, word, 0);
    }

    private boolean delete(TrieNode current, String word, int index)
    {
        if (index == word.length())
        {
            if (!current.endOfWord)
            {
                return false;
            }
            current.endOfWord = false;
            return current.children.size() == 0;
        }
        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);
        if (node == null)
        {
            return false;
        }
        boolean shouldDeleteCurrentNode = delete(node, word, index + 1);

        if (shouldDeleteCurrentNode)
        {
            current.children.remove(ch);
            return current.children.size() == 0;
        }
        return false;
    }
}
class SegmentTreeLazy
{
    public int nextPowerOfTwo(int num)
    {
        if(num == 0)
            return 1;
        if(num > 0 && (num & (num - 1)) == 0)
            return num;
        while((num &(num - 1)) > 0)
        {
            num = num & (num - 1);
        }
        return num << 1;
    }

    public int[] createSegmentTree(int input[])
    {
        int nextPowOfTwo = nextPowerOfTwo(input.length);
        int segmentTree[] = new int[nextPowOfTwo*2 -1];

        for(int i=0; i < segmentTree.length; i++){
            segmentTree[i] = Integer.MAX_VALUE;
        }
        constructMinSegmentTree(segmentTree, input, 0, input.length - 1, 0);
        return segmentTree;
    }

    private void constructMinSegmentTree(int segmentTree[], int input[], int low, int high,int pos)
    {
        if(low == high)
        {
            segmentTree[pos] = input[low];
            return;
        }
        int mid = (low + high)/2;
        constructMinSegmentTree(segmentTree, input, low, mid, 2 * pos + 1);
        constructMinSegmentTree(segmentTree, input, mid + 1, high, 2 * pos + 2);
        segmentTree[pos] = Math.min(segmentTree[2*pos+1], segmentTree[2*pos+2]);
    }

    public void updateSegmentTreeRangeLazy(int input[], int segmentTree[], int lazy[], int startRange, int endRange, int delta)
    {
        updateSegmentTreeRangeLazy(segmentTree, lazy, startRange, endRange, delta, 0, input.length - 1, 0);
    }

    private void updateSegmentTreeRangeLazy(int segmentTree[], int lazy[], int startRange, int endRange, int delta, int low, int high, int pos)
    {
        if(low > high)
        {
            return;
        }
        if (lazy[pos] != 0)
        {
            segmentTree[pos] += lazy[pos];
            if (low != high)
            {
                lazy[2 * pos + 1] += lazy[pos];
                lazy[2 * pos + 2] += lazy[pos];
            }
            lazy[pos] = 0;
        }

        if(startRange > high || endRange < low)
        {
            return;
        }

        if(startRange <= low && endRange >= high)
        {
            segmentTree[pos] += delta;
            if(low != high) {
                lazy[2*pos + 1] += delta;
                lazy[2*pos + 2] += delta;
            }
            return;
        }

        int mid = (low + high)/2;
        updateSegmentTreeRangeLazy(segmentTree, lazy, startRange, endRange, delta, low, mid, 2*pos+1);
        updateSegmentTreeRangeLazy(segmentTree, lazy, startRange, endRange, delta, mid+1, high, 2*pos+2);
        segmentTree[pos] = Math.min(segmentTree[2*pos + 1], segmentTree[2*pos + 2]);
    }

    public int rangeMinimumQueryLazy(int segmentTree[], int lazy[], int qlow, int qhigh, int len)
    {
        return rangeMinimumQueryLazy(segmentTree, lazy, qlow, qhigh, 0, len - 1, 0);
    }

    private int rangeMinimumQueryLazy(int segmentTree[], int lazy[], int qlow, int qhigh, int low, int high, int pos)
    {
        if(low > high)
        {
            return Integer.MAX_VALUE;
        }
        if (lazy[pos] != 0)
        {
            segmentTree[pos] += lazy[pos];
            if (low != high)
            {
                lazy[2 * pos + 1] += lazy[pos];
                lazy[2 * pos + 2] += lazy[pos];
            }
            lazy[pos] = 0;
        }

        if(qlow > high || qhigh < low)
        {
            return Integer.MAX_VALUE;
        }

        if(qlow <= low && qhigh >= high)
        {
            return segmentTree[pos];
        }

        int mid = (low+high)/2;
        return Math.min(rangeMinimumQueryLazy(segmentTree, lazy, qlow, qhigh, low, mid, 2 * pos + 1), rangeMinimumQueryLazy(segmentTree, lazy,  qlow, qhigh, mid + 1, high, 2 * pos + 2));
    }
}