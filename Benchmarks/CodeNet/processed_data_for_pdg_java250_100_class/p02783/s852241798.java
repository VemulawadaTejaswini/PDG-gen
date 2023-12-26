 class Main{
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
            int total=sc.nextInt();
            int act=sc.nextInt();
            int count=0;
            if(total==1){
                  System.out.println(total);
                  System.exit(0);
            }else if(act==1){
                  System.out.println(total);
                  System.exit(0);
            }else{
                  while(total>0){
                        total-=act;
                        count++;
                  }
            }     
            System.out.print(count);
      }
}  
