package org.adt.binarytree.bst;

public class Node<T extends Comparable<? super T>> {

	private T data;
	Node<T> left;
	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	Node<T> right;
	
	public Node(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	public boolean hasRight() {
		return (this.right != null);
	}
	
	public boolean hasLeft() {
		return (this.left != null);
	}
	
	public boolean hasNoChild() {
		return (!this.hasLeft() && !this.hasRight());
	}
}
