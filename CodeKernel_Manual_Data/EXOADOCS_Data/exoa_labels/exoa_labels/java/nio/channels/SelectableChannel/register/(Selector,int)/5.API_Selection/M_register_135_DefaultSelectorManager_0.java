public class A{
	public synchronized SelectionKey register(SelectableChannel selectable, SelectionListener listener)throws IOException{
		Controller controller = null;
		
		if (availableControllers.isEmpty()){
			if (selectorCount >= maximumSelectorCount){
				throw new IOException("Maximum of " + maximumSelectorCount + " selectors reached");
			}
			
			controller = new Controller();
			availableControllers.addFirst(controller);
			keyToControllerMap.put(selectable, controller);
			++selectorCount;
		}
		else{
			controller = (Controller) availableControllers.getFirst();
		}
		
		Selector selector = controller.getSelector();
		
		SelectionKey key = selectable.register(selector, SelectionKey.OP_READ);
		key.attach(listener);
		
		if (selector.keys().size() >= maximumKeyPerSelectorCount){
			availableControllers.removeFirst();
		}
		
		++keyCount;
		return key;
	}
}