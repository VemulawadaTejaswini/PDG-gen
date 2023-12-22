{
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long max = Math.max(a,b);
        long min = Math.min(a,b);
        HashSet<Long> maxl = getPrimeFactorization(max);
        HashSet<Long> minl = getPrimeFactorization(min);
        int prime = 1;
        for(long p : maxl){
            if(minl.contains(p)){
                prime++;
            }
        }
        System.out.println(prime);
    }