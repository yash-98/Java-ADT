package org.adt.binarytree.bst;

public class ValueNotInTreeException extends Exception{
	
	public ValueNotInTreeException(String value) {
		super("The value " +value +" does not exist in the tree.");
	}
}
