package com.app.liskovsubstitution;

public class TransportationDevice {
	String name;
	double speed;
	Engine engine;

	String getName() {
		return this.name;
	}

	void setName(String n) {
		this.name = n;
	}


	double getSpeed() {
		return this.speed;
	}

	void setSpeed(double d) {
		this.speed = d;
	}


	Engine getEngine() {
		return this.engine;
	}

	void setEngine(Engine e) {
		this.engine = e;
	}

	void startEngine() {

	}
}
