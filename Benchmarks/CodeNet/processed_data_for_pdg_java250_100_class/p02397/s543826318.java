class Main {
	public static void main(String[] args) {
		Scanner as = new Scanner(System.in);
        int x;
        int y;
           x = as.nextInt();
           y = as.nextInt();
           if(x<y){
               System.out.println(x+" "+y);
              }
            else{
               System.out.println(y+" "+x);
              } 
        while(true){
           x = as.nextInt();
           y = as.nextInt();
           if(x==0 && y==0){
               break;
  }
           if(x<y){
              System.out.println(x+" "+y);
             }
           else{
              System.out.println(y+" "+x);
             } 
       }
	}
}
