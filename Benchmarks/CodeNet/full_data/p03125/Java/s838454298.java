    public static void main(String[] args) {
        String[] tData = args[0].split(" ",0);
        int tA = Integer.parseInt(tData[0]);
        int tB = Integer.parseInt(tData[1]);

        System.out.println(tB % tA == 0 ? tA + tB : tB - tA);
    }