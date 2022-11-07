package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	private static final String FORMAT_DEFAUT = "dd/MM/yyyy HH:mm:ss";

	public static String format(String pattern, Date date) {
		
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}
	
	public static String format(Date date) {
		
		return format(FORMAT_DEFAUT, date);
	}
}
