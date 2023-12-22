public class Main {

    class Pair{
        long left = 0;
        long right = 0;
        public long getLeft(){
            return left;
        }
        public long getRight(){
            return right;
        }
    }
    static java.util.Scanner scan = new java.util.Scanner(System.in);

    public static int i(char i){
        return Integer.parseInt(String.valueOf(i));
    }

    static void putArray(int[] a){
        for(int i = 0; i<a.length;i++){
            puts(a[i]);
        }
    }

    public static void main(String[] args) {
        getLine();
        char[] input = getLine()[0].toCharArray();
        int L_INDEX = input.length-1;
        int[] b = new int[L_INDEX];
        int i = 0;
        for(i=0;i<L_INDEX;i++){
            b[i] = Math.abs(i(input[i]) - i(input[i+1]));
        }
        search(b);
    }

    public static void search(int[] a){
        if(a.length == 1){
            puts(a[0]);
            return;
        }
        int L_INDEX = a.length-1;
        int[] b = new int[L_INDEX];
        int i = 0;
        for(i=0;i<L_INDEX;i++){
            b[i] = Math.abs((a[i]) - (a[i+1]));
        }
        search(b);
    }

    public static Pair create(long a, long b){
        try {
            Pair pair = Main.class.newInstance().create(a,b);
            pair.left = a;
            pair.right = b;
            return pair;
        }catch (Exception ignore){
            return null;
        }
    }

    public static void puts(Object mes){
        System.out.println(mes);
    }

    public static long[] getLineLongs(){
        return java.util.stream.Stream.of(getLine()).mapToLong(Long::parseLong).toArray();
    }

    public static int[] getLineInts(){
        return java.util.stream.Stream.of(getLine()).mapToInt(Integer::parseInt).toArray();
    }

    public static String[] getLine(){
        String line = scan.nextLine();
        String[] sp = line.split(" ");
        if(sp.length == 1){
            //System.out.println(line);
            return new String[]{line};
        }else{
            return sp;
        }
    }
}
