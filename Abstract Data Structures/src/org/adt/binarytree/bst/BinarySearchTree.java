package org.adt.binarytree.bst;

public class BinarySearchTree<T extends Comparable<? super T>> {

	private Node<T> root;

	public Node<T> insert(T val) {

		Node<T> node = null;

		if (root == null) {
			root = new Node<T>(val);
			node = root;
		} else {
			node = insertHelper(val, root);
		}

		return node;
	}

	public Node<T> insertHelper(T val, Node<T> node) {
		Node<T> result = null;

		try {
			if (node.getData().compareTo(val) < 0) {
				if(node.hasLeft()) {
					result = this.insertHelper(val, node.left);

				}else {
					node.setLeft(new Node<T>(val));
					result = node.left;
				}	
				
			} else if (node.getData().compareTo(val) > 0) {
				if(node.hasRight()) {
					result = this.insertHelper(val, node.right);

				}else {
					node.setRight(new Node<T>(val));
					result = node.right;
				}
				
			} else if (node.getData().equals(val)) {
				throw new ValueExistsInTreeException(val.toString());
				
			}
		} catch (ValueExistsInTreeException e) {
			System.out.println(e);
			e.printStackTrace();
		}

		return result;
	}
	
	public Node<T> remove(T val) {

		Node<T> node = null;

		try {
			if (this.isEmpty()) {
				throw new BSTNotInitiatedException();
			}
		}catch(BSTNotInitiatedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		node = removeHelper(val, root);

		return node;
	}

	public Node<T> removeHelper(T val, Node<T> node) {
		Node<T> result = null;

		try {
			if (node.getData().compareTo(val) < 0) {
				if(node.hasLeft()) {
					result = this.insertHelper(val, node.left);

				}else {
					throw new ValueNotInTreeException(val.toString());
					
				}	
				
			} else if (node.getData().compareTo(val) > 0) {
				if(node.hasRight()) {
					result = this.insertHelper(val, node.right);

				}else {
					throw new ValueNotInTreeException(val.toString());

				}
				
			} else if (node.getData().equals(val)) {
				result = node;
				
				if(node.hasNoChild()) {
					node = null;
					
				}else {
					Node<T> tempRight = node.left;
					Node<T> tempLeft = node.right;
					
					node = replaceMaxNode(node.left);
				}
				
			}
		} catch (ValueNotInTreeException e) {
			System.out.println(e);
			e.printStackTrace();
		}

		return result;
	}
	
	public Node<T> replaceMaxNode(Node<T> node) {
		
		Node<T> result;
		
		if(!node.hasRight()) {
			if(node.hasLeft()) {
				result = node.
			}
		}
		
	}
	
	public boolean isEmpty() {
		if(root == null) {
			return true;
		}
		
		return false;
	}

}
