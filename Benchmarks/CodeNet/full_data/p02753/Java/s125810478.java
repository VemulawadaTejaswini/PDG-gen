	   private static void ret(String target) {
        boolean yORn = false;
        String answer = "No";

        if(target.contains("A")) {
            if(target.contains("B")) {
                yORn = true;
            }
        }
        if(yORn) {
            answer = "Yes";
        }

System.out.print(answer);
    }