class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        if(N%2!=0){
            System.out.print("No");
        }else{
            if(S.substring(0,N/2).equals(S.substring(N/2))){
                System.out.print("Yes");
            }else{
                System.out.print("No");
            }
        }
        System.out.flush();
  }
}
