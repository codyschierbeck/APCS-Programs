package Spoj;

import java.util.Calendar;
import java.util.GregorianCalendar;

class MyCalendar
{

	Calendar calendar = new GregorianCalendar();
	public MyCalendar(int a, int b, int c)
	{
		day = a;
		year = c;
		month = b -1;
		

		calendar.set(year, month, day);	
	}
	
	public String getDayofWeek()
	{
		int dayOfweek = calendar.get(calendar.DAY_OF_WEEK);
		if (dayOfweek == Calendar.SUNDAY)
		{
			return "Sunday";
		}
		else if (dayOfweek == Calendar.MONDAY)
		{
			return "Monday";
		}
		else if (dayOfweek == Calendar.TUESDAY)
		{
			return "Tuesday";
		}
		else if (dayOfweek == Calendar.WEDNESDAY)
		{
			return "Wednesday";
		}
		else if (dayOfweek == Calendar.THURSDAY)
		{
			return "Thursday";
		}
		else if (dayOfweek == Calendar.FRIDAY)
		{
			return "Friday";
		}
		else 
		{
			return "Saturday";
		}
	}
	private int day, month, year;
	

}


