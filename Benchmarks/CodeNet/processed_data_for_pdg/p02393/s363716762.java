public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] x = new int[3];
        for(int i = 0; i < 3; i++){
            x[i] = scn.nextInt();
        }
        Arrays.sort(x);
        System.out.println(x[0]+" "+x[1]+" "+x[2]);
    }
}
