import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.stream.*;
// import static java.util.Arrays.compare;
import static java.util.Arrays.fill;
import static java.util.Arrays.sort;
import static java.util.Collections.sort;
import static java.util.Comparator.reverseOrder;
// import static java.util.List.of;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import java.math.BigInteger;
import static java.math.BigInteger.ZERO;
import static java.math.BigInteger.ONE;
// import static java.math.BigInteger.TWO;
import static java.math.BigInteger.TEN;

import static java.lang.Math.PI;
import static java.lang.Math.E;
import static java.lang.Math.min;
import static java.lang.Math.max;
import static java.lang.Math.abs;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;
import static java.lang.Math.asin;
import static java.lang.Math.acos;
import static java.lang.Math.atan;
import static java.lang.Math.atan2;
import static java.lang.Math.hypot;
import static java.lang.Math.sqrt;
import static java.lang.Math.log;
import static java.lang.Math.exp;
import static java.lang.String.format;
import static java.lang.System.exit;
import static java.lang.System.currentTimeMillis;

class Main {
    public static long MOD = 1_000_000_007;

    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        long width = fsc.nextLong()<<1;
        long damage = fsc.nextLong();
        long[][] monster = new long[n][2];
        for(int i=0;i<n;i++){
            long x=fsc.nextLong();
            long hp=fsc.nextLong();
            monster[i][0]=x;
            monster[i][1]=LongUtil.cld(hp, damage);
        }
        fsc.close();
        sort(monster, (u, v) -> Long.compare(u[0], v[0]));
        long[] x=new long[n];
        long[] h=new long[n];
        for(int i=0;i<n;i++){
            x[i]=monster[i][0];
            h[i]=monster[i][1];
        }
        LazySegmentTree t=new LazySegmentTree(h, (u, v)->u+v, 0, (u, v)->u-v, (u, v)->u+v, (u, l)->u*l);
        int l=0, r=0;
        long sum=0;
        while(true){
            while(l<n && t.query(l, l+1)<=0) l++;
            if(l>=n) break;
            while(r<n && x[r]<=x[l]+width) r++;
            long attack=t.query(l, l+1);
            sum+=attack;
            t.applyForSegment(l, r, attack);
        }
        System.out.println(sum);
    }

    static class LazySegmentTree{
        private long[] tree;
        private long[] lazy;
        private long idElm;
        private long defaultLazyValue;
        private LongBinaryOperator operator;
        private LongBinaryOperator updateFunction;
        private LongBinaryOperator mergeUpdateFunction;
        private BiFunction<Long, Integer, Long> collapseUpdateFunction;
        private int size;
        private int leafs;
        private int height;
        private int baseOfLeaf;
    
        public LazySegmentTree(long[] t, LongBinaryOperator operator, long idElm, LongBinaryOperator updateFunction, LongBinaryOperator mergeUpdateFunction , BiFunction<Long, Integer, Long> collapseUpdateFunction, long defaultLazyValue){
            int n = t.length;
            this.operator = operator;
            this.idElm = idElm;
            this.updateFunction = updateFunction;
            this.mergeUpdateFunction = mergeUpdateFunction;
            this.collapseUpdateFunction = collapseUpdateFunction;
            this.defaultLazyValue = defaultLazyValue;
            this.height = minimumPowerOfTwo(n);
            this.leafs = 1 << this.height;
            this.baseOfLeaf = this.leafs - 1;
            this.size = 2 * this.leafs - 1;
            this.lazy = new long[this.size];
            this.tree = new long[this.size];
            for(int i = size - 1; i >= 0; i--) {
                if(i >= baseOfLeaf + n) {
                    this.tree[i] = this.idElm;
                } else if(isLeaf(i)) {
                    this.tree[i] = t[i - baseOfLeaf];
                } else{
                    this.tree[i] = operator.applyAsLong(this.tree[left(i)], this.tree[right(i)]);
                }
            }
        }
        public LazySegmentTree(long[] t, LongBinaryOperator operator, long idElm, LongBinaryOperator updateFunction, LongBinaryOperator mergeUpdateFunction, BiFunction<Long, Integer, Long> collapseUpdateFunction){
            this(t, operator, idElm, updateFunction, mergeUpdateFunction, collapseUpdateFunction, 0);
        }
    
        public void applyForSegment(int l, int r, long v){
            applyForSegment(new Range(l, r), 0, new Range(0, leafs), v);
        }
        private long applyForSegment(Range queryRange, int k, Range treeRange, long v){
            evaluation(k, treeRange);
            if(queryRange.crosses(treeRange)) {
                if(queryRange.contains(treeRange)) {
                    lazy[k] = mergeUpdateFunction.applyAsLong(lazy[k], v);
                    return updateFunction.applyAsLong(tree[k], collapseUpdateFunction.apply(lazy[k], treeRange.length()));
                } else {
                    long left = applyForSegment(queryRange, left(k), treeRange.halfLeft(), v);
                    long right = applyForSegment(queryRange, right(k), treeRange.halfRight(), v);
                    return tree[k] = operator.applyAsLong(left, right);
                }
            } else{
                return tree[k];
            }
        }
        public void applyForPoint(int i, long v){
            tree[baseOfLeaf + i] = updateFunction.applyAsLong(tree[baseOfLeaf + i], collapseUpdateFunction.apply(v, 1));
        }
    
        public long query(int l, int r){
            return query(new Range(l, r), 0, new Range(0, leafs));
        }
        private long query(Range queryRange, int k, Range treeRange){
            evaluation(k, treeRange);
            if(!queryRange.crosses(treeRange)){
                return idElm;
            } else if(queryRange.contains(treeRange)){
                return tree[k];
            } else{
                long left = query(queryRange, left(k), treeRange.halfLeft());
                long right = query(queryRange, right(k), treeRange.halfRight());
                return operator.applyAsLong(left, right);
            }
        }
        private void evaluation(int k, Range r){
            if(lazy[k] != defaultLazyValue) {
                if(!isLeaf(k)){
                    lazy[left(k)] = mergeUpdateFunction.applyAsLong(lazy[left(k)], lazy[k]);
                    lazy[right(k)] = mergeUpdateFunction.applyAsLong(lazy[right(k)], lazy[k]);
                }
                tree[k] = updateFunction.applyAsLong(tree[k], collapseUpdateFunction.apply(lazy[k], r.length()));
                lazy[k] = defaultLazyValue;
            }
        }
        private int minimumPowerOfTwo(int n){
            int i = 0;
            while(1 << ++i < n);
            return i;
        }
        private boolean isLeaf(int i){
            return i >= baseOfLeaf;
        }
        private int left(int k){
            return 2 * k + 1;
        }
        private int right(int k){
            return 2 * k + 2;
        }
    
        private static class Range{
            private int left, right;
            Range(int left, int right){
                this.left = left;
                this.right = right;
            }
            boolean crosses(Range r){
                return this.left < r.right && r.left < this.right;
            }
            boolean contains(Range r){
                return this.left <= r.left && r.right <= this.right;
            }
            Range halfLeft(){
                return new Range(left, (left + right) / 2);
            }
            Range halfRight(){
                return new Range((left + right) / 2, right);
            }
            int length(){
                return right - left;
            }
        }
    
        public String toString(){
            StringBuilder sb = new StringBuilder();
            for(int h = 0; h <= height; h++) {
                for(int i = (1 << h) - 1; i < (1 << (h + 1)) - 1; i++) {
                    sb.append(tree[i]).append(" ");
                }
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    static class IntUtil {
        private static final int MAX=Integer.MAX_VALUE;
        private static final int MIN=Integer.MIN_VALUE;

        public static int min(int... a) {
            int ret = MAX;
            for (int c : a) {
                ret = Math.min(ret, c);
            }
            return ret;
        }

        public static int max(int... a) {
            int ret = MIN;
            for (int c : a) {
                ret = Math.max(ret, c);
            }
            return ret;
        }

        /**
         * Caluculate the ceil of a/b. Returns the smallest integer greater than or
         * equal to a/b while 'a/b' rounds fractional parts to ZERO.
         * 
         * @param a
         * @param b
         * @return the smallest integer greater than or equal to a/b
         */
        public static int cld(int a, int b) {
            if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
                if (b > 0) {
                    return (a + b - 1) / b;
                } else {
                    return (a + b + 1) / b;
                }
            } else {
                return a / b;
            }
        }

        /**
         * Caluculate the floor of a/b. Returns the largest integer less than or equal
         * to a/b while 'a/b' rounds fractional parts to ZERO.
         * 
         * @param a
         * @param b
         * @return the largest integer less than or equal to a/b
         */
        public static int fld(int a, int b) {
            if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
                return a / b;
            } else {
                if (b > 0) {
                    return (a - b + 1) / b;
                } else {
                    return (a - b - 1) / b;
                }
            }
        }

        public static int fold(IntBinaryOperator func, int a, int... b) {
            int ret = a;
            for (int c : b) {
                ret = func.applyAsInt(ret, c);
            }
            return ret;
        }
    }

    static class LongUtil {
        private static final long MAX=Long.MAX_VALUE;
        private static final long MIN=Long.MIN_VALUE;

        public static long min(long... a) {
            long ret = MAX;
            for (long c : a) {
                ret = Math.min(ret, c);
            }
            return ret;
        }

        public static long max(long... a) {
            long ret = MIN;
            for (long c : a) {
                ret = Math.max(ret, c);
            }
            return ret;
        }

        /**
         * Caluculate the ceil of a/b. Returns the smallest integer greater than or
         * equal to a/b while 'a/b' rounds fractional parts to ZERO.
         * 
         * @param a
         * @param b
         * @return the smallest integer greater than or equal to a/b
         */
        public static long cld(long a, long b) {
            if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
                if (b > 0) {
                    return (a + b - 1) / b;
                } else {
                    return (a + b + 1) / b;
                }
            } else {
                return a / b;
            }
        }

        /**
         * Caluculate the floor of a/b. Returns the largest integer less than or equal
         * to a/b while 'a/b' rounds fractional parts to ZERO.
         * 
         * @param a
         * @param b
         * @return the largest integer less than or equal to a/b
         */
        public static long fld(long a, long b) {
            if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
                return a / b;
            } else {
                if (b > 0) {
                    return (a - b + 1) / b;
                } else {
                    return (a - b - 1) / b;
                }
            }
        }

        public static long fold(LongBinaryOperator func, long a, long... b) {
            long ret = a;
            for (long c : b) {
                ret = func.applyAsLong(ret, c);
            }
            return ret;
        }
    }

    static class MathUtil{
        /**
         * Enumarate primes less than n.
         * 
         * @param n
         * @return {@code ArrayList} that holds primes.
         */
        public static ArrayList<Integer> eratosthenes(int n) {
            int[] div = eratosthenesDivisors(n);
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = 2; i <= n; i++) {
                if (div[i] == i) {
                    result.add(i);
                }
            }
            return result;
        }
        /**
         * execute eratosthenes's prime-enumerate algorithm. a[i] holds the greatest
         * divisor of i. if a[i]=i, i is a prime number. This arrary enables you to
         * prime-factorize in O(log n) time. (<O(sqrt n)).
         * 
         * @param n
         * @return divisor array.
         */
        public static int[] eratosthenesDivisors(int n) {
            int[] divisors = new int[n + 1];
            if (n <= 0) {
                return null;
            }
            for (int i = 1; i <= n; i++) {
                if ((i & 1) != 0) {
                    divisors[i] = i;
                } else {
                    divisors[i] = 2;
                }
            }
            for (long i = 3; i <= n; i += 2) {
                if (divisors[(int) i] == (int) i) {
                    for (long j = i * i; j <= n; j += (i << 1)) {
                        divisors[(int) j] = (int) i;
                    }
                }
            }
            return divisors;
        }

        /**
         * Caluculate prime-factorization.
         * 
         * @param n
         * @return {@code HashMap} of {prime: index}
         */
        public static HashMap<Long, Integer> primeFactorization(long n) {
            HashMap<Long, Integer> primes = new HashMap<Long, Integer>();
            for (long p = 2; p * p <= n; p++) {
                int q = 0;
                while (n % p == 0) {
                    n /= p;
                    q++;
                }
                if (q > 0) {
                    primes.put(p, q);
                }
            }
            if (n > 1) {
                primes.put(n, 1);
            }
            return primes;
        }

        private static HashMap<Long, Integer> lcm(HashMap<Long, Integer> amap, HashMap<Long, Integer> bmap) {
            if (amap.size() < bmap.size()) {
                return lcm(bmap, amap);
            }
            HashMap<Long, Integer> lcm = amap;
            for (Map.Entry<Long, Integer> e : bmap.entrySet()) {
                long prime = e.getKey();
                if (lcm.containsKey(prime)) {
                    lcm.put(prime, Math.max(lcm.get(prime), e.getValue()));
                } else {
                    lcm.put(prime, e.getValue());
                }
            }
            return lcm;
        }

        private static HashMap<Long, Integer> lcm(HashMap<Long, Integer> amap, long b) {
            HashMap<Long, Integer> bmap = primeFactorization(b);
            return lcm(amap, bmap);
        }

        public static HashMap<Long, Integer> lcm(long... a) {
            HashMap<Long, Integer> amap = new HashMap<>();
            for (long c : a) {
                amap = lcm(amap, c);
            }
            return amap;
        }
        public static long unsafeLCM(long a, long b) {
            return a * b / gcd(a, b);
        }

        /**
         * Caluculate the GCD of (a, b)/
         * 
         * @param a first value
         * @param b second value
         * @return GCD(a, b)
         */
        public static long gcd(long a, long b) {
            if (a < b) {
                return gcd(b, a);
            }
            if(b == 0) {
                return a;
            } else if(a == 0) {
                return b;
            }
            long r = a % b;
            while (r != 0) {
                a = b;
                b = r;
                r = a % b;
            }
            return b;
        }

        public static long gcd(long... a){
            long gcd = 0;
            for(long c:a){
                gcd = gcd(gcd, c);
            }
            return gcd;
        }

        /**
         * Return one of the solutions to {@code ax+by=gcd(a, b)}.
         * 
         * @return {@code x}, {@code y}, {@code gcd(a, b)}.
         * @param a a of ax+by=gcd(a, b).
         * @param b b of ax+by=gcd(a, b). class ReferenceLong is a reference type of long.
         */
        public static long[] extGCD(long a, long b) {
            ReferenceLong x = new ReferenceLong();
            ReferenceLong y = new ReferenceLong();
            long[] ret = new long[3];
            ret[2] = extGCD(a, b, x, y);
            ret[0] = x.v;
            ret[1] = y.v;
            return ret;
        }

        private static long extGCD(long a, long b, ReferenceLong x, ReferenceLong y) {
            if (b == 0) {
                x.v = 1;
                y.v = 0;
                return a;
            }
            long d = extGCD(b, a % b, y, x);
            y.v -= a / b * x.v;
            return d;
        }

        private static class ReferenceLong {
            long v = 0;
        }
    }

    static class ArrayUtil{
        public static int[] input(FastScanner fsc, int n){
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=fsc.nextInt();
            }
            return a;
        }
        public static int[][] input(FastScanner fsc, int n, int m){
            int[][] a=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=fsc.nextInt();
                }
            }
            return a;
        }
        /**
         * s[i] is the sum of the range [0, i) in a.
         * @param a
         * @return cumulative sum array of a.
         */
        public static int[] cumsum(int[] a){
            int n=a.length;
            int[] s=new int[n+1];
            for(int i=1;i<=n;i++){
                s[i]=s[i-1]+a[i-1];
            }
            return s;
        }
        public static int[][] cumsum(int[][] a){
            int n=a.length;
            int m=a[0].length;
            int[][] s=new int[n+1][m+1];
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    s[i][j]=s[i-1][j]+s[i][j-1]-s[i-1][j-1]+a[i-1][j-1];
                }
            }
            return s;
        }
        public static void reverse(int[] a, int begin, int end){
            for(int i=begin;i<begin+(end-begin)/2;i++){
                swap(a, i, begin+end-i-1);
            }
        }
        public static void reverse(int[] a){
            reverse(a, 0, a.length);
        }
        public static void revSort(int[] a){
            Arrays.sort(a);
            reverse(a);
        }
        public static int[] nextPermutation(int[] a){
            int[] ret=a.clone();
            int n=ret.length;
            for(int i=n-1;i>=1;i--){
                if(ret[i]>ret[i-1]){
                    int fail=n, pass=i;
                    while(fail-pass>1){
                        int mid=pass+(fail-pass)/2;
                        if(ret[mid]>ret[i-1]) pass=mid;
                        else fail=mid;
                    }
                    swap(ret, pass, i-1);
                    reverse(ret, i, n);
                    return ret;
                }
            }
            return null;
        }
        public static int[] predPermutation(int[] a){
            int[] ret=a.clone();
            int n=ret.length;
            for(int i=n-1;i>=1;i--){
                if(ret[i]<ret[i-1]){
                    int fail=n, pass=i;
                    while(fail-pass>1){
                        int mid=pass+(fail-pass)/2;
                        if(ret[mid]<ret[i-1]) pass=mid;
                        else fail=mid;
                    }
                    swap(ret, pass, i-1);
                    reverse(ret, i, n);
                    return ret;
                }
            }
            return null;
        }
        public static void swap(int[] a, int u, int v){
            int tmp=a[u];
            a[u]=a[v];
            a[v]=tmp;
        }
        public static int compare(int[] a, int[] b){
            for(int i=0;i<a.length;i++){
                if(i>=b.length){
                    return -1;
                } else if(a[i]>b[i]){
                    return 1;
                } else if(a[i]<b[i]){
                    return -1;
                }
            }
            if(a.length<b.length){
                return 1;
            } else{
                return 0;
            }
        }
        public static boolean equals(int[] a, int[] b){
            return compare(a, b)==0;
        }

        /**
         *      IntArray
         * _________________________
         *      LongArray
         */

        public static long[] linput(FastScanner fsc, int n){
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=fsc.nextLong();
            }
            return a;
        }
        public static long[][] linput(FastScanner fsc, int n, int m){
            long[][] a=new long[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=fsc.nextLong();
                }
            }
            return a;
        }
        /**
         * s[i] is the sum of the range [0, i) in a.
         * @param a
         * @return cumulative sum array of a.
         */
        public static long[] cumsum(long[] a){
            int n=a.length;
            long[] s=new long[n+1];
            for(int i=1;i<=n;i++){
                s[i]=s[i-1]+a[i-1];
            }
            return s;
        }
        public static long[][] cumsum(long[][] a){
            int n=a.length;
            int m=a[0].length;
            long[][] s=new long[n+1][m+1];
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    s[i][j]=s[i-1][j]+s[i][j-1]-s[i-1][j-1]+a[i-1][j-1];
                }
            }
            return s;
        }
        public static void reverse(long[] a, int begin, int end){
            for(int i=begin;i<begin+(end-begin)/2;i++){
                long tmp=a[i];
                a[i]=a[begin+end-i-1];
                a[begin+end-i-1]=tmp;
            }
        }
        public static void reverse(long[] a){
            reverse(a, 0, a.length);
        }
        public static void revSort(long[] a){
            Arrays.sort(a);
            reverse(a);
        }
        public static long[] compress(long[] a){
            int n=a.length;
            long[] sorted = a.clone();
            Arrays.sort(sorted);
            for(int i=0;i<n;i++){
                int l=0, r=n;
                while(r-l>1){
                    int m=l+(r-l)/2;
                    if(sorted[m]<=a[i]) l=m;
                    else r=m;
                }
                a[i]=l;
            }
            return sorted;
        }
        public static long[] nextPermutation(long[] a){
            long[] ret=a.clone();
            int n=ret.length;
            for(int i=n-1;i>=1;i--){
                if(ret[i]>ret[i-1]){
                    int fail=n, pass=i;
                    while(fail-pass>1){
                        int mid=pass+(fail-pass)/2;
                        if(ret[mid]>ret[i-1]) pass=mid;
                        else fail=mid;
                    }
                    swap(ret, pass, i-1);
                    reverse(ret, i, n);
                    return ret;
                }
            }
            return null;
        }
        public static long[] predPermutation(long[] a){
            long[] ret=a.clone();
            int n=ret.length;
            for(int i=n-1;i>=1;i--){
                if(ret[i]<ret[i-1]){
                    int fail=n, pass=i;
                    while(fail-pass>1){
                        int mid=pass+(fail-pass)/2;
                        if(ret[mid]<ret[i-1]) pass=mid;
                        else fail=mid;
                    }
                    swap(ret, pass, i-1);
                    reverse(ret, i, n);
                    return ret;
                }
            }
            return null;
        }
        public static void swap(long[] a, int u, int v){
            long tmp=a[u];
            a[u]=a[v];
            a[v]=tmp;
        }
        public static int compare(long[] a, long[] b){
            for(int i=0;i<a.length;i++){
                if(i>=b.length){
                    return -1;
                } else if(a[i]>b[i]){
                    return 1;
                } else if(a[i]<b[i]){
                    return -1;
                }
            }
            if(a.length<b.length){
                return 1;
            } else{
                return 0;
            }
        }
        public static boolean equals(long[] a, long[] b){
            return compare(a, b)==0;
        }
    }

    static class ModInt{
        public static long mul(long... a) {
            long ret = 1;
            for (long c : a) {
                ret *= c;
                ret %= MOD;
            }
            return ret;
        }

        public static long div(long a, long... b) {
            long ret = a;
            for (long c : b) {
                ret *= inv(c);
                ret %= MOD;
            }
            return ret;
        }

        /**
         * Caluculate the value b s.t. a*b mod MOD = 1.
         * 
         * @param a
         * @return inverse of a
         */
        public static long inv(long a) {
            long b = MOD;
            long u = 1, v = 0;
            while (b >= 1) {
                long t = a / b;
                a -= t * b;
                long tmp1 = a;
                a = b;
                b = tmp1;
                u -= t * v;
                long tmp2 = u;
                u = v;
                v = tmp2;
            }
            u %= MOD;
            return u >= 0 ? u : u + MOD;
        }

        /**
         * Caluculate the combination nCr.
         * 
         * @param n left
         * @param r right
         * @return nCr
         */
        public static long comb(long n, long r) {
            if (n < r) {
                return 0;
            }
            r = Math.min(r, n - r);
            long res = 1;
            for (long d = 1; d <= r; d++) {
                res = div(mul(res, n--), d);
            }
            return res;
        }

        public static long[] fact(int n){
            long[] fact=new long[n+1];
            for(long i=0;i<=n;i++){
                if(i<=1){
                    fact[(int)i]=1;
                } else{
                    fact[(int)i]=mul(fact[(int)i-1], i);
                }
            }
            return fact;
        }
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte())
                return buffer[ptr++];
            else
                return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr]))
                ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext())
                throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
                throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public void close(){
            try{
                in.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}