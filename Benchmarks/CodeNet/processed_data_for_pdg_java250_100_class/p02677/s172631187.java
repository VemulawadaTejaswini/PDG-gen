class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Double A=sc.nextDouble();
    Double B=sc.nextDouble();
    Double H=sc.nextDouble();
    Double M=sc.nextDouble();
    Double kakudo=Math.abs(H*30+30*(M/60)-M*6);
    if(kakudo>360-kakudo){
      kakudo=360-kakudo;
    }
    System.out.println(Math.sqrt(Math.pow(A,2)+Math.pow(B,2)-2*A*B*Math.cos(Math.toRadians(kakudo))));
  }
}
