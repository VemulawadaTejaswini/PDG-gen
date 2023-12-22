import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int suma = a;
        int sumb = b;
        for(int i = a; i < a + m; i++){
        	if(i <= b){
            	list.add(i);
            }
        }
        for(int i = b; i > b - m; i--){
        	if(i >= a){
            	list.add(i);
            }
        }
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
        	if(i == 0 || list.get(i - 1) != list.get(i)){
            	System.out.println(list.get(i));
            }
        }
	}
}