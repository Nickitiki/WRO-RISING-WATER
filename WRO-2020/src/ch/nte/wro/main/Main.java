package ch.nte.wro.main;

import ch.nte.wro.base.Robot;
import ch.nte.wro.variables.GlobalSensors;
import ch.nte.wro.variables.MainVariables;
import ch.nte.wro.variables.SynchedVariables;

public class Main {
	
	 public static void main(String[] args) {
		Robot bot = new Robot("Robot", MainVariables.mLeft, MainVariables.mRight);
		init();
		sensorInit(bot);
	}
	 
	private static void init() {
		SynchedVariables.globalSpeed.set(0);
	}
	 
	private static void sensorInit(Robot bot) {
		bot.setSensorOnPort(GlobalSensors.colorSensor1, 1);
	}
}
