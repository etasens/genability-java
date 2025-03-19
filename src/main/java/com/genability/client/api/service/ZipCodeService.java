package com.genability.client.api.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.genability.client.types.Response;
import com.genability.client.types.ZipCode;

public class ZipCodeService extends BaseService {

    private static final TypeReference<Response<ZipCode>> RESPONSE_TYPEREF = new TypeReference<Response<ZipCode>>() {
    };

    private static final String URL_BASE = "/public/zipcodes/";

    public Response<ZipCode> getZipCode(final String zipCode) {
        return this.callGet(URL_BASE + zipCode, null, RESPONSE_TYPEREF);
    }
}
