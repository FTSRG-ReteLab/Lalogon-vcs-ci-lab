package hu.bme.mit.train.system;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

import hu.bme.mit.train.controller.TrainControllerImpl;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.sensor.TrainSensorImpl;
import hu.bme.mit.train.user.TrainUserImpl;

public class TrainSensorTest {
	
	TrainController mockController;
	TrainUser mockUser;
	
	TrainSensorImpl  mImpl;
	
	@Before
	public void InitParams(){
		mockController = mock(TrainControllerImpl.class);
		mockUser = mock(TrainUserImpl.class);
		mockUser.setController(mockController);
		
		mImpl = new TrainSensorImpl(mockController, mockUser);
	}
	
	@Test
	public void testSmallLimitSet(){
		mImpl.overrideSpeedLimit(-3);
		Assert.assertEquals(false, mockUser.getAlarmState());
	}
	
	@Test
	public void testBigLimitSet(){
		mImpl.overrideSpeedLimit(600);
		Assert.assertEquals(false, mockUser.getAlarmState());
	}
	
	@Test
	public void testTooBigDiffrenceSet(){
		mImpl.overrideSpeedLimit(23);
		Assert.assertEquals(false, mockUser.getAlarmState());
	}
	
	@Test
	public void testOptimalSet(){
		mImpl.overrideSpeedLimit(55);
		Assert.assertEquals(false, mockUser.getAlarmState());
	}	
	

}
