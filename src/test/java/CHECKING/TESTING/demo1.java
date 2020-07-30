package CHECKING.TESTING;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo1 {

	public static void main(String[] args) throws ParseException {

		String date = "15/02/2020";
//convert the date in text to real date format  
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date formatteddate = sdf.parse(date);
		System.out.println(formatteddate);

//Retrieving the day
		String sday = new SimpleDateFormat("dd").format(formatteddate);
		int day = Integer.parseInt(sday);
		System.out.println(day);

// Retrieving the months in different formats MM-MMMM
		String smon1 = new SimpleDateFormat("MM").format(formatteddate);
		int month1 = Integer.parseInt(smon1);
		System.out.println(smon1);

		String smon2 = new SimpleDateFormat("MMMM").format(formatteddate);
		System.out.println(smon2);

		String smon3 = new SimpleDateFormat("MMM").format(formatteddate);
		System.out.println(smon3);
//Retrieving the year from formatted date
		String year=new SimpleDateFormat("yyyy").format(formatteddate);
		int yr=Integer.parseInt(year);
		System.out.println(year);
		
		
		
		
		
		  
		
		
	}

}
