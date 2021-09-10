package com.gowthamrajk.practice;

public class Bulb 
{
	private boolean status;

	public Bulb() { }
	
	public Bulb(boolean status) {
		this.status = status;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void turnOn() {
		setStatus(true);
	}
	
	public void turnOff() {
		setStatus(false);
	}
}