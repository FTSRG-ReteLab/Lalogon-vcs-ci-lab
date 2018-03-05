package hu.bme.mit.train.controller;

import java.util.Random;

import hu.bme.mit.train.interfaces.TrainController;

public class TrainControllerImpl implements TrainController {

	private int step = 0;
	private int referenceSpeed = 0;
	private int speedLimit = 200;

	@Override
	public void followSpeed() {
		if (referenceSpeed < 0) {
			referenceSpeed = 0;
		} else {
		    if(referenceSpeed+step > 0) {
                referenceSpeed += step;
            } else {
		        referenceSpeed = 0;
            }
		}

		enforceSpeedLimit();
	}

	@Override
	public int getReferenceSpeed() {
		return referenceSpeed;
	}
	

	@Override
	public void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
		enforceSpeedLimit();
		
	}

	private void enforceSpeedLimit() {
		if (referenceSpeed > speedLimit) {
			referenceSpeed = speedLimit;
		}
	}

	@Override
	public void setJoystickPosition(int joystickPosition) {
		this.step = joystickPosition;		
	}

	@Override
	public void setReferenceSpeed(int joystickPosition) {
		if (joystickPosition==1 && referenceSpeed!=0){
			referenceSpeed-=1; 
		}else if(joystickPosition==3 && referenceSpeed!=speedLimit) {
				referenceSpeed+=1; 	
		}
			
			
	}

	@Override
	public int getJoystickPosition() {
		Random r = new Random();
		int Low = 1;
		int High = 3;
		int Result = r.nextInt(High-Low) + Low;
		return Result;
	}
	
	

}
