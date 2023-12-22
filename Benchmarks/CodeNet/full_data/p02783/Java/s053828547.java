class Main{
	public static void main(String[] args){
      int a,count;
      count = 0;
      a=Integer.parseInt(args[0]);
      while(a<=0){
        a-=Integer.parseInt(args[1]);
        count++;
      }
      System.out.println(count);
    }
}