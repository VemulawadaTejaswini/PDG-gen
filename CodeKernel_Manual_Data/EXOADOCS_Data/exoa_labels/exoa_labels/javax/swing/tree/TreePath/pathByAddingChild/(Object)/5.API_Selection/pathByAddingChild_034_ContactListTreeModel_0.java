public class A{
	public void addChild(Object parent, Object child) {
		TreePath tp = getTreePathTo(new TreePath(getRoot()), parent);
		if(tp != null) {
			if(parent instanceof ContactGroup) {
				ContactGroup cg = (ContactGroup) parent;
				cg.add(child);
				System.out.println("Added to ContactGroup");
				fireTreeNodesInserted(new TreeModelEvent(parent, tp.pathByAddingChild(child)));
				fireTreeStructureChanged(new TreeModelEvent(parent, tp.pathByAddingChild(child)));
				Object[] path = tp.getPath();
				int[] indices = {cg.size()-1};
				Object[] children = {child};
				super.fireTreeStructureChanged(cg, path, indices, children);
			} else if(parent instanceof Contact) {
				Contact c = (Contact) parent;
				if(child instanceof ContactMethod) {
					ContactMethod cm = (ContactMethod) child;
					c.addContactMethod(cm);
					System.out.println("Added ContactMethod to Contact");
					fireTreeNodesInserted(new TreeModelEvent(parent, tp.pathByAddingChild(child)));
					fireTreeStructureChanged(new TreeModelEvent(parent, tp.pathByAddingChild(child)));
				} else {
					System.err.println("Can only add ContactMethods to Contacts");
				}
			} else {
				System.err.println("Can only add to ContactGroups and Contacts");
			}
		} else {
			System.err.println("Parent not in tree");
		}
	}
}