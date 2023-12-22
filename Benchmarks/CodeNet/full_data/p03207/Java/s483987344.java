import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		List<Integer> Value = new ArrayList<Integer>();	//Listの宣言	
		for(int i=0;i<num;i++)
		{
			Value.add(sc.nextInt());//Listに追加
		}		
			Collections.sort(Value);//昇順に並べ替え
			Collections.reverse(Value);//逆順に並べ替え
			int total = Value.get(0)/2;
		for(int i=1;i<num;i++)
		{
			total = total + Value.get(i);
		}
		System.out.println(total);
	}		
}
