public class A{
	public Vector setCheckboxesOfDescendants(CheckboxStateOrder order,TreePath path, Vector paths) {
		//...
		Object obj = null;
		//...
		setCheckboxesOfDescendants(order, path.pathByAddingChild(obj), paths);
	}
}