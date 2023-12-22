import java.util.*;
public class Main{
    static int max(ArrayList<Integer> cards){
	int max = cards.get(0);
	int count = 0;
	for (int i = 0; i < cards.size(); i++){
	    if (max < cards.get(i)){
		max = cards.get(i);
		count = i;
	    }
	   
	}
	 return count;
    }
	
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	ArrayList<Integer> cards = new ArrayList<Integer>();
	for (int i = 0;i < N; i++){
	    cards.add(sc.nextInt());
	}
        int[] score = {0,0};
	int max = 0;
	int count = 0;
	while (cards.size() > 0){
	    score[count % 2] += cards.get(max(cards));
	    //System.out.println((count%2) + " " + score[count % 2]);
	    cards.remove(max(cards));
	    count++;
	}
	System.out.println(score[0] - score[1]);
    }
}
