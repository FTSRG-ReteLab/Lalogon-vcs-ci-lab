package hu.bme.mit.train.sensor;

import java.util.List;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Table;

public class tacograph {
	
	
	List<Integer> rowTable 
	  = Lists.newArrayList( 3, 3);
	List<Integer> columnTables 
	  = Lists.newArrayList(3,3,3);
	Table<Integer, Integer, Integer> tacographTable
	  = ArrayTable.create(rowTable, columnTables);
}

//current time
//joystick position
//reference speed