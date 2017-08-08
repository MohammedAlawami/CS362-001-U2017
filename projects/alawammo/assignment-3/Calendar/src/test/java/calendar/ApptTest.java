package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());

	 }

	 @Test
	  public void test02()  throws Throwable  {
			int startHour=1;
 		 int startMinute=1;
 		 int startDay=1;
 		 int startMonth=1;
 		 int startYear=1;
 		 String title="day";
 		 String description="day";
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 appt.setStartHour(13);
		 assertEquals(13,appt.getStartHour());
		 appt.setStartMinute(30);
		 assertEquals(30,appt.getStartMinute());
		 appt.setStartDay(10);
		 assertEquals(10,appt.getStartDay());
		 appt.setStartMonth(04);
		 assertEquals(04,appt.getStartMonth());
		 appt.setStartYear(2017);
		 assertEquals(2017, appt.getStartYear());
		 appt.setTitle("Birthday Party");
		 assertEquals("Birthday Party",appt.getTitle());
		 appt.setDescription("This is my birthday party.");
		 assertEquals("This is my birthday party.", appt.getDescription());

		 assertEquals("\t"+04 + "/" + 10 + "/" + 2017 + " at " + 1 + ":" + 30 + "pm"  +   " ," + "Birthday Party" + ", " + "This is my birthday party."+"\n", appt.toString());
	 }

	 @Test
	  public void test03()  throws Throwable  {
			int startHour=1;
		 int startMinute=1;
		 int startDay=1;
		 int startMonth=1;
		 int startYear=1;
		 String title="day";
		 String description="day";
		 Appt appt = new Appt(startHour,
							startMinute ,
							startDay ,
							startMonth ,
							startYear ,
							title,
						 description);

						 int [] arr = null;

						 appt.setRecurrence(arr, 0, 0, 5);
						 //assertEquals(arr,appt.getRecurDays());
						 assertEquals(0, appt.getRecurBy());
						 assertEquals(0, appt.getRecurIncrement());
						 assertEquals(5, appt.getRecurNumber());
						 assertTrue(appt.isRecurring());


	 }

	 @Test
	  public void test04()  throws Throwable  {
			int startHour=1;
		 int startMinute=1;
		 int startDay=1;
		 int startMonth=1;
		 int startYear=1;
		 String title="day";
		 String description="day";
		 Appt appt = new Appt(startHour,
							startMinute ,
							startDay ,
							startMonth ,
							startYear ,
							title,
						 description);

						 int [] arr = {1,2,3};

						 appt.setRecurrence(arr, 2, 0, 0);
						 assertEquals(arr,appt.getRecurDays());
						 assertEquals(2, appt.getRecurBy());
						 assertEquals(0, appt.getRecurIncrement());
						 assertEquals(0, appt.getRecurNumber());


		}
		@Test
 	  public void test05()  throws Throwable  {
 		 int startHour=-1;
 		 int startMinute=30;
 		 int startDay=10;
 		 int startMonth=4;
 		 int startYear=2017;
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
 	// assertions
 		 assertFalse(appt.getValid());
 		 assertEquals(-1, appt.getStartHour());
 		 assertEquals(30, appt.getStartMinute());
 		 assertEquals(10, appt.getStartDay());
 		 assertEquals(04, appt.getStartMonth());
 		 assertEquals(2017, appt.getStartYear());
 		 assertEquals("Birthday Party", appt.getTitle());
 		 assertEquals("This is my birthday party.", appt.getDescription());
 	 }
	 @Test
	 public void test06()  throws Throwable  {
		int startHour=25;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
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
 // assertions
		assertFalse(appt.getValid());
		assertEquals(25, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}
	@Test
	public void test07()  throws Throwable  {
	 int startHour=12;
	 int startMinute=-1;
	 int startDay=10;
	 int startMonth=4;
	 int startYear=2017;
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
// assertions
	 assertFalse(appt.getValid());
	 assertEquals(12, appt.getStartHour());
	 assertEquals(-1, appt.getStartMinute());
	 assertEquals(10, appt.getStartDay());
	 assertEquals(04, appt.getStartMonth());
	 assertEquals(2017, appt.getStartYear());
	 assertEquals("Birthday Party", appt.getTitle());
	 assertEquals("This is my birthday party.", appt.getDescription());
 }
 @Test
 public void test08()  throws Throwable  {
	int startHour=1;
	int startMinute=70;
	int startDay=10;
	int startMonth=4;
	int startYear=2017;
	String title=null;
	String description=null;
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
// assertions
	assertFalse(appt.getValid());
	assertEquals(1, appt.getStartHour());
	assertEquals(70, appt.getStartMinute());
	assertEquals(10, appt.getStartDay());
	assertEquals(04, appt.getStartMonth());
	assertEquals(2017, appt.getStartYear());
	assertEquals("", appt.getTitle());
	assertEquals("", appt.getDescription());
}
@Test
public void test09()  throws Throwable  {
 int startHour=1;
 int startMinute=30;
 int startDay=0;
 int startMonth=4;
 int startYear=2017;
 String title=null;
 String description=null;
 //Construct a new Appointment object with the initial data
 Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
				 description);
// assertions
 assertFalse(appt.getValid());
 assertEquals(1, appt.getStartHour());
 assertEquals(30, appt.getStartMinute());
 assertEquals(0, appt.getStartDay());
 assertEquals(04, appt.getStartMonth());
 assertEquals(2017, appt.getStartYear());
 assertEquals("", appt.getTitle());
 assertEquals("", appt.getDescription());
}
@Test
public void test10()  throws Throwable  {
 int startHour=1;
 int startMinute=30;
 int startDay=40;
 int startMonth=4;
 int startYear=2017;
 String title=null;
 String description=null;
 //Construct a new Appointment object with the initial data
 Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
				 description);
