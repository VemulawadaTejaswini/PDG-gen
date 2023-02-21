public class A{
	public CanvasPeer createCanvas(Canvas canvas) {
		if (canvas == null)return super.createCanvas(canvas);
		Component ancestor = canvas;
		for (;;) {
			Component next = (Component) ancestor.getParent();
			if (next == null)break;
			ancestor = next;
		}
		CanvasPeer peer = null;
		long nsView = 0;
		if (ancestor instanceof AppletHolder) {
			if (canvas instanceof CocoaComponent) {
				nsView = (long) ((CocoaComponent)canvas).createNSView();
			}
			try {
				Object[] parms = {canvas, new Long(nsView), ancestor};
				peer = (CanvasPeer) AppletHolderFactory.myCCanvasCreateNew.invoke(null, parms);
			} catch (Throwable e) {
				System.err.println("MyCToolkit createCanvas(): exception: " +e.getMessage());
				e.printStackTrace();
				return null;
			}
			SunToolkit.targetCreatedPeer(canvas, peer);
		} else {
			peer = super.createCanvas(canvas);
		}
		if (showDebugInfo) {
			System.err.println("MyCToolkit createCanvas(): (nsView is 0x" +Long.toHexString(nsView) + ") Canvas " + peer.toString() +" thread " + Thread.currentThread().toString());
		}
		return peer;
	}
}