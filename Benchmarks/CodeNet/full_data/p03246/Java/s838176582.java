private static int solution_2(int length, int[] seq) {
        int overflow = 0;
        int p1 = seq[0];
        int p2 = seq[1];

        for (int i = 2; i< seq.length; i++){
            if (p1 == p2){
                overflow++;
            }
            else if (i %2 == 0){
                if (seq[i] != p1)
                    overflow++;
                p1 = seq[i];
            }
            else if (i%2 != 0){
                if (seq[i] != p2)
                    overflow++;
            }
        }
        return overflow;
    }