class Main{
	public static void main(int[] args){
      int a,count;
      count = 0;
      a=args[0];
      while(a<=0){
        a-=args[1];
        count++;
      }
      System.out.println(count);
    }
}