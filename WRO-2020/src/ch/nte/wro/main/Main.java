package ch.nte.wro.main;

import javax.jws.Oneway;

import ch.nte.wro.base.Robot;
import ch.nte.wro.variables.GlobalSensors;
import ch.nte.wro.variables.MainVariables;
import ch.nte.wro.variables.SynchedVariables;
import lejos.utility.Delay;

public class Main {
	
	public static final int speed = 200;
	
	 public static void main(String[] args) {
		Robot bot = new Robot("Robot", MainVariables.mLeft, MainVariables.mRight);

		init(bot);

		
		bot.oneStepBelt(200, false);
		Delay.msDelay(1500);
		/*bot.oneStepBelt(200, false);
		Delay.msDelay(1500);
		bot.oneStepBelt(200, false);*/
		bot.sandBagPickUp(100, null);
		Delay.msDelay(5000);
		bot.setArmAngle(0, 50);
		Delay.msDelay(4000);
		
		
		
	}
	 
	private static void init(Robot bot) {
		SynchedVariables.globalSpeed.set(0);
		sensorInit(bot);
	}
	 
	private static void sensorInit(Robot bot) {
		bot.setSensorOnPort(GlobalSensors.colorSensor1, 1);
		bot.getSensorOnPort(1).setMode("Red");
		bot.setSensorOnPort(GlobalSensors.colorSensor2, 2);
		bot.getSensorOnPort(2).setMode("Red");
	}
}
