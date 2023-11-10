package com.axa.labs18;

public class RacingCar extends Car {
	private String driver;
	private double turboFactor;
	
	public RacingCar(String model, String driver, double turboFactor) {
		super(model);
		this.driver = driver;
		this.turboFactor = turboFactor;
	}
	
	public void accelerate(double seconds) {
		super.accelerate(seconds * turboFactor);
	}

	public String getDriver() {
		return driver;
	}

	private void setDriver(String driver) {
		this.driver = driver;
	}

	public double getTurboFactor() {
		return turboFactor;
	}

	private void setTurboFactor(double turboFactor) {
		this.turboFactor = turboFactor;
	}

}
