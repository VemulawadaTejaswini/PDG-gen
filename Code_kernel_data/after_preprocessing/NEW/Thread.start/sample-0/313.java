//313
public class func{
public void launch(final IEditorPart editor,final String mode,final boolean forceLeinLaunchWhenPossible){
        new Thread(new Runnable() {
        @Override public void run() {
          LoadFileAction.run((ClojureEditor) editor, mode, forceLeinLaunchWhenPossible);
        }}).start();
}
}
