//69
public class func{
public void resumeThreads(List<AbstractRenderThread> pThreads,RenderThreadPersistentState pState[]){
    for (int i = 0; i < pThreads.size(); i++) {
      AbstractRenderThread t = pThreads.get(i);
      t.setResumeState(pState[i]);
      new Thread(t).start();
    }
}
}
