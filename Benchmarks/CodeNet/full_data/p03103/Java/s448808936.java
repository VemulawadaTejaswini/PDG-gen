import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int m = console.nextInt();
        console.nextLine();

        List<Long> priceList = new ArrayList<Long>(n);
        List<Long> numberList = new ArrayList<Long>(n);

        for(int i = 0; i < n; i++){
            priceList.add(console.nextLong());
            numberList.add(console.nextLong());
            console.nextLine();
        }

        long money = 0;
        while(m > 0){
            long minPrice = Collections.min(priceList);
            int minIndex = priceList.indexOf(Collections.min(priceList));
            long minNumber = numberList.get(minIndex);

            for(int i = 0; i < minNumber && m > 0; i++){
                money += minPrice;
                m--;
            }
            priceList.remove(minIndex);
            numberList.remove(minIndex);
        }
        System.out.println(money);
    }
}
