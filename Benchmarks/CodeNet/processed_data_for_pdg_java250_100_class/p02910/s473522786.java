class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
      String flag = "OK";
      int count = a.length();
      int i = 0;
      if((a.charAt(i))==('L')){
         flag = "NG";
      }else{
      }
      for(i = 1; i < count; i++){
        if(i % 2 != 0){
          if((a.charAt(i))==('R')){
            flag = "NG";
          }else{
          }
        }else{
          if((a.charAt(i))==('L')){
            flag = "NG";
          }else{
          }
        }
          if(flag.equals("NG")){
            break;
          }
        }
      if(flag.equals("OK")){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}
