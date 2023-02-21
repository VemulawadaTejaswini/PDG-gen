public class A{
	protected void fireMenuSelected(){
		EventListener[] ll = listenerList.getListeners(MenuListener.class);
		
		for (int i = 0; i < ll.length; i++)((MenuListener) ll[i]).menuSelected(menuEvent);
	}
}