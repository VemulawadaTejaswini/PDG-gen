class Main{
      public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          int width=sc.nextInt();
          int height=sc.nextInt();
          int area=width*height;
          int s=2*(width+height);
          System.out.println(area+" "+s);
      }
}
