package calendar;


import org.junit.Test;
import java.util.Random;

import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.GregorianCalendar;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
			long startTime = Calendar.getInstance().getTimeInMillis();
 		  long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

			System.out.println("Start testing...CalDay");

 		try{
			long randomseed1 =System.currentTimeMillis(); //10
			Random random1 = new Random(randomseed1);
			GregorianCalendar day = new GregorianCalendar(ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1));
			CalDay calen = new CalDay(day);
 			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
 				long randomseed =System.currentTimeMillis(); //10
 	//			System.out.println(" Seed:"+randomseed );
 				Random random = new Random(randomseed);

 				 int startHour=ValuesGenerator.RandInt(random);
 				 int startMinute=ValuesGenerator.RandInt(random);
 				 int startDay=ValuesGenerator.RandInt(random);;
 				 int startMonth=ValuesGenerator.RandInt(random);;
 				 int startYear=ValuesGenerator.RandInt(random);
 				 String title="Birthday Party";
 				 String description="This is my birthday party.";
 				 //Construct a new Appointment object with the initial data
 				 Appt appt = new Appt(startHour,
 				          startMinute ,
 				          startDay ,
 				          startMonth ,
 				          startYear ,
 				          title,
 				         description);


				calen.addAppt(appt);




 				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
 			        if((iteration%10000)==0 && iteration!=0 )
 			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

 			}
 		}catch(NullPointerException e){

 		}

 		 System.out.println("Done testing...CalDay");
 	 }





	 }
