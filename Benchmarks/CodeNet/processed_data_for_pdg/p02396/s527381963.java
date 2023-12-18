public class Main{
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        for(int i=1;;i++){
            int k=sc.nextInt();
            if(k==0){
                break;
            }
            System.out.println("Case "+i+": "+k);
        }
    }
}
