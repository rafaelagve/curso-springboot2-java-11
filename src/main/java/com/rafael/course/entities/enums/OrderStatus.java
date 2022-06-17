package com.rafael.course.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT (1),
	PAID (2),
	SHIPPED (3),
	DELIVERRED (4),
	CANCELLED (5);
	
	private int code;
	
	private OrderStatus(int code) // construtor para validar os valores numéricos associados ao enum
	{
		this.code = code;
	}
	
	public int getCode()
	{
		return this.code;
	}
	
	public static OrderStatus valueOf(int code)
	{
		for (OrderStatus value : OrderStatus.values())
		{
			if (value.getCode() == code)
			{
				return value;
			}
		}
		throw new IllegalArgumentException("Ivalid Code");
	}
}
