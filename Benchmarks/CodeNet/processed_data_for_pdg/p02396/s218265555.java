class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int i = 0;
        while(i >= 0){
          i++;
          num = scanner.nextInt();
          if(num != 0){
          System.out.println("Case " + i + ": " + num);
          }else{
          break;
          }
        }
    }
}
