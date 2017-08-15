package calendar;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;




/**
 * Random Test Generator  for TimeTable class.
 */


public class TimeTableRandomTest {

	private static final long TestTimeout = 60 * 500 * 2; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
			long startTime = Calendar.getInstance().getTimeInMillis();
 		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

 		 System.out.println("Start testing...TimeTable");

 	 try{
 		 long randomseed1 =System.currentTimeMillis(); //10
 		 Random random1 = new Random(randomseed1);
 		 GregorianCalendar day1 = new GregorianCalendar(ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1));
		 GregorianCalendar day2 = new GregorianCalendar(ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1));
 		 LinkedList<Appt> appts = new LinkedList<Appt>();

		 TimeTable timetable = new TimeTable();

		 int startHour =0;
		 int startMinute=0;
		 int startDay=0;
		 int startMonth=0;
		 int startYear=0;
		 String title="";
		 String description="";

		 Appt appt= new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);


 		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
 			 long randomseed =System.currentTimeMillis(); //10
  //			System.out.println(" Seed:"+randomseed );

 			 Random random = new Random(randomseed);
			 for(int i=0; i<50; i++){
 				 startHour=ValuesGenerator.RandInt(random);
 			 	 startMinute=ValuesGenerator.RandInt(random);
 				 startDay=ValuesGenerator.RandInt(random);
 				 startMonth=ValuesGenerator.RandInt(random);
 				 startYear=ValuesGenerator.RandInt(random);
 				 title=ValuesGenerator.getString(random);
 				 description=ValuesGenerator.getString(random);
 				//Construct a new Appointment object with the initial data
 			 appt = new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);

				appts.add(appt);
			}





			 try	{
				day1 = new GregorianCalendar(ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1));
				day2 = new GregorianCalendar(ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1));
				 if(ValuesGenerator.getBoolean(0.30f, random))	{
					  timetable.getApptRange(appts, day2, day1);
				 }
				 else	{
				 timetable.getApptRange(appts, day1, day2);
			 	}
			 }catch(DateOutOfRangeException e)	{}
				 /*
				 for(int i=49; i>-1;--i){
					 if(ValuesGenerator.getBoolean(0.30f, random))	{
						 Appt tempAppt = appts.get(i);
						 timetable.deleteAppt(appts,tempAppt);
						 timetable.deleteAppt(appts,tempAppt);
					 }
					 else	{

						if(ValuesGenerator.getBoolean(0.30f, random)){
							 appts = null;
						 }
						 if(ValuesGenerator.getBoolean(0.30f, random)){
							 appt = null;
						 }
						 /*if(ValuesGenerator.getBoolean(0.30f, random)){
 							 appts = null;
							 appt = null;
							 timetable.deleteAppt(appts, appt);
 						 }*/
					 	//timetable.deleteAppt(appts, appts.get(i));
						//}

						//}




 				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
 						 if((iteration%10000)==0 && iteration!=0 )
 									 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

 		 }




		 /*for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			 appts = new LinkedList<Appt>();
 			 long randomseed =System.currentTimeMillis(); //10
  //			System.out.println(" Seed:"+randomseed );
 			 Random random = new Random(randomseed);


				 startHour=ValuesGenerator.RandInt(random);
				 startMinute=ValuesGenerator.RandInt(random);
				 startDay=ValuesGenerator.RandInt(random);
				 startMonth=ValuesGenerator.RandInt(random);
				 startYear=ValuesGenerator.RandInt(random);
				 title=ValuesGenerator.getString(random);
				 description=ValuesGenerator.getString(random);
				//Construct a new Appointment object with the initial data
			 appt = new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);

				appts.add(appt);






				 if(ValuesGenerator.getBoolean(0.60f, random)){
					 appts = null;
				 }
				 if(ValuesGenerator.getBoolean(0.60f, random)){
					 appt = null;
				 }

				 if(ValuesGenerator.getBoolean(0.50f, random)){
					  startHour=ValuesGenerator.RandInt(random);
	  				startMinute=ValuesGenerator.RandInt(random);
	  				startDay=ValuesGenerator.RandInt(random);;
	  				startMonth=ValuesGenerator.RandInt(random);;
	  				startYear=ValuesGenerator.RandInt(random);
	  				title=ValuesGenerator.getString(random);
	  				description=ValuesGenerator.getString(random);
	  				//Construct a new Appointment object with the initial data
	  				appt = new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);
				 }




				 timetable.deleteAppt(appts, appt);




 				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
 						 if((iteration%10000)==0 && iteration!=0 )
 									 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

 		 }*/
 	 }catch(NullPointerException e){

 	 }

 		System.out.println("Done testing...TimeTable");
 	}

	@Test
	 public void radnomtest1()  throws Throwable  {
		 long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		System.out.println("Start testing...TimeTable");


		long randomseed1 =System.currentTimeMillis(); //10
		Random random1 = new Random(randomseed1);
		GregorianCalendar day1 = new GregorianCalendar(ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1));
		GregorianCalendar day2 = new GregorianCalendar(ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1));
		LinkedList<Appt> appts = new LinkedList<Appt>();

		TimeTable timetable = new TimeTable();

		int startHour =0;
		int startMinute=0;
		int startDay=0;
		int startMonth=0;
		int startYear=0;
		String title="";
		String description="";

		Appt appt= new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);


		for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			appts = new LinkedList<Appt>();
			long randomseed =System.currentTimeMillis(); //10
 //			System.out.println(" Seed:"+randomseed );
