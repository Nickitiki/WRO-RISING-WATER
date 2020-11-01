package ch.nte.wro.demo;

import ch.nte.wro.base.Robot;
import ch.nte.wro.main.Initsialization;
import ch.nte.wro.main.MovmentBlocks;
import ch.nte.wro.variables.MainVariables;
import ch.nte.wro.variables.Position;
import ch.nte.wro.variables.SensorValues;
import ch.nte.wro.variables.SynchedVariables;

public class DemoEvacutationRequest {

public static final int speed = 200;
	
	public static void main(String[] args) {
		Robot bot = new Robot("Robot", MainVariables.mLeft, MainVariables.mRight);

		init(bot);
		
		Position.botPosition = "blue";
		
		MovmentBlocks.driveToHouse(bot, speed, "lol");
		bot.followLineRGB(speed, "double.time", 3000, SensorValues.sensitivity.get(Position.botPosition),
				bot.getSensorOnPort(1), bot.getSensorOnPort(2));
	}
	
	
	
	
	private static void init(Robot bot) {
		SynchedVariables.globalSpeed.set(0);
		Initsialization.sensorInit(bot);
		Initsialization.sensitivityInit();
		Initsialization.housesInit();
	}

}
