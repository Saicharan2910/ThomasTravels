package com.service;

import com.model.Driver;

public class Travel {
	
 public boolean isCarDriver(Driver driver) {
	 
	return driver.getCategory().equalsIgnoreCase("Car");

	    }
	
	public  String retriveByDriverId(Driver[] drivers, int driverId) {
		for(int i = 0; i <drivers.length;i++) {
			if(drivers[i].getDriverId() == driverId) {
				
				return " Driver name is " + drivers[i].getDriverName()
                + " belonging to the category " + drivers[i].getCategory()
                + " and travelled " + drivers[i].getTotalDistance() + "KM so far. ";
				
                }
		 }
		   return " Driver is not found. ";
	}
	
	public  int retriveCountOfDriver(Driver[] drivers, String category) {
		
		int count = 0;
		for(Driver driver : drivers) {
			if(driver.getCategory().equalsIgnoreCase(category)) {
				
				count++;
				
			}
		}
		return count;
	}
	
	public  Driver[] retriveDriver(Driver[] drivers, String category) {
		   
		int count = retriveCountOfDriver(drivers,category);
		Driver[] result = new Driver[count];
		
		int index = 0;
		for (Driver driver : drivers) {
			if (driver.getCategory().equalsIgnoreCase(category)) {
				
				result [index++] = driver;
				
			}
		}
		return result;
	}
	
	public Driver retriveMaximumDistanceTravelledDriver(Driver[] drivers) {
		
		if(drivers.length == 0)
			return null;
		     
		    Driver maxDriver = drivers[0];
		    
		    for(int i =1; i < drivers.length; i++) { 
		    	  if(drivers[i].getTotalDistance() >
		    	  maxDriver.getTotalDistance()) {
		    		  maxDriver = drivers[i];
		    	  }
		    }
		    return maxDriver;
	}
	
}
	
	


