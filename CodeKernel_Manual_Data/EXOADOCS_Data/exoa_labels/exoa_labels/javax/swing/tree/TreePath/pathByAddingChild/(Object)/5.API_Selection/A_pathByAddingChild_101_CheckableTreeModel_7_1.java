public class A{
	public void setCheckboxesOfDescendants(CheckboxStateOrderInterface order,TreePath path) {
		//...
		Object obj = null;
		//...
		setCheckboxesOfDescendants(order, path.pathByAddingChild(obj));
	}
}