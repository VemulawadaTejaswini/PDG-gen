public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int scoreCard[] = new int[N];
        for(int i = 0; i < N; i++){
            scoreCard[i] = sc.nextInt();
        }
        sort(scoreCard);
        int Alice = 0, Bob = 0;
        boolean flg = true;
        for(int i = scoreCard.length -1; i >= 0; i--){
            if(flg){
                Alice += scoreCard[i];
                flg = false;
            }else{
                Bob += scoreCard[i];
                flg = true;
            }
        }
        System.out.println(Alice - Bob);
    }
}
