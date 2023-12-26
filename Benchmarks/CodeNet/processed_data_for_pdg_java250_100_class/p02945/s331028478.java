public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
       	int add=a+b;
      	int sub=a-b;
      	int mul=a*b;
      if(add>=sub){
        if(add>=mul){
		System.out.println(add);
        }else{
           System.out.println(mul);
        }
      }
      else{
             if(sub>=mul){
		System.out.println(sub);
        }else{
           System.out.println(mul);
             }
        }
    }
}
