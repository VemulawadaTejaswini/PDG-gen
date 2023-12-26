public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        String S=sc.next();
        if(K>=S.length()){
            System.out.println(S);
        }else{
            String[] strArray=S.split("");
            int i=0;
            for(i=0;i<S.length();i++){
                if(i<K){
                    System.out.print(strArray[i]);
                }else{
                    System.out.print("...");
                    break;
                }
            }
        }
    }
}
