package com;

import com.model.Driver;
import com.service.Travel;

public class TestDriver {
	
  public static void main(String[] args) {
	  
   Driver[] driver = new Driver[5];
	    
   driver[0] = new Driver(2183,"Subbarayadu","Auto",3250);
   driver[1] = new Driver(1975,"Ramaiah","Lorry",5780);
   driver[2] = new Driver(2076,"Nagaraju","Van",7890);
   driver[3] = new Driver(2002,"Kiran","Car",9560);
   driver[4] = new Driver(2910,"Narashimha","Bike",1500);
	  
	Travel travel = new Travel();
	  
	 System.out.println(" All Driver Details: ");
	  
	  for(int i = 0; i < driver.length; i++) {
		  System.out.println("Driver Id: "+ 
	                          driver[i].getDriverId()+ ", Name: "+
				              driver[i].getDriverName()+", Category: "+
	                          driver[i].getCategory()+" , Total Distance: "+
				              driver[i].getTotalDistance()+" KM ");
	                       }
	  
	
	  
   System.out.println("Is Car Driver: " + travel.isCarDriver(driver[3]));
	  
   System.out.println(travel.retriveByDriverId(driver, 2002));
	  
   System.out.println("Number Of Car Drivers: "+travel.retriveCountOfDriver(driver, "Car"));
	  
   Driver [] carDrivers =travel.retriveDriver(driver, "Car");
	  
   System.out.println("Car drivers: ");
	  
	for(int i = 0; i < carDrivers.length; i++) {
		  
		  System.out.println(carDrivers[i].getDriverName());
		  
	     }
	  
   Driver maxDriver = travel.retriveMaximumDistanceTravelledDriver(driver);
	  
	  if (maxDriver != null) {
	    	  
	    System.out.println("Driver With Maximum Distance : " + maxDriver.getDriverName());
	    	  
	          }
	  
           }
  
 }
	  
	  

			  
  
	  
  
	
			
		      

		                                                      
	


