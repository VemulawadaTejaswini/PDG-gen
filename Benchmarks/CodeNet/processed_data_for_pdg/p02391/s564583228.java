class Main{
public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    try{
int a = scan.nextInt();
int b = scan.nextInt();
if(a<b){
System.out.println("a < b");
}
if(a>b){
System.out.println("a > b");
}
if(a==b){
System.out.println("a == b");
}
}catch (InputMismatchException e) {
        	System.out.println("try again!!");
        }
}
}
