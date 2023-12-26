public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=0;
        int j=0;
        int S=0;
        roopout:
        for(i=1;i<=9;i++){
            for(j=1;j<=9;j++){
                S=i*j;
                if(S==N){
                    System.out.println("Yes");
                    break roopout;
                }
            }
            if(i>=9&&j>=9){
                System.out.println("No");
            }
        }
    }
}
