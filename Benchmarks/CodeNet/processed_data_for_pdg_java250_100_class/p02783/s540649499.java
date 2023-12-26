public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int input1 = scanner.nextInt();
    int input2 = scanner.nextInt();
    int a=input1,b=0;
    while(true){
	a=a-input2;
	b++;
    if(a<=0) break;
    }
    System.out.println(b);
    }
}
