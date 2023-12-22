import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        long m = kbd.nextLong();
        long sum = 0;
        List<Long> cards = new ArrayList<Long>();
        for (long i = 0; i < n; i++) {
            long temp = kbd.nextLong();
            cards.add(temp);
        }

        for (long j = 0; j < m; j++) {
            int tempB = kbd.nextInt();
            long tempC = kbd.nextLong();
            changeCards(cards,tempB,tempC);
        }

        sum = cards.stream().mapToLong(x -> x).sum();

        System.out.println(sum);
    }

    public static void changeCards(List<Long> cards,int b,long c){
        Collections.sort(cards);
            for(int i=0;i<b;i++){
                if(cards.get(i)>c){
                    return;
                }else{
                    cards.set(i, c);
                }
            }
    }
}