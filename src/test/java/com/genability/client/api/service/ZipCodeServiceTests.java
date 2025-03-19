package com.genability.client.api.service;

import com.genability.client.api.request.BaselineRequest;
import com.genability.client.types.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ZipCodeServiceTests extends BaseServiceTests {

    private static final ZipCodeService zipCodeService = genabilityClient.getZipCodeService();

    @Test
    public void testGetZipCode() {
        ZipCode zipCode = callService("98007");
        assertEquals("City Not Correct.", "Bellevue".toLowerCase(), zipCode.getCity().toLowerCase());
		assertEquals("Country Not Correct.", "US".toLowerCase(), zipCode.getCountry().toLowerCase());
		assertEquals("State Not Correct.", "WA".toLowerCase(), zipCode.getState().toLowerCase());
		assertEquals("Latitude Not Correct.", 47.619741, zipCode.getLatitude(),  0.000001);
		assertEquals("Longitude Not Correct.", -122.142986, zipCode.getLongitude(), 0.000001);
    }


    public final ZipCode callService(final String zipCode) {
        final Response<ZipCode> restResponse = zipCodeService.getZipCode(zipCode);

        assertNotNull("restResponse null", restResponse);
        assertEquals("bad status", restResponse.getStatus(), Response.STATUS_SUCCESS);
        assertEquals("bad type", restResponse.getType(), ZipCode.REST_TYPE);
        assertTrue("bad count", restResponse.getCount() > 0);

        return restResponse.getResults().get(0);
    }
}
