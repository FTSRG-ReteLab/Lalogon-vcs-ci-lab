package hu.bme.mit.train.sensor;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class tacographTest {

	@Test
	public void test() {
		Table<Integer, Integer, Integer> tacographTable 
	      = HashBasedTable.create();
		tacographTable.put(3, 3, 120);
	    
	    boolean entryIsPresent
	      = tacographTable.isEmpty();
	 
	    
	    assertEquals(entryIsPresent, false);
	}

}
