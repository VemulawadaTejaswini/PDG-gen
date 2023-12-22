import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    static FastScanner sc = new FastScanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {
        long l = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        int m = sc.nextInt();
        
        long[] ld = new long[18];
        long[] rd = new long[18];
        long p10 = 1;
        for (int d = 0; d < 18; d++) {
            ld[d] = bs(l, a, b, p10);
            p10 *= 10;
            rd[d] = bs(l, a, b, p10);
        }
        var fac = new ModIntFactory(m);
        var zero = fac.create(0);
        var one = fac.create(1);
        var ten = fac.create(10);
        var mia = fac.create(a);
        var mib = fac.create(b);

        class Vector3 {
            ModIntFactory.ModInt v1, v2, v3;
            Vector3(ModIntFactory.ModInt v1, ModIntFactory.ModInt v2, ModIntFactory.ModInt v3) {
                this.v1 = v1; this.v2 = v2; this.v3 = v3;
            }
            ModIntFactory.ModInt get1() {
                return v1;
            }
            ModIntFactory.ModInt get2() {
                return v2;
            }
            ModIntFactory.ModInt get3() {
                return v3;
            }
            public String toString() {
                return "[" + v1 + ", " + v2 + ", " + v3 + "]";
            }
        }
 
        class Matrix33 {
            ModIntFactory.ModInt a11, a12, a13, a21, a22, a23, a31, a32, a33;
            Matrix33(
                ModIntFactory.ModInt a11, ModIntFactory.ModInt a12, ModIntFactory.ModInt a13,
                ModIntFactory.ModInt a21, ModIntFactory.ModInt a22, ModIntFactory.ModInt a23,
                ModIntFactory.ModInt a31, ModIntFactory.ModInt a32, ModIntFactory.ModInt a33
            ) {
                this.a11 = a11; this.a12 = a12; this.a13 = a13;
                this.a21 = a21; this.a22 = a22; this.a23 = a23;
                this.a31 = a31; this.a32 = a32; this.a33 = a33;
            }
            Matrix33 mul(Matrix33 B) {
                var c11 = a11.mul(B.a11).add(a12.mul(B.a21)).add(a13.mul(B.a31));
                var c12 = a11.mul(B.a12).add(a12.mul(B.a22)).add(a13.mul(B.a32));
                var c13 = a11.mul(B.a13).add(a12.mul(B.a23)).add(a13.mul(B.a33));
                var c21 = a21.mul(B.a11).add(a22.mul(B.a21)).add(a23.mul(B.a31));
                var c22 = a21.mul(B.a12).add(a22.mul(B.a22)).add(a23.mul(B.a32));
                var c23 = a21.mul(B.a13).add(a22.mul(B.a23)).add(a23.mul(B.a33));
                var c31 = a31.mul(B.a11).add(a32.mul(B.a21)).add(a33.mul(B.a31));
                var c32 = a31.mul(B.a12).add(a32.mul(B.a22)).add(a33.mul(B.a32));
                var c33 = a31.mul(B.a13).add(a32.mul(B.a23)).add(a33.mul(B.a33));
                return new Matrix33(c11, c12, c13, c21, c22, c23, c31, c32, c33);
            }
            Vector3 mul(Vector3 v) {
                return new Vector3(
                    a11.mul(v.v1).add(a12.mul(v.v2)).add(a13.mul(v.v3)),
                    a21.mul(v.v1).add(a22.mul(v.v2)).add(a23.mul(v.v3)),
                    a31.mul(v.v1).add(a23.mul(v.v2)).add(a33.mul(v.v3))
                );
            }
            Matrix33 pow(long n) {
                var res = new Matrix33(one, zero, zero, zero, one, zero, zero, zero, one);
                var pow2 = this;
                long idx = 1;
                while (n > 0) {
                    long lsb = n & -n;
                    for (; lsb != idx; idx <<= 1) {
                        pow2 = pow2.mul(pow2);
                    }
                    res = res.mul(pow2);
                    n ^= lsb;
                }
                return res;
            }
            public String toString() {
                return "[[" + a11 + ", " + a12 + ", " + a13 + "], [" + a21 + ", " + a22 + ", " + a23 + "], [" + a31 + ", " + a32 + ", " + a33 + "]]";
            }
        }

        var A = new Matrix33(one, zero, zero, zero, one, zero, zero, zero, one);
        for (int d = 0; d < 18; d++) {
            var B = new Matrix33(ten.pow(d + 1), mib, mia, zero, one, one, zero, zero, one);
            A = B.pow(rd[d] - ld[d]).mul(A);
        }
        var ans = A.mul(new Vector3(zero, zero, one)).get1();
        pw.println(ans);
        pw.flush();
        pw.close();
    }
 
    public static long bs(long l, long a, long b, long val) {
        long lft = -1, rgt = l;
        while (rgt - lft > 1) {
            long mid = (lft + rgt) >> 1;
            if (a + b * mid < val) {
                lft = mid;
            } else {
                rgt = mid;
            }
        }
        return rgt;
    }

    static class ModIntFactory {
        private final ModArithmetic ma;
        private final int mod;
    
        public ModIntFactory(int mod) {
            this.ma = ModArithmetic.of(mod);
            this.mod = mod;
        }
    
        public ModInt create(long value) {
            if ((value %= mod) < 0) value += mod;
            if (ma instanceof ModArithmetic.ModArithmeticMontgomery) {
                return new ModInt(((ModArithmetic.ModArithmeticMontgomery) ma).generate(value));
            }
            return new ModInt((int) value);
        }
    
        class ModInt {
            private int value;
            private ModInt(int value) {
                this.value = value;
            }
            public int mod() {
                return mod;
            }
            public ModInt add(ModInt mi) {
                return new ModInt(ma.add(value, mi.value));
            }
            public ModInt sub(ModInt mi) {
                return new ModInt(ma.sub(value, mi.value));
            }
            public ModInt mul(ModInt mi) {
                return new ModInt(ma.mul(value, mi.value));
            }
            public ModInt div(ModInt mi) {
                return new ModInt(ma.div(value, mi.value));
            }
            public ModInt inv() {
                return new ModInt(ma.inv(value));
            }
            public ModInt pow(long b) {
                return new ModInt(ma.pow(value, b));
            }
            public int value() {
                if (ma instanceof ModArithmetic.ModArithmeticMontgomery) {
                    return ((ModArithmetic.ModArithmeticMontgomery) ma).reduce(value);
                }
                return value;
            }
            @Override
            public String toString() {
                return String.valueOf(value());
            }
            @Override
            public boolean equals(Object o) {
                if (o instanceof ModInt) {
                    ModInt mi = (ModInt) o;
                    return mod() == mi.mod() && value() == mi.value();
                }
                return false;
            }
            @Override
            public int hashCode() {
                return (1 * 37 + mod()) * 37 + value();
            }
        }
    
        private interface ModArithmetic {
            public int mod();
            public int add(int a, int b);
            public int sub(int a, int b);
            public int mul(int a, int b);
            public default int div(int a, int b) {
                return mul(a, inv(b));
            }
            public int inv(int a);
            public int pow(int a, long b);
        
            public static ModArithmetic of(int mod) {
                if (mod <= 0) {
                    throw new IllegalArgumentException();
                } else if (mod == 1) {
                    return new ModArithmetic1();
                } else if (mod == 2) {
                    return new ModArithmetic2();
                } else if (mod == 998244353) {
                    return new ModArithmetic998244353();
                } else if (mod == 1000000007) {
                    return new ModArithmetic1000000007();
                } else if ((mod & 1) == 1) {
                    return new ModArithmeticMontgomery(mod);
                } else {
                    return new ModArithmeticBarrett(mod);
                }
            }
        
            static final class ModArithmetic1 implements ModArithmetic {
                public int mod() {return 1;}
                public int add(int a, int b) {return 0;}
                public int sub(int a, int b) {return 0;}
                public int mul(int a, int b) {return 0;}
                public int inv(int a) {throw new ArithmeticException("divide by zero");}
                public int pow(int a, long b) {return 0;}
            }
            static final class ModArithmetic2 implements ModArithmetic {
                public int mod() {return 2;}
                public int add(int a, int b) {return a ^ b;}
                public int sub(int a, int b) {return a ^ b;}
                public int mul(int a, int b) {return a & b;}
                public int inv(int a) {
                    if (a == 0) throw new ArithmeticException("divide by zero");
                    return a;
                }
                public int pow(int a, long b) {
                    if (b == 0) return 1;
                    return a;
                }
            }
            static final class ModArithmetic998244353 implements ModArithmetic {
                private final int mod = 998244353;
                public int mod() {
                    return mod;
                }
                public int add(int a, int b) {
                    int res = a + b;
                    return res >= mod ? res - mod : res;
                }
                public int sub(int a, int b) {
                    int res = a - b;
                    return res < 0 ? res + mod : res;
                }
                public int mul(int a, int b) {
                    return (int) (((long) a * b) % mod);
                }
                public int inv(int a) {
                    int b = mod;
                    long u = 1, v = 0;
                    while (b >= 1) {
                        long t = a / b;
                        a -= t * b;
                        int tmp1 = a; a = b; b = tmp1;
                        u -= t * v;
                        long tmp2 = u; u = v; v = tmp2;
                    }
                    u %= mod;
                    if (a != 1) {
                        throw new ArithmeticException("divide by zero");
                    }
                    return (int) (u < 0 ? u + mod : u);
                }
                public int pow(int a, long b) {
                    if (b < 0) throw new ArithmeticException("negative power");
                    long res = 1;
                    long pow2 = a, idx = 1;
                    while (b > 0) {
                        long lsb = b & -b;
                        for (; lsb != idx; idx <<= 1) {
                            pow2 = (pow2 * pow2) % mod;
                        }
                        res = (res * pow2) % mod;
                        b ^= lsb;
                    }
                    return (int) res;
                }
            }
            static final class ModArithmetic1000000007 implements ModArithmetic {
                private final int mod = 1000000007;
                public int mod() {
                    return mod;
                }
                public int add(int a, int b) {
                    int res = a + b;
                    return res >= mod ? res - mod : res;
                }
                public int sub(int a, int b) {
                    int res = a - b;
                    return res < 0 ? res + mod : res;
                }
                public int mul(int a, int b) {
                    return (int) (((long) a * b) % mod);
                }
                public int div(int a, int b) {
                    return mul(a, inv(b));
                }
                public int inv(int a) {
                    int b = mod;
                    long u = 1, v = 0;
                    while (b >= 1) {
                        long t = a / b;
                        a -= t * b;
                        int tmp1 = a; a = b; b = tmp1;
                        u -= t * v;
                        long tmp2 = u; u = v; v = tmp2;
                    }
                    u %= mod;
                    if (a != 1) {
                        throw new ArithmeticException("divide by zero");
                    }
                    return (int) (u < 0 ? u + mod : u);
                }
                public int pow(int a, long b) {
                    if (b < 0) throw new ArithmeticException("negative power");
                    long res = 1;
                    long pow2 = a, idx = 1;
                    while (b > 0) {
                        long lsb = b & -b;
                        for (; lsb != idx; idx <<= 1) {
                            pow2 = (pow2 * pow2) % mod;
                        }
                        res = (res * pow2) % mod;
                        b ^= lsb;
                    }
                    return (int) res;
                }
            }
            static final class ModArithmeticMontgomery extends ModArithmeticDynamic {
                private final long negInv;
                private final long r2, r3;
        
                private ModArithmeticMontgomery(int mod) {
                    super(mod);
                    long inv = 0;
                    long s = 1, t = 0;
                    for (int i = 0; i < 32; i++) {
                        if ((t & 1) == 0) {
                            t += mod;
                            inv += s;
                        }
                        t >>= 1;
                        s <<= 1;
                    }
                    long r = (1l << 32) % mod;
                    this.negInv = inv;
                    this.r2 = (r * r) % mod;
                    this.r3 = (r2 * r) % mod;
                }
                private int generate(long x) {
                    return reduce(x * r2);
                }
                private int reduce(long x) {
                    x = (x + ((x * negInv) & 0xffff_ffffl) * mod) >>> 32;
                    return (int) (x < mod ? x : x - mod);
                }
                @Override
                public int mul(int a, int b) {
                    return reduce((long) a * b);
                }
                @Override
                public int inv(int a) {
                    a = super.inv(a);
                    return reduce(a * r3);
                }
                @Override
                public int pow(int a, long b) {
                    return generate(super.pow(a, b));
                }
            }
            static final class ModArithmeticBarrett extends ModArithmeticDynamic {
                private static final long mask = 0xffff_ffffl;
                private final long mh;
                private final long ml;
                private ModArithmeticBarrett(int mod) {
                    super(mod);
                    /**
                     * m = floor(2^64/mod)
                     * 2^64 = p*mod + q, 2^32 = a*mod + b
                     * => (a*mod + b)^2 = p*mod + q
                     * => p = mod*a^2 + 2ab + floor(b^2/mod)
                     */
                    long a = (1l << 32) / mod;
                    long b = (1l << 32) % mod;
                    long m = a * a * mod + 2 * a * b + (b * b) / mod;
                    mh = m >>> 32;
                    ml = m & mask;
                }
                private int reduce(long x) {
                    long z = (x & mask) * ml;
                    z = (x & mask) * mh + (x >>> 32) * ml + (z >>> 32);
                    z = (x >>> 32) * mh + (z >>> 32);
                    x -= z * mod;
                    return (int) (x < mod ? x : x - mod);
                }
                @Override
                public int mul(int a, int b) {
                    return reduce((long) a * b);
                }
            }
            static class ModArithmeticDynamic implements ModArithmetic {
                final int mod;
                public ModArithmeticDynamic(int mod) {
                    this.mod = mod;
                }
                public int mod() {
                    return mod;
                }
                public int add(int a, int b) {
                    int sum = a + b;
                    return sum >= mod ? sum - mod : sum;
                }
                public int sub(int a, int b) {
                    int sum = a - b;
                    return sum < 0 ? sum + mod : sum;
                }
                public int mul(int a, int b) {
                    return (int) (((long) a * b) % mod);
                }
                public int inv(int a) {
                    int b = mod;
                    long u = 1, v = 0;
                    while (b >= 1) {
                        long t = a / b;
                        a -= t * b;
                        int tmp1 = a; a = b; b = tmp1;
                        u -= t * v;
                        long tmp2 = u; u = v; v = tmp2;
                    }
                    u %= mod;
                    if (a != 1) {
                        throw new ArithmeticException("divide by zero");
                    }
                    return (int) (u < 0 ? u + mod : u);
                }
                public int pow(int a, long b) {
                    if (b < 0) throw new ArithmeticException("negative power");
                    int res = 1;
                    int pow2 = a;
                    long idx = 1;
                    while (b > 0) {
                        long lsb = b & -b;
                        for (; lsb != idx; idx <<= 1) {
                            pow2 = mul(pow2, pow2);
                        }
                        res = mul(res, pow2);
                        b ^= lsb;
                    }
                    return res;
                }
            }
        }
    }
    
    static class FastScanner {
        private final InputStream in;
        private final byte[] buf = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        public FastScanner(InputStream in) {this.in = in;}
        private boolean hasNextByte() {
            if (ptr < buflen) return true;
            ptr = 0;
            try {buflen = in.read(buf);}
            catch (final IOException e) {e.printStackTrace();}
            return buflen > 0;
        }
        private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
        public boolean hasNext() {
            while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
            return hasNextByte();
        }
        private StringBuilder nextSequence() {
            if (!hasNext()) throw new NoSuchElementException();
            final StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
            return sb;
        }
        public String next() {
            return nextSequence().toString();
        }
        public String next(int len) {
            return new String(nextChars(len));
        }
        public char[] nextChars() {
            final StringBuilder sb = nextSequence();
            int l = sb.length();
            char[] dst = new char[l];
            sb.getChars(0, l, dst, 0);
            return dst;
        }
        public char[] nextChars(int len) {
            if (!hasNext()) throw new NoSuchElementException();
            char[] s = new char[len];
            int i = 0;
            int b = readByte();
            while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
            if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
            return s;
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {minus = true; b = readByte();}
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while (true) {
                if ('0' <= b && b <= '9') n = n * 10 + b - '0';
                else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {return Math.toIntExact(nextLong());}
        public double nextDouble() {return Double.parseDouble(next());}
    }

    static int[] nextInts(int n) {
        var dat = new int[n];
        Arrays.setAll(dat, i -> sc.nextInt());
        return dat;
    }

    static long[] nextLongs(int n) {
        var dat = new long[n];
        Arrays.setAll(dat, i -> sc.nextLong());
        return dat;
    }
}
