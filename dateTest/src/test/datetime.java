package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class datetime {

	public static void main(String[] args) {
		String pattern = "dd/MM/yyyy";
	    SimpleDateFormat format = new SimpleDateFormat(pattern);
	    try {
	      Date date = format.parse("31/12/2006");
	     // System.out.println(date);
	    } catch (ParseException e) {
	      e.printStackTrace();
	    }
	    // formatting
	    System.out.println(format.format(new Date()));
	  }

	}


