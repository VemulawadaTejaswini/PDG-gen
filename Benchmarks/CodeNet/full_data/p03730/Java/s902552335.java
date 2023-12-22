import java.util.*;
 
class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int count=0;
	for(int i = 1; i <= b; i++) {
		if((a * i) % b == c) {
			count++;
			break;
		}
	}
	if(count==1)System.out.println("YES");
	else System.out.println("NO");
}
}
