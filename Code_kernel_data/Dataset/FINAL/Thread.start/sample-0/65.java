public class func{
public void runLocked(int n,long iters){
        for (int j = 0; j < n; ++j) 
            new Thread(new LockedLoop(iters, a, b)).start();
}
}
