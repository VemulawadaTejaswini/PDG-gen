public class A{
	protected void fireMenuSelected(){
		MenuListener[] listeners = getMenuListeners();
		
		for (int index = 0; index < listeners.length; ++index)listeners[index].menuSelected(menuEvent);
	}
}