try{
			Random random = new Random(randomseed);
			for(int i=0; i<50; i++){
				startHour=ValuesGenerator.getRandomIntBetween(random, 0, 27);
				startMinute=ValuesGenerator.getRandomIntBetween(random, 0, 71);
				startDay=ValuesGenerator.getRandomIntBetween(random, 0, 30);
				startMonth=ValuesGenerator.getRandomIntBetween(random, 0, 12);
				startYear=ValuesGenerator.getRandomIntBetween(random, 0, 70);
				title=ValuesGenerator.getString(random);
				description=ValuesGenerator.getString(random);
			 //Construct a new Appointment object with the initial data
			appt = new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);

			 appts.add(appt);
		 }





			//try	{
			 day1 = new GregorianCalendar(ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1));
			 day2 = new GregorianCalendar(ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1),ValuesGenerator.RandInt(random1));
				/*if(ValuesGenerator.getBoolean(0.30f, random))	{
					 timetable.getApptRange(appts, day2, day1);
				}
				else	{
				timetable.getApptRange(appts, day1, day2);
			 }
		 }catch(DateOutOfRangeException e)	{}*/

				for(int i=49; i>-1;--i){
					if(ValuesGenerator.getBoolean(0.30f, random))	{
						Appt tempAppt = appts.get(i);
						timetable.deleteAppt(appts,tempAppt);
						timetable.deleteAppt(appts,tempAppt);
					}
					else	{

					 if(ValuesGenerator.getBoolean(0.30f, random)){
							//appts = null;
						}
						if(ValuesGenerator.getBoolean(0.30f, random)){
							appt = null;
						}
						//if(ValuesGenerator.getBoolean(0.10f, random)){

							timetable.deleteAppt(null, null);
						//}
						timetable.deleteAppt(appts, null);
						timetable.deleteAppt(null, appts.get(i));
					 timetable.deleteAppt(appts, appts.get(i));
					 }

				 }
			 }catch(NullPointerException e){

			 }





			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
						if((iteration%10000)==0 && iteration!=0 )
									System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

		}




		/*for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			appts = new LinkedList<Appt>();
			long randomseed =System.currentTimeMillis(); //10
 //			System.out.println(" Seed:"+randomseed );
			Random random = new Random(randomseed);


				startHour=ValuesGenerator.RandInt(random);
				startMinute=ValuesGenerator.RandInt(random);
				startDay=ValuesGenerator.RandInt(random);
				startMonth=ValuesGenerator.RandInt(random);
				startYear=ValuesGenerator.RandInt(random);
				title=ValuesGenerator.getString(random);
				description=ValuesGenerator.getString(random);
			 //Construct a new Appointment object with the initial data
			appt = new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);

			 appts.add(appt);






				if(ValuesGenerator.getBoolean(0.60f, random)){
					appts = null;
				}
				if(ValuesGenerator.getBoolean(0.60f, random)){
					appt = null;
				}

				if(ValuesGenerator.getBoolean(0.50f, random)){
					 startHour=ValuesGenerator.RandInt(random);
					 startMinute=ValuesGenerator.RandInt(random);
					 startDay=ValuesGenerator.RandInt(random);;
					 startMonth=ValuesGenerator.RandInt(random);;
					 startYear=ValuesGenerator.RandInt(random);
					 title=ValuesGenerator.getString(random);
					 description=ValuesGenerator.getString(random);
					 //Construct a new Appointment object with the initial data
					 appt = new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);
				}




				timetable.deleteAppt(appts, appt);




			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
						if((iteration%10000)==0 && iteration!=0 )
									System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

		}*/

	 System.out.println("Done testing...TimeTable");
 }


	 }
