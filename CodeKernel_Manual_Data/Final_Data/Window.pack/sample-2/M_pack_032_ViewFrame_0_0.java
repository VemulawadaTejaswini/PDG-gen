public class A{
	public voidpropertyChange(PropertyChangeEvent event){
		System.out.println("ViewFrame::FrameInitializer->propertyChange()");
		if (event.getPropertyName().equals(Controller.modelProperty)){
			Form form = (Form)event.getNewValue();
			String title = form.getTitle();
			int width = form.getWidth()*8;
			int height = form.getHeight()*22;
			
			if (title.equals("")){
				ViewFrame.this.setTitle("GNUe Forms - Untitled");
			}
			else{
				ViewFrame.this.setTitle("GNUe Forms - " + title);
			}
			
			if (width == 0 || height == 0){
				ViewFrame.this.pack();
			}
			else{
				ViewFrame.this.setSize(width, height);
			}
			
			PageController firstPage = new PageController();
			firstPage.setModel(form.getFirstPage());
			ViewFrame.this.getContentPane().add(firstPage, BorderLayout.CENTER);
		}
	}
}