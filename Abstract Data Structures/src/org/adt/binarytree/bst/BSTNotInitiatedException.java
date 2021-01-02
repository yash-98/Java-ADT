package org.adt.binarytree.bst;

public class BSTNotInitiatedException extends Exception{
	
	public BSTNotInitiatedException() {
		super("The BST is empty.");
	}
}
