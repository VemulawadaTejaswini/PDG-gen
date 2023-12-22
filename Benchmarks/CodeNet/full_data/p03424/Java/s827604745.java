import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	ArrayList<String> array = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String s = scanner.nextString();
			if (String.valueOf(s).length() == 0) { // 文字列が空(長さゼロ)の場合
				break;
			}
			array.add(s);
        }
        int sz = array.size();
        int n = 0;
        boolean i = false;
        for(n = 0;n < sz;n++){
         	if("Y" == array.get(n))i = true;
        }
        if(i){
            System.out.println("Four");
        }else{
          System.out.println("Three");
        }
    }
}