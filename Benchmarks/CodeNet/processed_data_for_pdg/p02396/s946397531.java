public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int[] output = new int[10000];
        int i;
        for(i = 0; input != 0; i++){
            output[i] = input;
            input = scan.nextInt();
        }
        int j;
        for(j = 0; j < i; j++){
            System.out.println("Case " + (j+1) + ": " + output[j]);
        }
    }
}
