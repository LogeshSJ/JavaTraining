package H_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class H_Date {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(" dd/MM/yyyy a");
        System.out.println(simpleDateFormat.format(date));
    }
}
