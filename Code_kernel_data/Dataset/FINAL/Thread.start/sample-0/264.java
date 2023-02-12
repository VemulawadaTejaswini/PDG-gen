public class func{
public void runThreads(final Bean bean,final Serializable mvelExpr1,final Serializable mvelExpr2){
      Thread t = new Thread() {
        public void run() {
          testMvel(bean, mvelExpr1, mvelExpr2);
        }
      };
      t.start();
}
}
