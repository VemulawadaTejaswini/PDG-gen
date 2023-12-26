public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int numberMochi = sc.nextInt();
        int[] diameterArray = new int[numberMochi];
        for(int i = 0; i < numberMochi; i++){
            diameterArray[i] = sc.nextInt();
        }
        Set<Integer> duplicationNumber = new HashSet<Integer>();
        for(int i = 0; i < diameterArray.length; i++){
            duplicationNumber.add(diameterArray[i]);
        }
        System.out.print(duplicationNumber.size());
    }
}
