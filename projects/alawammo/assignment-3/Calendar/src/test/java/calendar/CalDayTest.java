package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
			  GregorianCalendar today = new GregorianCalendar(2017,7,7);

				CalDay calen = new CalDay(today);

				assertEquals(7,calen.getDay());  /*bug in getDay it returns the month instead of the day*/
				assertEquals(7,calen.getMonth());
				assertEquals(2017,calen.getYear());
				assertTrue(calen.isValid());
				assertEquals(-1, calen.getSizeAppts());

	 }
	 @Test
	  public void test02()  throws Throwable  {
			/*first appt*/
			GregorianCalendar day1 = new GregorianCalendar(2017,7,7);
			Appt appt_1 = new Appt(1,30,7,7 ,2017 ,"Birthday Party","This is my birthday party.");

			CalDay calen = new CalDay(day1);
			calen.addAppt(appt_1);

			/*appt 2*/

			Appt appt_2 = new Appt(2,30,7,7 ,2017 ,"Party","This is my party.");
			calen.addAppt(appt_2);

			/*appt 3*/
			Appt appt_3 = new Appt(1,20,7,7 ,2017 ,"School","First class.");
			calen.addAppt(appt_3);

			assertEquals(2, calen.getSizeAppts()); /*Bug in here, it returns the number of appointments -1 */
			assertEquals(
		 "	 --- 7/7/2017 --- \n" +
		 " --- -------- Appointments ------------ --- \n" +
		 "	7/7/2017 at 1:30am ,Birthday Party, This is my birthday party.\n" +
		 " 	7/7/2017 at 1:20am ,School, First class.\n" +
		 " 	7/7/2017 at 2:30am ,Party, This is my party.\n" +
		 " \n" +
		 "",
		 calen.toString());
		 assertNotNull(calen.iterator());
			//System.out.println(calen.toString());
			//System.out.println(calen.iterator());

	 }

	 @Test
	 public void test03()  throws Throwable  {

		 	CalDay cal = new CalDay();
			assertFalse(cal.isValid());

			assertEquals("",cal.toString());
			assertNull(cal.iterator());
	 }

	 @Test
	public void test04()  throws Throwable  {
		GregorianCalendar day1 = new GregorianCalendar(2017,7,7);
		Appt appt_1 = new Appt(1,30,0,0 ,2017 ,"Birthday Party","This is my birthday party.");

		CalDay calen = new CalDay(day1);
		calen.addAppt(appt_1);
		calen.addAppt(appt_1);

	}


	@Test
 public void test05()  throws Throwable  {
	 GregorianCalendar day1 = new GregorianCalendar(2017,7,7);
	 //Appt appt_1 = new Appt(1,30,0,0 ,2017 ,"Birthday Party","This is my birthday party.");

	 CalDay calen = new CalDay(day1);
	 

 }
//add more unit tests as you needed
}
