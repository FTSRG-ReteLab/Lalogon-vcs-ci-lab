package hu.bme.mit.train.interfaces;

public interface TrainUser {

	void setController(TrainController controller);
	
	int getJoystickPosition();

	boolean getAlarmFlag();

	void overrideJoystickPosition(int joystickPosition);

	boolean getAlarmState();
	
	void setAlarmState(boolean alarmState);
}
