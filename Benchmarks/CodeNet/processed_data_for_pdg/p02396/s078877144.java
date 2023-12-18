class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int i = 1;
for(;;){
int n = sc.nextInt();
if(n==0) break;
System.out.println("Case "+i+": "+n);
i++;
}
}
}
