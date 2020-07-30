package CHECKING.TESTING;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {

	public static void main(String[] args) throws ParseException {
		 
		String month ="November";
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
		Date formatteddata=sdf.parse(month);
		
		String mon=new SimpleDateFormat("MM").format(formatteddata);
		int m1=Integer.parseInt(mon);
		System.out.println(mon);

	}

}
 