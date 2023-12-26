public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int numOfGame = stdIn.nextInt();
        int taroScore = 0;
        int hanakoScore = 0;
        for(int i = 0; i < numOfGame; i++) {
            String taroHand = stdIn.next();
            String hanakoHand = stdIn.next();
            int result = taroHand.compareTo(hanakoHand);
            if(result > 0) {
                taroScore += 3;
            } else if(result < 0) {
                hanakoScore += 3;
            } else {
                taroScore++;
                hanakoScore++;
            }
        }
        System.out.println(taroScore + " " + hanakoScore);
    }
}
