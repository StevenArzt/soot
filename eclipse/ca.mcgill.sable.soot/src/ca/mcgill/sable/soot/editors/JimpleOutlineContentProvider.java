package ca.mcgill.sable.soot.editors;

import org.eclipse.jface.viewers.ITreeContentProvider;
//import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

//import ca.mcgill.sable.soot.launching.SootConfiguration;

/**
 * @author jlhotak
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */
public class JimpleOutlineContentProvider implements ITreeContentProvider {


	protected static final Object[] EMPTY_ARRAY = new Object[0];

	
	/**
	 * Constructor for OptionsTreeContentProvider.
	 */
	public JimpleOutlineContentProvider() {
		super();
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(Object)
	 */
	public Object[] getChildren(Object parentElement) {
		//System.out.println("in Content Provider getChildren");
		if (parentElement instanceof JimpleOutlineObject) {
			JimpleOutlineObject opt = (JimpleOutlineObject)parentElement;
			if (opt.getChildren() != null) {
				return opt.getChildren().toArray();
			}
			else {
				return EMPTY_ARRAY;
			}
		}
		else {
			return EMPTY_ARRAY;
		}
		
	}
	

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(Object)
	 */
	public Object getParent(Object element) {
		return ((JimpleOutlineObject)element).getParent();
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(Object)
	 */
	public boolean hasChildren(Object element) {
		if (element instanceof JimpleOutlineObject) {
			if (((JimpleOutlineObject)element).getChildren() != null) {
				return true;
			}
			else {
				return false;
			}
		} 
		else {
			return false;
		}
	}

	/**
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(Object)
	 */
	public Object[] getElements(Object inputElement) {
		//System.out.println("in Content Provider getElements");
		return getChildren(inputElement);
	}

	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
	}

	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(Viewer, Object, Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		
		System.out.println("jimple content outline editor input changed ");
	}

}