public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] arr;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int a = arr[0];
        int b = arr[1];
        if( a < b ) {
            System.out.println("a < b");
        }else if(a > b) {
            System.out.println("a > b");
        }else {
            System.out.println("a == b");
        }
    }
}
