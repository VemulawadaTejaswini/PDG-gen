class Main{
public static void main(String[] args){
Scanner stdIn = new Scanner(System.in);
int a = stdIn.nextInt();
int i=0;
while (a!=0){
i++;
System.out.println("Case "+i+": " +a);
a = stdIn.nextInt();
}
}
}
