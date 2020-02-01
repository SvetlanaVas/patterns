import com.github.javafaker.Faker;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;



    @Value
    public class UserNameInfo {
       private final String surName;
       private final String name;

       public String toString() {
          return this.getSurName() + " " + this.getName();
       }
    }


    /*public static String getFutureDate(int plusDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        LocalDate currentDate = LocalDate.now();
        LocalDate controlDate = currentDate.plusDays(plusDate);
        String formattedControlDate = controlDate.format(formatter);
        return formattedControlDate;
    }

    public static String getCity() {
        String[] cities = {"Москва", "Казань", "Новосибирск", "Краснодар", "Екатеринбург"};
        Random random = new Random();
        int index = random.nextInt(cities.length);
        return (cities[index]);
    }*/


