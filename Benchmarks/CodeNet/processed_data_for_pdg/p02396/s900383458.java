public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,x;
        for(i=0;;i++){ 
            x=sc.nextInt();
            if(x==0){
                break;
            }
            System.out.println("Case "+(i+1)+": "+x);                
        }
    }
}
