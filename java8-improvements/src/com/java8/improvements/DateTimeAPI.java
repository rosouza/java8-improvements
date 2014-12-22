package com.java8.improvements;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Java SE8 will have a completely new Date and Time API that will contain
 * classes like LocalDate, LocalTime, LocalDateTime, ZoneDateTime and so on. The
 * API will use as the default calendar the standard defined in ISO-8601, which
 * is a calendar based on the Gregorian calendar and globally used as the
 * default standard for representing date and time.
 * 
 * Moreover, the new Date and Time API will use the Unicode Common Locale Data
 * Repository (CLDR), with support for the world�s languages and with the
 * world�s largest collection of locale data available, and also the Time-Zone
 * Database (TZDB) that provides information about every time zone change
 * globally since 1970.Enough being said, let us see a few examples.
 * 
 * @see http://bravenewtalent.curatasite.com/articles/share/455996/
 * @author Constantin Marian Alin
 *
 */
public class DateTimeAPI {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.now();
		System.out.println("Local time now: " + localTime);

		LocalTime newTime = localTime.plusMinutes(13);
		System.out.println("Local new time: " + newTime);

		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);

		LocalDate yesterday = today.minusDays(1);
		System.out.println("Yesterday: " + yesterday);

		LocalDateTime localDateTime = yesterday.atTime(8, 0);
		System.out.println("Yesterday at 8 o'clock: " + localDateTime);

		LocalDateTime earlyMorning = LocalDate.of(2014, Month.FEBRUARY, 10).atStartOfDay();
		System.out.println("Early morning of today: " + earlyMorning);

		// To see a more complex example, we will try to find out how long a
		// flight from Bucharest to London will be
		ZoneId Bucharest = ZoneId.of("Europe/Bucharest");
		ZoneId London = ZoneId.of("Europe/London");

		LocalDate date = LocalDate.of(2014, Month.FEBRUARY, 14);
		LocalTime takeoff = LocalTime.of(13, 20);
		LocalTime landing = LocalTime.of(15, 10);
		Duration flightTime = Duration.between(ZonedDateTime.of(date, takeoff, Bucharest),
				ZonedDateTime.of(date, landing, London));

		System.out.println("Flight time: " + flightTime.toHours() + " hours and " + flightTime.toMinutes() % 60
				+ " minutes");

	}

}
