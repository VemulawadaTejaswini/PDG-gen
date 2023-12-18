class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x = 0;
       int count = 1;
       while(sc.hasNext()){
           x = sc.nextInt();
           if(x ==0){
               return;
           }
           System.out.println("Case "+count+": "+ x);
           count++;
       }
       sc.close();
    }
}
