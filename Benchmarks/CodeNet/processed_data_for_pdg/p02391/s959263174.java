public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(" ");
        int[] inputs = new int[2];
        int input;
        for (int i = 0; i < line.length; i++) {
            input = Integer.parseInt(line[i]);
            if (input < -1000 || 1000 < input ) System.exit(-1);
            inputs[i] = input;
        }
        int a = inputs[0];
        int b = inputs[1];
        System.out.println("a " + (a < b ? "<": a > b ? ">" : "==") + " b" );
        scan.close();
    }
}
