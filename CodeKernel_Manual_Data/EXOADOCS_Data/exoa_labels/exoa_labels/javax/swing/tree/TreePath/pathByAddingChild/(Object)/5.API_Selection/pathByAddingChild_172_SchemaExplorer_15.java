public class A{
	protected void delete(EventObject evt) {
		TreePath tpath = tree.getSelectionPath();
		if (tpath == null) {
			JOptionPane.showMessageDialog(this, "Select an object in Schema to delete.", alert, JOptionPane.WARNING_MESSAGE);
			return ;
		}
		Object nextSibling = null, prevSibling = null;
		
		Object parent = null;
		Object grandparent = null;
		boolean grandparentAsSibling = false;
		
		for(int i=tpath.getPathCount()-1-1; i>=0;i--) {
			if (tpath.getPathCount()-3 > 0) {
			}
			break;
		}
		if (parent == null) {
			JOptionPane.showMessageDialog(this, "Schema object cannot be deleted.", alert, JOptionPane.WARNING_MESSAGE);
			return ;
		}
		
		boolean tofind = true;
		Field[] fs = parent.getClass().getFields();
		for (int i = 0; i < fs.length; i++) {
			if (fs[i].getType().isArray() && (fs[i].getType().getComponentType().isInstance(child) )) {
				try {
					int parentArrLen = Array.getLength(parentArr);
					Object newArr = Array.newInstance(fs[i].getType().getComponentType(), parentArrLen-1);
					tofind = true;
					for (int k=0, m=0; k < parentArrLen; k++) {
						Object match = Array.get(parentArr, k);
						
						if (tofind && match.equals(child)) {
							if (child instanceof MondrianGuiDef.CubeDimension) {
								MondrianGuiDef.CubeDimension matchDim = (MondrianGuiDef.CubeDimension) match;
								MondrianGuiDef.CubeDimension childDim = (MondrianGuiDef.CubeDimension) child;
								if ( ((matchDim.name== null && childDim.name==null) || ( matchDim.name != null && matchDim.name.equals(childDim.name) )) &&((matchDim.caption== null && childDim.caption==null) || ( matchDim.caption != null && matchDim.caption.equals(childDim.caption) )) &&((matchDim.foreignKey== null && childDim.foreignKey==null) || ( matchDim.foreignKey != null && matchDim.foreignKey.equals(childDim.foreignKey) )) ) {
									tofind = false;
									if (k+1 < parentArrLen) {
										nextSibling = Array.get(parentArr, k+1);
									}
									if(k-1 >= 0) {
										prevSibling = Array.get(parentArr, k-1);
									}
									continue;
								}
							} else {
								tofind = false;
								if (k+1 < parentArrLen) {
									nextSibling = Array.get(parentArr, k+1);
								}
								if(k-1 >= 0) {
									prevSibling = Array.get(parentArr, k-1);
								}
								continue;
								
							}
						}
						Array.set(newArr, m++, match);
					}
					if ( (child instanceof MondrianGuiDef.SQL) &&(parent instanceof MondrianGuiDef.ExpressionView) &&(Array.getLength(newArr) < 1) ) {
						if (parent instanceof MondrianGuiDef.KeyExpression) {
							((MondrianGuiDef.Level)grandparent).keyExp = null;
						} else if (parent instanceof MondrianGuiDef.NameExpression) {
							((MondrianGuiDef.Level)grandparent).nameExp = null;
						} else if (parent instanceof MondrianGuiDef.OrdinalExpression) {
							((MondrianGuiDef.Level)grandparent).ordinalExp = null;
						} else if (parent instanceof MondrianGuiDef.ParentExpression) {
							((MondrianGuiDef.Level)grandparent).parentExp = null;
						} else if (parent instanceof MondrianGuiDef.MeasureExpression) {
							((MondrianGuiDef.Measure)grandparent).measureExp = null;
						}
						grandparentAsSibling = true;
					} else {
						fs[i].set(parent, newArr);
					}
					
				} catch(Exception ex) {
				}
				break;
				try {
					if (parent instanceof MondrianGuiDef.Join ||(parent instanceof MondrianGuiDef.Cube && child instanceof MondrianGuiDef.Relation) ||(parent instanceof MondrianGuiDef.Closure && child instanceof MondrianGuiDef.Relation)) {
					} else {
						if (fs[i].get(parent)==child) {
							fs[i].set(parent, null);
							break;
						}
					}
				} catch (Exception ex) {
				}
			}
		}
		
		
		TreeExpansionEvent e = null;
		e = new TreeExpansionEvent(tree, tpath);
		updater.treeCollapsed(e);
		
		if (nextSibling != null) {
			tree.setSelectionPath(tpath.getParentPath().pathByAddingChild(nextSibling));
		} else if(prevSibling != null) {
			tree.setSelectionPath(tpath.getParentPath().pathByAddingChild(prevSibling));
		} else if (grandparentAsSibling){
			tree.setSelectionPath(tpath.getParentPath().getParentPath());
		} else {
			tree.setSelectionPath(tpath.getParentPath());
		}
		refreshTree(tree.getSelectionPath());
	}
}