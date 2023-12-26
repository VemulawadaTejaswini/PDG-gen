public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> scList = new ArrayList<>();
        for (int i = 0; i >= 0; i++) {
            try {
                scList.add(scan.nextLine());
            } catch (Exception e) {
                break;
            }
        }
        String[] numlist = scList.get(0).split(" ");
        int numA = Integer.parseInt(numlist[0]);
        int numB = Integer.parseInt(numlist[1]);
        int numC = Integer.parseInt(numlist[2]);
        int numD = Integer.parseInt(numlist[3]);
        for (int i = 0; i >= 0; i++) {
            numC = numC - numB;
            if(numC <= 0) {
                System.out.println("Yes");
                break;
            }
            numA = numA - numD;
            if (numA <= 0) {
                System.out.println("No");
                break;
            } 
        } 
    }
}
