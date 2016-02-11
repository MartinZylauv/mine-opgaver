package test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetest {
	String oldstring = "01-01-2015";
	LocalDateTime datetime = LocalDateTime.parse(oldstring, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	String test = datetime.toString();
}
