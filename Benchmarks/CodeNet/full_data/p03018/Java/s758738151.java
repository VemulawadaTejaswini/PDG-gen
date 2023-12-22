import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();
        sc.close();
        int counter = 0;
        int i = 0;
        List<String> list = convertStringToList(s);
        System.out.println(list);

        if(s.length()<2){
            counter = 0;
        } else{
        while(s.length()-2>i){
            if(list.get(i).equals("A")){
            if(list.get(i+1).equals("B") && list.get(i+2).equals("C")){
                list.remove(i);
                list.add(i, "B");
                list.remove(i+1);
                list.add(i+1, "C");
                list.remove(i+2);
                list.add(i+2, "A");
                counter++;
                i = 0;

            } else {
                i++;
            }
        }
            i++;
        }
    }

		// 出力
		System.out.println(counter);
    }
    public static List<String> convertStringToList(String str) {
        int index = 0;
        List<String> list = new ArrayList<String>();
        while (index < str.length()) {
            list.add(String.valueOf(str.charAt(index)));
            index++;
        }
        return list;
    }
}
