package org.adt.binarytree.bst;

public class ValueExistsInTreeException extends Exception{
	
	public ValueExistsInTreeException(String value) {
		super("The value " +value +" already exists in the tree.");
	}
}
