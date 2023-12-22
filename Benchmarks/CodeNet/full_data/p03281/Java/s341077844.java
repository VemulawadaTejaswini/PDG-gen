public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int num=1;num<n+1;num++){
            ArrayList<Long> ff = new ArrayList<Long>();
            for (long i = 2; i <= num; i++) {
                if (num % i == 0) {
                    num /= i;
                    ff.add(i);
                    i = 1;
                }
            }
            ArrayList<Long> dd = (ArrayList<Long>) ff.clone();
            ArrayList<Long> ee = new ArrayList<Long>(new LinkedHashSet<>(dd));
            long[] d = new long[ee.size()];
            for (long g:d){
                g = 0;
            }
            for (int i = 0;i < ee.size();i++){
                for (long k:dd){
                    if (ee.get(i) == k){
                        d[i]++;
                    }
                }
            }
            long ans = 1;
            for (int i = 0;i < d.length;i++){
                ans = ans * (d[i]+1);
            }
            if (ans==8) count++;
        }
        System.out.println(count);

    }