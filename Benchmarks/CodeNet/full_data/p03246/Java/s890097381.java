private static int solution(int n, int[] seq) {
        HashMap<Integer, Integer> bucket = new HashMap<>();
        int overflow = 0;
        for (int i=0; i< seq.length; i++){
            if (bucket.containsKey(seq[i])){
                int val = bucket.get(seq[i]);
                bucket.put(seq[i], val+1);
            }
            else
                bucket.put(seq[i], 1);
        }
        int counter = 0;
        for (Map.Entry map : bucket.entrySet()){
            int val = (int) map.getValue();
            if (val > 2)
                overflow++;
            if (val == 1){
                counter++;
                if (counter == 2){
                    overflow++;
                    counter = 0;
                }
            }
        }
        return overflow;
    }