public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Integer num1 = scn.nextInt();
        Integer num2 = scn.nextInt();
        Integer area = num1 * num2;
        Integer line = 2*num1 + 2*num2;
        System.out.println(area + " " + line);
        scn.close();
    }
}
