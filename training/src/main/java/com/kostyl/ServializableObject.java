package com.kostyl;

import java.io.Serializable;
import java.time.LocalDate;

public class ServializableObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5182872017630648251L;
	private LocalDate date;
	private String message;
	private transient long transientField;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTransientField() {
		return transientField;
	}

	public void setTransientField(long transientField) {
		this.transientField = transientField;
	}

	public ServializableObject(LocalDate date, String message, long transientField) {
		super();
		this.date = date;
		this.message = message;
		this.transientField = transientField;
	}

	@Override
	public String toString() {
		return "ServializableObject [date=" + date + ", message=" + message + "]";
	}

}
