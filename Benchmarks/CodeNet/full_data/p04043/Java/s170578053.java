import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if( a==7 || b==7 || c==7){
			if(a==7){
				if(b==5 && c==5){
				System.out.println("yes");
				}else{
				System.out.println("no");
				}
			}else if(b==7){
				if(c==5 && a==5){
				System.out.println("yes");
				}else{
				System.out.println("no");
				}
			}else if(c==7){
			 	if(a==5 && b==5){
			  	System.out.println("yes");
			 	}else{
			  	System.out.println("no");
                }
            }else{
            }
		}else{
			System.out.println("no");
		}
    	sc.close();
	}
}