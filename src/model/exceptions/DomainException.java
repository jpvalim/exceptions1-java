package model.exceptions;

//Extends de RunTimeException - O compilador não obriga a tratar
//Extends de Exception - obriga a tratar como por exemplo o parseException

public class DomainException extends Exception{
	private static final long serialVersionUID = 1L;// aqui é porque é uma classe serializeble 
	
	public DomainException(String msg) {
		super(msg);
	}
	
	
	
}
