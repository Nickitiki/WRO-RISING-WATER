package ch.nte.wro.variables;

public class SensorValues {
	
//	NONE, BLACK, BLUE, GREEN, YELLOW, RED, WHITE, BROWN: colorIDs of Ev3ColorSensor (0-7)
	
	public static float intensityBlack = 0.07F;
	public static float intensityWhite = 0.556F;
	public static float intensityBlue = 0.086F;
	public static float intensityGreen = 0.111F;
	public static float intensityYellow = 0.528F;
	public static float intensityRed = 0.481F;
	
	public static float targetIntensityLinefollower = (intensityBlack+intensityWhite)/2;
	
	public static float averageIntensityHalfCross = 0F;
	
	public static float allowedSensorVariation = 0.01F;

}