// assertions
 assertFalse(appt.getValid());
 assertEquals(1, appt.getStartHour());
 assertEquals(30, appt.getStartMinute());
 assertEquals(40, appt.getStartDay());
 assertEquals(04, appt.getStartMonth());
 assertEquals(2017, appt.getStartYear());
 assertEquals("", appt.getTitle());
 assertEquals("", appt.getDescription());
 assertEquals(null, appt.toString());
}
@Test
 public void test11()  throws Throwable  {
	int startHour=0;
	int startMinute=30;
	int startDay=10;
	int startMonth=4;
	int startYear=2017;
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
// assertions
	assertTrue(appt.getValid());
	assertEquals(0, appt.getStartHour());
	assertEquals(30, appt.getStartMinute());
	assertEquals(10, appt.getStartDay());
	assertEquals(04, appt.getStartMonth());
	assertEquals(2017, appt.getStartYear());
	assertEquals("Birthday Party", appt.getTitle());
	assertEquals("This is my birthday party.", appt.getDescription());

}
@Test
 public void test12()  throws Throwable  {
	int startHour=24;
	int startMinute=60;
	int startDay=30;
	int startMonth=4;
	int startYear=2017;
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
// assertions
	assertTrue(appt.getValid());
	assertEquals(24, appt.getStartHour());
	assertEquals(60, appt.getStartMinute());
	assertEquals(30, appt.getStartDay());
	assertEquals(04, appt.getStartMonth());
	assertEquals(2017, appt.getStartYear());
	assertEquals("Birthday Party", appt.getTitle());
	assertEquals("This is my birthday party.", appt.getDescription());

}
@Test
 public void test13()  throws Throwable  {
	int startHour=0;
	int startMinute=0;
	int startDay=1;
	int startMonth=4;
	int startYear=2017;
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
// assertions
	assertTrue(appt.getValid());
	assertEquals(0, appt.getStartHour());
	assertEquals(0, appt.getStartMinute());
	assertEquals(1, appt.getStartDay());
	assertEquals(04, appt.getStartMonth());
	assertEquals(2017, appt.getStartYear());
	assertEquals("Birthday Party", appt.getTitle());
	assertEquals("This is my birthday party.", appt.getDescription());

}
@Test
 public void test14()  throws Throwable  {
	int startHour=1;
	int startMinute=1;
	int startDay=28;
	int startMonth=2;
	int startYear=2017;
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
// assertions
	assertTrue(appt.getValid());
	assertEquals(1, appt.getStartHour());
	assertEquals(1, appt.getStartMinute());
	assertEquals(28, appt.getStartDay());
	assertEquals(02, appt.getStartMonth());
	assertEquals(2017, appt.getStartYear());
	assertEquals("Birthday Party", appt.getTitle());
	assertEquals("This is my birthday party.", appt.getDescription());

}
@Test
 public void test15()  throws Throwable  {
	int startHour=1;
	int startMinute=1;
	int startDay=1;
	int startMonth=4;
	int startYear=2017;
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
// assertions

	assertTrue(appt.getValid());
	appt.setStartHour(70);
	assertFalse(appt.getValid());
	// assertEquals(1, appt.getStartHour());
	// assertEquals(1, appt.getStartMinute());
	// assertEquals(1, appt.getStartDay());
	// assertEquals(5, appt.getStartMonth());
	// assertEquals(2017, appt.getStartYear());
	// assertEquals("Birthday Party", appt.getTitle());
	// assertEquals("This is my birthday party.", appt.getDescription());

}
@Test
 public void test16()  throws Throwable  {
	int startHour=1;
	int startMinute=1;
	int startDay=1;
	int startMonth=4;
	int startYear=2017;
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
// assertions

	assertTrue(appt.getValid());
	appt.setStartMinute(70);
	assertFalse(appt.getValid());


}
@Test
 public void test17()  throws Throwable  {
	int startHour=1;
	int startMinute=1;
	int startDay=1;
	int startMonth=4;
	int startYear=2017;
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
// assertions

	assertTrue(appt.getValid());
	appt.setStartDay(70);
	assertFalse(appt.getValid());


}
@Test
 public void test18()  throws Throwable  {
	int startHour=1;
	int startMinute=1;
	int startDay=1;
	int startMonth=4;
	int startYear=2017;
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
// assertions


	appt.setStartMonth(0);
	assertEquals(0, appt.getStartMonth());
	assertFalse(appt.getValid());


}
@Test
 public void test19()  throws Throwable  {
	int startHour=1;
	int startMinute=1;
	int startDay=1;
	int startMonth=4;
	int startYear=2017;
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
// assertions
	assertEquals(2, appt.getRecurBy());
	assertFalse(appt.isRecurring());

}
@Test
 public void test20()  throws Throwable  {
	 int startHour=1;
	int startMinute=1;
	int startDay=1;
	int startMonth=1;
	int startYear=1;
	String title="day";
	String description="day";
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);


					int [] arr = null;
					appt.setRecurrence(arr, 0, 2, 0);

					assertEquals(2, appt.getRecurIncrement());

					assertFalse(appt.isRecurring());

}
@Test
 public void test21()  throws Throwable  {
	 int startHour=11;
	int startMinute=1;
	int startDay=1;
	int startMonth=1;
	int startYear=1;
	String title="day";
	String description="day";
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
	appt.setStartHour(11);
	assertEquals(11,appt.getStartHour());
	appt.setStartMinute(30);
	assertEquals(30,appt.getStartMinute());
	appt.setStartDay(10);
	assertEquals(10,appt.getStartDay());
	appt.setStartMonth(04);
	assertEquals(04,appt.getStartMonth());
	appt.setStartYear(2017);
	assertEquals(2017, appt.getStartYear());
	appt.setTitle("Birthday Party");
	assertEquals("Birthday Party",appt.getTitle());
	appt.setDescription("This is my birthday party.");
	assertEquals("This is my birthday party.", appt.getDescription());

	assertEquals("\t"+04 + "/" + 10 + "/" + 2017 + " at " + 11 + ":" + 30 + "am"  +   " ," + "Birthday Party" + ", " + "This is my birthday party."+"\n", appt.toString());
}
@Test
 public void test22()  throws Throwable  {
	 int startHour=00;
	int startMinute=1;
	int startDay=1;
	int startMonth=1;
	int startYear=1;
	String title="day";
	String description="day";
	Appt appt = new Appt(startHour,
					 startMinute ,
					 startDay ,
					 startMonth ,
					 startYear ,
					 title,
					description);
	appt.setStartHour(00);
	assertEquals(00,appt.getStartHour());
	appt.setStartMinute(00);
	assertEquals(00,appt.getStartMinute());
	appt.setStartDay(10);
	assertEquals(10,appt.getStartDay());
	appt.setStartMonth(04);
	assertEquals(04,appt.getStartMonth());
	appt.setStartYear(2017);
	assertEquals(2017, appt.getStartYear());
	appt.setTitle("Birthday Party");
	assertEquals("Birthday Party",appt.getTitle());
	appt.setDescription("This is my birthday party.");
	assertEquals("This is my birthday party.", appt.getDescription());

	assertEquals("\t"+04 + "/" + 10 + "/" + 2017 + " at " + 12 + ":" + 00 + "am"  +   " ," + "Birthday Party" + ", " + "This is my birthday party."+"\n", appt.toString());
}
@Test
 public void test23()  throws Throwable  {
	int startHour=24;
	int startMinute=30;
	int startDay=31;
	int startMonth=4;
	int startYear=2017;
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
// assertions
	assertTrue(appt.getValid());
	assertEquals(24, appt.getStartHour());
	assertEquals(30, appt.getStartMinute());
	assertEquals(31, appt.getStartDay());
	assertEquals(04, appt.getStartMonth());
	assertEquals(2017, appt.getStartYear());
	assertEquals("Birthday Party", appt.getTitle());
	assertEquals("This is my birthday party.", appt.getDescription());

}
@Test
 public void test24()  throws Throwable  {
	int startHour=24;
	int startMinute=30;
	int startDay=10;
	int startMonth=1;
	int startYear=2017;
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
// assertions
	assertTrue(appt.getValid());
	assertEquals(24, appt.getStartHour());
	assertEquals(30, appt.getStartMinute());
	assertEquals(10, appt.getStartDay());
	assertEquals(1, appt.getStartMonth());
	assertEquals(2017, appt.getStartYear());
	assertEquals("Birthday Party", appt.getTitle());
	assertEquals("This is my birthday party.", appt.getDescription());

}
//add more unit tests as you needed

}
