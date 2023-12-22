import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m=0;
		for(int i = 0;i<3;i++){
			if((N%10)!=7){
				N = (N-(N%10))/10;
				m++;
			}			
		else{
    		System.out.println("Yes");
			break;
        }
		if(m==3){
			System.out.println("No");
		}
		}
		}
	}