public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> all_cards=new ArrayList<String>();
		String[] card_hilt_ary={"S","H","C","D"};
		for(int i=0;i<4;i++){
			for(int j=1;j<=13;j++){
				all_cards.add(card_hilt_ary[i]+" "+String.valueOf(j));
			}
		}
		int being_num=sc.nextInt();
		for(int i=0;i<being_num;i++){
			String hilt=sc.next();
			String num=sc.next();
			all_cards.remove(hilt+" "+num);
		}
		for(int i=0;i<all_cards.size();i++){
			System.out.println(all_cards.get(i));
		}
	}
}
