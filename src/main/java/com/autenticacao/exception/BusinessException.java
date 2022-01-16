package com.autenticacao.exception;


@SuppressWarnings("serial")
public class BusinessException extends RuntimeException{
	
	public BusinessException(String message)
	{
		super(message);
	}

	public String getReason()
	{
		return super.getMessage();
	}

}
