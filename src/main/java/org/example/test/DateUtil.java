package org.example.test;

import java.time.LocalDate;

public class DateUtil {
    public static String today() {
        return LocalDate.now().toString();
    }
}