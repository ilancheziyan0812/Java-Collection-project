package com.collectionproject;

public class InvalidChoiceException extends RuntimeException{
    String message;

	public InvalidChoiceException(String message) {
		super();
		this.message = message;
	}
    
    public String getMessage()
    {
    	return message;
    }
}
