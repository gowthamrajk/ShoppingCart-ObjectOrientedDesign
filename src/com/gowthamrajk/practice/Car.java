package com.gowthamrajk.practice;

class Car {
	
	private int initialSpeed;
	
	public Car(int initialSpeed) {
		this.initialSpeed = initialSpeed;
	}

	public int getInitialSpeed() {
		return initialSpeed;
	}

	public void setInitialSpeed(int initialSpeed) {
		this.initialSpeed = initialSpeed;
	}
	
	public void increaseAcceleration() {
		this.initialSpeed += 10;
	}

	@Override
	public String toString() {
		return "Speed of the Car : " + initialSpeed;
	}
}