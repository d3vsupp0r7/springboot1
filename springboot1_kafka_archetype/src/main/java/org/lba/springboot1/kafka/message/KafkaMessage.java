package org.lba.springboot1.kafka.message;

import java.io.Serializable;

public class KafkaMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3270842371608807871L;

	private int id;
	private String message;
	
	public KafkaMessage() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "KafkaMessage [id=" + id + ", message=" + message + "]";
	}
	
	
}
