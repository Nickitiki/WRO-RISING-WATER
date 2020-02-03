package ch.nte.wro.main;

import ch.nte.wro.base.Robot;
import ch.nte.wro.variables.SensorValues;
import lejos.hardware.Sound;
import lejos.utility.Delay;

public class Navigation {
	
	public static void startPointToHouse(String side, Robot bot, int speed) {
		bot.accelerate(100, speed, 100);
		bot.forwardUntil(speed, bot.getSensorOnPort(1), bot.getSensorOnPort(2),
				SensorValues.intensityWhite, SensorValues.allowedSensorVariation*4);
		Sound.beep();
		bot.forwardUntil(speed, bot.getSensorOnPort(1), bot.getSensorOnPort(2),
				SensorValues.intensityGreen, SensorValues.allowedSensorVariation*8);
		Sound.beep();
		bot.forwardUntil(speed, bot.getSensorOnPort(1), bot.getSensorOnPort(2),
				SensorValues.intensityWhite, SensorValues.allowedSensorVariation*6);
		Sound.beep();
		bot.setSpeeds(0);
		if(side.equalsIgnoreCase("right")) {
			bot.rotate(speed, 1F, "left");
			Sound.beep();
		} else if (side.equalsIgnoreCase("left")) {
			bot.rotate(speed, 1F, "right");
			Sound.beep();
		}
		bot.motorsOff();
		Delay.msDelay(200);
		bot.followLine(speed/2, "double.cross", 0, 80, bot.getSensorOnPort(1), bot.getSensorOnPort(2));
		bot.followLine(speed/2, "double.time", 1000, 80, bot.getSensorOnPort(1), bot.getSensorOnPort(2));
		bot.followLine(speed/3, "double.cross", 0, 80, bot.getSensorOnPort(1), bot.getSensorOnPort(2));
	}
	
	public static void driveToOtherStartPlace(String side, Robot bot, int speed) {
		bot.rotate(speed, 0.5F);
		if(side.equalsIgnoreCase("left")) {
			bot.turnWithRotations(speed, 1F, "right");
		} else if (side.equalsIgnoreCase("right")) {
			bot.rotate(speed, 1f, "left");
		}
		bot.accelerate(speed, speed*2, 2000);
		bot.forwardUntil(speed, bot.getSensorOnPort(1), bot.getSensorOnPort(2),
				SensorValues.intensityBlack, SensorValues.allowedSensorVariation*3);
		Sound.beep();
		bot.forwardUntil(speed*2, bot.getSensorOnPort(1), bot.getSensorOnPort(2),
				SensorValues.intensityBlack, SensorValues.allowedSensorVariation*3);
		bot.rotate(speed, 0.5F);
		
	}
}
