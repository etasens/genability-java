package com.genability.client.util;

import java.io.IOException;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import com.genability.client.api.request.AccountAnalysisRequest;

/*
 * This class is used to serialize DateTime objects. In the special case where the timeZone is set to
 * AccountAnalysisRequest.DATE_ONLY_TIMEZONE, the result will contain the date only
 */
public class DateTimeSerializer extends JsonSerializer<DateTime> {

	@Override
	public void serialize(DateTime value, JsonGenerator jgen,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {
		
		if (AccountAnalysisRequest.DATE_ONLY_TIMEZONE.equals(value.getZone())) {
			LocalDate date = new LocalDate(value.getYear(), value.getMonthOfYear(), value.getDayOfMonth());
			jgen.writeObject(date);
		} else {
			jgen.writeObject(value);
		}
		
	}

}
