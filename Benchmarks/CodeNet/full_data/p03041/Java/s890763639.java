public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();

        if(K==1){
            S= new String(S.charAt(K-1)+"").toLowerCase() + S.substring(K);
        }else{
            S= S.substring(0,K-1) + new String(S.charAt(K-1)+"").toLowerCase() + S.substring(K);
        }


        System.out.println(S);


    }

}
