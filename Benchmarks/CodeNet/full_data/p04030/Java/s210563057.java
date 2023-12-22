import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		String b=sc.nextLine();
		String K ;
		List<String> S=new ArrayList<>();
		for(int i=0;i<b.length();i++) {
			K=b.substring(i,i+1);
			if(K.equals("B")&&S.size()>0) {//如果是B空格键就删除前面的元素,如果不是添加进集合中
				S.remove(S.get(i-1));
			}else if(K.equals("1")) {
				S.add(K);
			}else if(K.equals("0")){
				S.add(K);
			}
		}
		for(String a:S) {
		System.out.print(a);
		}
		System.out.println();
	}

}
