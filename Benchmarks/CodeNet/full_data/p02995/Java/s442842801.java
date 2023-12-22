import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      long A=sc.nextLong();
      long B=sc.nextLong();
      long C=sc.nextLong();
      long D=sc.nextLong();
      long cnt=0;

      long lcmCD;
      long numAC,numAD,numACD,numBC,numBD,numBCD;
      long ansA,ansB,ans;

      lcmCD=lcm(C,D);

      numAC=(A-1)/C;  //A未満でCの倍数の個数(切り捨てされる)
      numAD=(A-1)/D;  //A未満でDの倍数の個数(切り捨てされる)
      numACD=(A-1)/lcmCD;  //A未満でLCM(C,D)の倍数の個数(切り捨てされる)
      ansA=(A-1)-(numAC+numAD-numACD);  //A未満でC,D,LCMで割り切れない数

      numBC=B/C;  //B以下でCの倍数の個数(切り捨てされる)
      numBD=B/D;  //B以下でDの倍数の個数(切り捨てされる)
      numBCD=B/lcmCD;  //B以下でLCM(C,D)の倍数の個数(切り捨てされる)
      ansB=B-(numBC+numBD-numBCD);  //B以下でC,D,LCMで割り切れない数

      ans=ansB-ansA;

      System.out.println(ans);
    }

  public static long gcd(long i,long j){
    if(i<j){return gcd(j,i);} //大きい方をiとして再実行}
    if(i%j==0){return j;}
    else{return gcd(j,i%j);}
  }
  public static long lcm(long i,long j){
    return i*j/gcd(i,j);
  }

}
