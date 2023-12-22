static class pair{
        int a,b;
        public pair(int o, int s){
            a = o;
            b = s;
        }
    }
    static int[] parent;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int totalpairs = n*(n-1)/2;
        parent = new int[n+1];
        Arrays.fill(parent,-1);
        pair[] bridges = new pair[m];
        for (int i = 0; i < m; i++){
            int k = sc.nextInt();
            int l = sc.nextInt();
            bridges[i] = new pair(k,l);
        }
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 1; i <= n; i++){
            hm.put(i,1);
        }
        int[] print = new int[m];
        print[print.length-1] = totalpairs;
        for (int i = bridges.length-1; i >= 1; i--) {
            int num = 0;
            int paro = find(bridges[i].a);
            int pars = find(bridges[i].b);
            if (paro != pars) {
                parent[paro] = pars;
                hm.put(pars, hm.get(pars) + hm.get(paro));
                hm.remove(paro);
            }
            Iterator it =  hm.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                num += (int)pair.getValue()*((int)pair.getValue()-1)/2;
            }
            print[i-1] = totalpairs-num;
        }
        for (int p : print) {
            System.out.println(p);
        }
    }

    static int find(int find){
        if (parent[find] == -1){
            return find;
        }else{
            return find(parent[find]);
        }
    }