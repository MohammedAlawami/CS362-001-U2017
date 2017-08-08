package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
			GregorianCalendar day1 = new GregorianCalendar(2017,7,13);
			GregorianCalendar day2 = new GregorianCalendar(2017,7,14);

			LinkedList<Appt> appts = new LinkedList<Appt>();


		 Appt appt_1 = new Appt(1,30,7,7 ,2017 ,"Birthday Party","This is my birthday party.");
		 appts.add(appt_1);

		 TimeTable timetable = new TimeTable();
		 try{
		 	assertNotNull(timetable.getApptRange(appts, day1, day2));
			assertEquals(1,timetable.getApptRange(appts, day1, day2).size());
		}
		catch(NullPointerException e)	{

		}

	 }
	 @Test
	  public void test02()  throws Throwable  {
			GregorianCalendar day1 = new GregorianCalendar(2017,7,14);
			GregorianCalendar day2 = new GregorianCalendar(2017,7,13);

			LinkedList<Appt> appts = new LinkedList<Appt>();


		 //Appt appt_1 = new Appt(1,30,0,0 ,2017 ,"Birthday Party","This is my birthday party.");
		 Appt appt_1 = new Appt(0,0,0,0 ,0 ,"","");
		 appts.add(appt_1);
		 Appt appt_2 = new Appt(1,30,2,2 ,2017 ,"Birthday Party","This is my birthday party.");
		 appts.add(appt_2);



		 TimeTable timetable = new TimeTable();
		 try{
		 	assertNotNull(timetable.getApptRange(appts, day1, day2));
			assertEquals(1,timetable.getApptRange(appts, day1, day2).size());
		}
		catch(DateOutOfRangeException e)	{

		}
LinkedList<Appt> listDeletedAppts=timetable.deleteAppt(appts, appts.get(1));
//assertNull(deleteAppt(appts, appts.get(1)));
	 }

	 @Test
	  public void test03()  throws Throwable  {
			LinkedList<Appt> appts = new LinkedList<Appt>();
		  Appt appt_1 = new Appt(1,30,7,7 ,2017 ,"Birthday Party","This is my birthday party.");
			appts.add(appt_1);
			Appt appt_2 = new Appt(1,30,7,8 ,2017 ,"Birthday Party","This is my birthday party.");
			appts.add(appt_2);
			Appt appt_3 = new Appt(1,30,7,9 ,2017 ,"Birthday Party","This is my birthday party.");
			appts.add(appt_3);
			Appt appt_4 = new Appt(1,30,7,10 ,2017 ,"Birthday Party","This is my birthday party.");
			appts.add(appt_4);


			TimeTable timetable = new TimeTable();
			LinkedList<CalDay> calDays = new LinkedList<CalDay>();

			int[] pv={1,2,3,0};
			LinkedList<Appt> listUpdatedAppts=timetable.permute(appts, pv);
			assertNotNull(timetable.permute(appts, pv));

			LinkedList<Appt> listDeletedAppts=timetable.deleteAppt(appts, appts.get(2));

	 }

	 @Test
	 public void test04()  throws Throwable  {


	 }



	 @Test
	 public void test05()  throws Throwable  {
		 GregorianCalendar day1 = new GregorianCalendar(2017,7,13);
		 GregorianCalendar day2 = new GregorianCalendar(2018,7,15);

		 LinkedList<Appt> appts = new LinkedList<Appt>();
		 int [] arr = {1,2,3};
		 int [] arr2 = new int[0];

		Appt appt_1 = new Appt(1,30,13,7 ,2017 ,"Birthday Party","This is my birthday party.");
		appt_1.setRecurrence(arr, 0, 0, 10);
		appts.add(appt_1);

		Appt appt_2 = new Appt(1,30,14,7 ,2017 ,"Birthday Party","This is my birthday party.");
		appt_2.setRecurrence(arr, 1, 1, 2);
		appts.add(appt_2);
		Appt appt_3 = new Appt(1,30,15,7 ,2017 ,"Birthday Party","This is my birthday party.");
		appt_3.setRecurrence(arr, 2, 2, 15);
		appts.add(appt_3);




		//int [] arr2 = {};



		TimeTable timetable = new TimeTable();
		try{
		 assertNotNull(timetable.getApptRange(appts, day1, day2));
		 LinkedList<Appt> listDeletedAppts=timetable.deleteAppt(appts, appts.get(0));
		 assertEquals(1,timetable.getApptRange(appts, day1, day2).size());
 		 assertEquals(2, appts.size());


	 }
	 catch(NullPointerException e)	{

	 }

	}
	@Test
	public void test06()  throws Throwable  {
		GregorianCalendar day1 = new GregorianCalendar(2017,7,13);
		GregorianCalendar day2 = new GregorianCalendar(2019,7,15);

		LinkedList<Appt> appts = new LinkedList<Appt>();

		int [] arr = {1,2,3};


	  //int [] arr2 = {};
	  int [] arr2 = null;


	 Appt appt_1 = new Appt(1,30,13,7 ,2017 ,"Birthday Party","This is my birthday party.");
	 appt_1.setRecurrence(arr, 0, 0, 5);
	 appts.add(appt_1);
	 Appt appt_2 = new Appt(1,30,14,7 ,2017 ,"Birthday Party","This is my birthday party.");
	 appt_2.setRecurrence(arr, 1, 1, 5);
	 appts.add(appt_2);
	 Appt appt_3 = new Appt(1,30,15,7 ,2019 ,"Birthday Party","This is my birthday party.");
	 appt_3.setRecurrence(arr2, 3, 3, 5);
	 appts.add(appt_3);



	 TimeTable timetable = new TimeTable();
	 try{
		assertNotNull(timetable.getApptRange(appts, day1, day2));
		assertEquals(1,timetable.getApptRange(appts, day1, day2).size());
	}
	catch(NullPointerException e)	{

	}

 }

 @Test
 public void test07()  throws Throwable  {
	 GregorianCalendar day1 = new GregorianCalendar(2017,7,13);
	 GregorianCalendar day2 = new GregorianCalendar(2019,7,15);

	 LinkedList<Appt> appts = new LinkedList<Appt>();

	 int [] arr = null;

	Appt appt_1 = new Appt(1,30,13,7 ,2017 ,"Birthday Party","This is my birthday party.");
	appt_1.setRecurrence(arr, 1, 1, 5);
	appts.add(appt_1);

	TimeTable timetable = new TimeTable();
	try{
	 assertNotNull(timetable.getApptRange(appts, day1, day2));

 }
 catch(NullPointerException e)	{

 }

}
@Test
public void test08()  throws Throwable  {
	GregorianCalendar day1 = new GregorianCalendar(2017,7,13);
	GregorianCalendar day2 = new GregorianCalendar(2019,7,15);

	LinkedList<Appt> appts = new LinkedList<Appt>();

	int [] arr = null;

 Appt appt_1 = new Appt(1,30,13,7 ,2017 ,"Birthday Party","This is my birthday party.");
 appt_1.setRecurrence(arr, 3, 3, 5);
 appts.add(appt_1);

 TimeTable timetable = new TimeTable();
 try{
	assertNotNull(timetable.getApptRange(appts, day1, day2));
	assertEquals(732,timetable.getApptRange(appts, day1, day2).size());

}
catch(NullPointerException e)	{

}

}
@Test
 public void test09()  throws Throwable  {
	 GregorianCalendar day1 = new GregorianCalendar(2017,7,14);
	 GregorianCalendar day2 = new GregorianCalendar(2017,7,13);

	 LinkedList<Appt> appts = new LinkedList<Appt>();


	Appt appt_0 = new Appt(1,30,2,2 ,2017 ,"Birthday Party","This is my birthday party.");
 	appts.add(appt_0);
	Appt appt_1 = null;
	appts.add(appt_1);
	Appt appt_2 = new Appt(1,30,2,2 ,2017 ,"Birthday Party","This is my birthday party.");
	appts.add(appt_2);



	TimeTable timetable = new TimeTable();

	//LinkedList<Appt> listDeletedAppts=timetable.deleteAppt(null, null);
	assertNull(timetable.deleteAppt(null, null));
	//assertEquals(2,appts.size());
	assertNull(timetable.deleteAppt(null, appt_0));
	assertNull(timetable.deleteAppt(appts, appt_1));
	//timetable.deleteAppt(appts, appts.get(2));
	//assertNull(timetable.deleteAppt(appts, null));

	try{
	 assertNotNull(timetable.getApptRange(appts, day1, day2));
	 assertEquals(1,timetable.getApptRange(appts, day1, day2).size());

 }
 catch(DateOutOfRangeException e)	{

 }

//assertNull(deleteAppt(appts, appts.get(1)));
}
@Test
 public void test10()  throws Throwable  {
	 GregorianCalendar day1 = new GregorianCalendar(2017,7,14);
	 GregorianCalendar day2 = new GregorianCalendar(2017,7,13);

	 LinkedList<Appt> appts = new LinkedList<Appt>();


	Appt appt_0 = new Appt(1,300,2,2 ,2017 ,"Birthday Party","This is my birthday party.");
 	appts.add(appt_0);
	Appt appt_1 = null;
	appts.add(appt_1);
	Appt appt_2 = new Appt(1,30,2,2 ,2017 ,"Birthday Party","This is my birthday party.");
	appts.add(appt_2);



	TimeTable timetable = new TimeTable();

	//LinkedList<Appt> listDeletedAppts=timetable.deleteAppt(null, null);

	//assertEquals(2,appts.size());
	assertNull(timetable.deleteAppt(appts, appt_0));
	assertNull(timetable.deleteAppt(appts, appt_1));
	//timetable.deleteAppt(appts, appts.get(2));
	//assertNull(timetable.deleteAppt(appts, null));

	try{
	 assertNotNull(timetable.getApptRange(appts, day1, day2));
	 assertEquals(1,timetable.getApptRange(appts, day1, day2).size());
 }
 catch(DateOutOfRangeException e)	{

 }

//assertNull(deleteAppt(appts, appts.get(1)));
}
@Test
 public void test11()  throws Throwable  {
	 GregorianCalendar day1 = new GregorianCalendar(2017,7,14);
	 GregorianCalendar day2 = new GregorianCalendar(2017,7,13);

	 LinkedList<Appt> appts = new LinkedList<Appt>();


	Appt appt_0 = new Appt(1,30,2,2 ,2017 ,"Birthday Party","This is my birthday party.");
 	appts.add(appt_0);




	TimeTable timetable = new TimeTable();

	//LinkedList<Appt> listDeletedAppts=timetable.deleteAppt(null, null);

	//assertEquals(2,appts.size());
	assertNull(timetable.deleteAppt(appts, appt_0));

	//timetable.deleteAppt(appts, appts.get(2));
	//assertNull(timetable.deleteAppt(appts, null));

	try{
	 assertNotNull(timetable.getApptRange(appts, day1, day2));
	 assertEquals(1,timetable.getApptRange(appts, day1, day2).size());
 }
 catch(DateOutOfRangeException e)	{

 }

//assertNull(deleteAppt(appts, appts.get(1)));
}
@Test
 public void test12()  throws Throwable  {
	 GregorianCalendar day1 = new GregorianCalendar(2017,7,14);
	 GregorianCalendar day2 = new GregorianCalendar(2017,7,13);

	 LinkedList<Appt> appts = new LinkedList<Appt>();


	Appt appt_0 = new Appt(1,30,2,2 ,2017 ,"Birthday Party","This is my birthday party.");
 	appts.add(appt_0);
	Appt appt_2 = new Appt(1,30,2,2 ,2017 ,"Birthday Party","This is my birthday party.");
	appts.add(appt_2);



	TimeTable timetable = new TimeTable();

	//LinkedList<Appt> listDeletedAppts=timetable.deleteAppt(null, null);

	//assertEquals(2,appts.size());
	assertNull(timetable.deleteAppt(appts, appt_2));

	//timetable.deleteAppt(appts, appts.get(2));
	//assertNull(timetable.deleteAppt(appts, null));

	try{
	 assertNotNull(timetable.getApptRange(appts, day1, day2));
	 assertEquals(1,timetable.getApptRange(appts, day1, day2).size());
 }
 catch(DateOutOfRangeException e)	{

 }

//assertNull(deleteAppt(appts, appts.get(1)));
}
@Test
 public void test13()  throws Throwable  {
	 GregorianCalendar day1 = new GregorianCalendar(2017,7,14);
	 GregorianCalendar day2 = new GregorianCalendar(2017,7,13);

	 LinkedList<Appt> appts = new LinkedList<Appt>();


	Appt appt_0 = new Appt(1,30,2,2 ,2017 ,"Birthday Party","This is my birthday party.");
 	appts.add(appt_0);
	Appt appt_2 = new Appt(1,30,2,2 ,2017 ,"Birthday Party","This is my birthday party.");
	appts.add(appt_2);

	assertEquals(2, appts.size());


	TimeTable timetable = new TimeTable();

	//LinkedList<Appt> listDeletedAppts=timetable.deleteAppt(null, null);

	//assertEquals(2,appts.size());
	assertNull(timetable.deleteAppt(appts, appt_2));
	assertEquals(2, appts.size());
	//timetable.deleteAppt(appts, appts.get(2));
	//assertNull(timetable.deleteAppt(appts, null));

	try{
	 //timetable.getApptRange(appts, day1, day2);
	 assertNotNull(timetable.getApptRange(appts, day1, day2));
	 assertEquals(1,timetable.getApptRange(appts, day1, day2).size());
 }
 catch(DateOutOfRangeException e)	{

 }

//assertNull(deleteAppt(appts, appts.get(1)));
}
@Test
 public void test14()  throws Throwable  {
	 LinkedList<Appt> appts = new LinkedList<Appt>();



	 TimeTable timetable = new TimeTable();
	 LinkedList<CalDay> calDays = new LinkedList<CalDay>();

	 int[] pv={1,2,3,0};
	 LinkedList<Appt> listUpdatedAppts=timetable.permute(appts, pv);
	 assertNotNull(timetable.permute(appts, pv));



}
@Test
public void test15()  throws Throwable  {
	GregorianCalendar day1 = new GregorianCalendar(2017,7,13);
	GregorianCalendar day2 = new GregorianCalendar(2019,7,15);

	LinkedList<Appt> appts = new LinkedList<Appt>();

	int [] arr = {1,2,3};


	//int [] arr2 = {};
	int [] arr2 = null;


 Appt appt_1 = new Appt(1,30,13,7 ,2017 ,"Birthday Party","This is my birthday party.");
 appt_1.setRecurrence(arr, 0, 0, 0);
 appts.add(appt_1);
 assertFalse(appt_1.isRecurring());
 Appt appt_2 = new Appt(1,30,14,7 ,2017 ,"Birthday Party","This is my birthday party.");
 appt_2.setRecurrence(arr, 1, 1, 5);
 appts.add(appt_2);
 Appt appt_3 = new Appt(1,30,15,7 ,2019 ,"Birthday Party","This is my birthday party.");
 appt_3.setRecurrence(arr2, 3, 3, 5);
 appts.add(appt_3);



 TimeTable timetable = new TimeTable();
 try{
	timetable.getApptRange(appts, day1, day2);
	appt_1.setRecurrence(arr, 0, 0, 5);
	assertTrue(appt_1.isRecurring());
  appts.add(appt_1);
	assertNotNull(timetable.getApptRange(appts, day1, day2));
 	assertEquals(1,timetable.getApptRange(appts, day1, day2).size());
}
catch(NullPointerException e)	{

}

}
@Test
	 public void test16()  throws Throwable  {
		 TimeTable t=new TimeTable();

	    	Calendar rightnow = Calendar.getInstance();
	    	//current month/year/date is today
	    	int thisMonth = rightnow.get(Calendar.MONTH)+1;
			int thisYear = rightnow.get(Calendar.YEAR);
			int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

			 int startHour=15;
			 int startMinute=30;
			 int startDay=thisDay;  	//11
			 int startMonth=thisMonth; 	//4
			 int startYear=thisYear; 	//2017
        String title="Birthday Party";
        String description="This is my birthday party.";
        // Create a valid appointment!
        Appt appt = new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);
        /** Collection of all of the appointments for the calendar day */
        LinkedList<Appt> appts = new LinkedList<Appt>();
        appts.add(appt);

        //Change the  default recurring information in the object appt using setRecurrence method in the Appt class
        int[] recurringDays =  new int[0];
       appt.setRecurrence(recurringDays, Appt.RECUR_BY_MONTHLY, 0, 1);
		//get a list of appointments for one day that are occurred between today and tomorrow!
        GregorianCalendar firstDay = new GregorianCalendar(thisYear,thisMonth,thisDay);
        //Create an identical object for the firstDay
		GregorianCalendar lastDay = (GregorianCalendar)firstDay.clone();
		//Increase today day to 1
		lastDay.add(Calendar.DAY_OF_MONTH,1);
       //try {
    	  // Retrieves a range of appointments between two dates (i.e., today and tomorrow).
           assertNotNull(t.getApptRange(appts, firstDay, lastDay));
					 assertEquals(1,t.getApptRange(appts, firstDay, lastDay).size());

       //}
      // catch( NullPointerException e)
      //  {

      //  }

	 }
	 public void test17()  throws Throwable  {
		 GregorianCalendar day1 = new GregorianCalendar(2017,7,7);
		 GregorianCalendar day2 = new GregorianCalendar(2017,8,8);

		 LinkedList<Appt> appts = new LinkedList<Appt>();
		 int [] arr = {1,2,3,4,5,6,7,8,9,10};
		 int [] arr2 = new int[0];
		 int [] arr3 = {1,2,3,4};

		Appt appt_1 = new Appt(1,10,13,7 ,2017 ,"Birthday Party","This is my birthday party.");
		appt_1.setRecurrence(arr2, 1, 1, 1000);
		appts.add(appt_1);

		Appt appt_2 = new Appt(4,20,14,9 ,2017 ,"Birthday Party","This is my birthday party.");
		appt_2.setRecurrence(arr, 1, 1, 20);
		appts.add(appt_2);
		Appt appt_3 = new Appt(6,50,15,8 ,2017 ,"Birthday Party","This is my birthday party.");
		appt_3.setRecurrence(arr3, 2, 2, 150);
		appts.add(appt_3);




		//int [] arr2 = {};



		TimeTable timetable = new TimeTable();
		//try{
		LinkedList<CalDay> getappt = timetable.getApptRange(appts, day1, day2);
		 assertNotNull(getappt.get(0).getAppts());
		 //LinkedList<Appt> listDeletedAppts=timetable.deleteAppt(appts, appts.get(0));
		 assertEquals(1,getappt.get(1).getAppts().size());
 		 //assertEquals(2, appts.size());


	// }
	 //catch(NullPointerException e)	{

	 //}

	}

	public void test18()  throws Throwable  {
		GregorianCalendar day1 = new GregorianCalendar(2017,7,7);
		GregorianCalendar day2 = new GregorianCalendar(2018,8,8);

		LinkedList<Appt> appts = new LinkedList<Appt>();
		int [] arr = {1,2,3};
		int [] arr2 = new int[0];
		int [] arr3 = {1,2,3,4};

	 Appt appt_1 = new Appt(1,10,8,7 ,2017 ,"Birthday Party","This is my birthday party.");
	 appt_1.setRecurrence(arr, 3, 9, 1000);
	 appts.add(appt_1);
/*
	 Appt appt_2 = new Appt(4,20,8,9 ,2017 ,"Birthday Party","This is my birthday party.");
	 appt_2.setRecurrence(arr, 0, 0, 20);
	 appts.add(appt_2);
	 Appt appt_3 = new Appt(6,50,8,8 ,2017 ,"Birthday Party","This is my birthday party.");
	 appt_3.setRecurrence(arr, 2, 2, 150);
	 appts.add(appt_3);

*/


	 //int [] arr2 = {};



	 TimeTable timetable = new TimeTable();
	 //try{
	 LinkedList<CalDay> getappt = timetable.getApptRange(appts, day1, day2);
		assertNotNull(getappt);
		//LinkedList<Appt> listDeletedAppts=timetable.deleteAppt(appts, appts.get(0));
		assertEquals(1,getappt.size());
		//assertEquals(2, appts.size());


 // }
	//catch(NullPointerException e)	{

	//}

 }

 @Test
 public void test19()  throws Throwable  {
 	GregorianCalendar day1 = new GregorianCalendar(2017,7,13);
 	GregorianCalendar day2 = new GregorianCalendar(2019,7,15);

 	LinkedList<Appt> appts = new LinkedList<Appt>();

 	int [] arr = null;

  Appt appt_1 = new Appt(1,30,13,7 ,2017 ,"Birthday Party","This is my birthday party.");
  appt_1.setRecurrence(arr, 1, 1, 5);
  appts.add(appt_1);

  TimeTable timetable = new TimeTable();
  try{
 	assertNotNull(timetable.getApptRange(appts, day1, day2));
 	assertEquals(732,timetable.getApptRange(appts, day1, day2).size());

 }
 catch(NullPointerException e)	{

 }

 }
//add more unit tests as you needed
}
