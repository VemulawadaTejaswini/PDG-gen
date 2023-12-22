import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int x = 0;
		a: for(int i = l; i < r; i++){
				for(int j = i+1; j <= r; j++){
						System.out.println(i+" "+j);
						System.out.println(x);
						break a;
					}else if(x == 2018){
						System.out.println(2018);
					}
				}
			}
		}
	}
}