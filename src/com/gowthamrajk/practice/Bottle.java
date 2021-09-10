package com.gowthamrajk.practice;

public class Bottle {
	
	private int totalCapacity;
	private int currentCapacity;

	public Bottle(int totalCapacity, int currentCapacity) {
		this.totalCapacity = totalCapacity;
		this.currentCapacity = currentCapacity;
	}

	public int getCurrentCapacity() {
		return currentCapacity;
	}

	public void setCurrentCapacity(int currentCapacity) {
		this.currentCapacity = currentCapacity;
	}

	public int getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(int totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	public void sipBottle(int sippedQuantity) {
		this.currentCapacity -= sippedQuantity;
	}
	
	public void emptyBottle(){
		this.currentCapacity = 0;
	}
	
	public void fillBottle(int fillingQuantity) {
		this.currentCapacity += fillingQuantity;
	}
}
