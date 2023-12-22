import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sold = 0;
        int money = Integer.parseInt(br.readLine());
        sold += money-1; //first person: 1G/item. leave only 1G to go home
        int price = 2;
        for(int n=1;n<N;n++){
        	money = Integer.parseInt(br.readLine());
        	if(money==price) price++;
        	// he cant buy anything, and I need to raise the price so that he can go home
        	else sold += (money-1)/price;
        	//he can buy some items. final items should be (money-1)%price G so that he leave only 1G
        }
        System.out.println(sold);
    }
}