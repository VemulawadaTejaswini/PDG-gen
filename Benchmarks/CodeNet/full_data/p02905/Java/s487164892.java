public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        BigInteger []nums = new BigInteger[n];
        for (int i = 0 ; i < n ; i++){
            nums[i] = in.nextBigInteger();
        }
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0 ; i < n - 1; i++){
            for (int j = i + 1; j < n; j++){
                sum = sum.add(lcm(nums[i], nums[j]));
            }
            sum = sum.mod(BigInteger.valueOf(998244353));
        }
        System.out.println(sum.toString());
    }


    public static BigInteger gcd(BigInteger a, BigInteger b)
    {
        if (a.equals(BigInteger.ZERO))
            return b;
        return gcd(b.mod(a), a);
    }

    public static BigInteger lcm(BigInteger a, BigInteger b)
    {
        return (a.multiply(b)).divide(gcd(a, b));
    }