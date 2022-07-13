package com.example.springbootdemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class DiscountTest {

    public static String m8(String val1,String val2){
        double discount = Math.ceil((Double.parseDouble(val1) / Double.parseDouble(val2)) * 100) * 0.01d;
        System.out.println(String.valueOf(discount));
        return String.valueOf(discount);
    }

    public static void main(String[] args) {
        m8("58.8","90.0");

        m8("88.0","100.0");

        m8("138","248");

        m8("136","155");

        // 0.50131926
        m8("19","37.9");

        m8("46.5","63");

    }

}
