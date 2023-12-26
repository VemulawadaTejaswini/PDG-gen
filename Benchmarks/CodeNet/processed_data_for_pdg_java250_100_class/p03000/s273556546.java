public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=1;
        int sum=0;
        int[] c=new int[a];
        for(int i=0; i<a;i++){
            c[i]=sc.nextInt();
            sum+=c[i];
            if(sum<=b){
                count++;
            }
        }
        System.out.println(count);   
    }
}
