public class func{
public void resize(){
        new Thread(new Runnable() {
            public void run() {
                EclipseSWTMapView.super.resize();
            }
        }, "BrowserResizer").start();
}
}
