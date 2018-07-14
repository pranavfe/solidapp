package com.app.dependencyinversion;

public class ElectricPowerSwitchBad {
	public LightBulbBad lightBulb = new LightBulbBad();
	public boolean on;

	public ElectricPowerSwitchBad(LightBulbBad lightBulb) {
		this.lightBulb = lightBulb;
		this.on = false;
	}

	public boolean isOn() {
		return this.on;
	}

	public void press() {
		boolean checkOn = isOn();
		if (checkOn) {
			lightBulb.turnOff();
			this.on = false;
		} else {
			lightBulb.turnOn();
			this.on = true;
		}
	}
}
