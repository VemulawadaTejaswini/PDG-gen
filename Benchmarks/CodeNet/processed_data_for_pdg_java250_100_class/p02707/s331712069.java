public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPerson = Integer.parseInt(scanner.nextLine());
        int[] boss = new int[numberOfPerson];
        for (int i = 0; i < boss.length - 1; i++){
            boss[scanner.nextInt() - 1]++;
        }
        for (int i : boss){
            System.out.println(i);
        }
    }
}
