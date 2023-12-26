class Main{
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    for(int i=0;i<str.length();i++){
      if(i%2!=0){
        if(str.charAt(i)!='L' && str.charAt(i)!='U' && str.charAt(i)!='D'){
          System.out.println("No");
          System.exit(0);
        }
      }
      else {
        if(str.charAt(i)!='R' && str.charAt(i)!='U' && str.charAt(i)!='D'){
          System.out.println("No");
          System.exit(0);
        }
      }
    }
    System.out.println("Yes");
}
}
