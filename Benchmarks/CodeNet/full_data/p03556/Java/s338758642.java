
public static void main(String []a)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number N);
int N = sc.nextInt();
int num=0;
for(int i=0;i<=N/2;i++)
{
if(i*i<=N)
num=i*i;
}
System.out.println("The maximun square is "+num);
}
