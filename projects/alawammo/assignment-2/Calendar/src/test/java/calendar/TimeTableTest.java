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
		 	timetable.getApptRange(appts, day1, day2);
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
		 	timetable.getApptRange(appts, day1, day2);
		}
		catch(DateOutOfRangeException e)	{

		}
LinkedList<Appt> listDeletedAppts=timetable.deleteAppt(appts, appts.get(1));
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
		 timetable.getApptRange(appts, day1, day2);
	 }
	 catch(NullPointerException e)	{

	 }
LinkedList<Appt> listDeletedAppts=timetable.deleteAppt(appts, appts.get(0));
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
		timetable.getApptRange(appts, day1, day2);
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
	 timetable.getApptRange(appts, day1, day2);
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
	timetable.getApptRange(appts, day1, day2);
}
catch(NullPointerException e)	{

}

}
//add more unit tests as you needed
}
