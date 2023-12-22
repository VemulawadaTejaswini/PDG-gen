import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int sum = 0;
int n = input.nextInt();
while(n != 0){
	sum += n%10;
  	n = n/10;
}
if(n % sum == 0){
	System.out.println("Yes");
} 
else{
	System.out.println("No");
}