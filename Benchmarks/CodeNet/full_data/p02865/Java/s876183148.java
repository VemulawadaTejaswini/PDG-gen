public main(String[] args){
  int n = Integer.parseInt(args[0]);
  System.out.print((n + n%2) / 2 - 1);
}