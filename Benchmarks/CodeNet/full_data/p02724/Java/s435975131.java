import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int money = Integer.parseInt(sc.nextLine());
      	int work = money;
      	int i = 0;
      
      	while (work >= 500){
        	work = work - 500;
          	i++;
        }
      	
      	int j = 0;
      	while(work >= 5){
        	work = work - 5;
          	j++;
        }
      	
      	System.out.println(i*1000 + j * 5);
	}
}