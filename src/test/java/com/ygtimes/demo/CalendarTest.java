package com.ygtimes.demo;

import javax.sound.midi.Soundbank;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author
 * @date 2019/12/11 - 19:21
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.err.println(c);
        SimpleDateFormat sdf= new SimpleDateFormat("yy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(c));
    }

}
