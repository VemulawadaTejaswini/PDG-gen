public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt(); 
	int alice = 0; 
	int bob = 0; 
	ArrayList<Integer> cardList = new ArrayList<>();
	for(int i=0; i<num; i++){
		cardList.add(sc.nextInt());
	}
	Collections.sort(cardList, Collections.reverseOrder());
	int turn=1;
	for(int card:cardList){
		if(turn%2 == 1){
			alice = alice+card;
		}else{
			bob = bob+card;
		}
		turn++;
	}
	System.out.println(alice - bob);
  }
}
