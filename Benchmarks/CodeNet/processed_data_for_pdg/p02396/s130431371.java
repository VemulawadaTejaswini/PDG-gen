public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,i=0;
        int[] c=new int[10001];
        for(;;){
        	x=sc.nextInt();
        	c[i]=x;
        	i=i+1;
        	if(x==0)break;
        }
        for(int a=0;a<i-1;a++)
        	System.out.println("Case"+" "+(a+1)+":"+" "+c[a]);
        sc.close();
 }
}
