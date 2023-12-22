import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    	ArrayList<Integer> number=new ArrayList<>();
		for(int i=0;i<4;i++){
      		number.add(sc.nextInt());
        }
      		
		Collections.sort(number);
      	if(number.get(0)!=1||number.get(3)!=9||number.get(2)!=7||number.get(1)!=4){
        	System.out.println("NO");
        }else{
        	System.out.println("YES");
        }
    }
}