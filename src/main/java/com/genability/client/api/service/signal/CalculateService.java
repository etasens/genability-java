package com.genability.client.api.service.signal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.genability.client.api.request.signal.GetCalculatedCostRequest;
import com.genability.client.api.request.signal.GetMassCalculatedCostRequest;
import com.genability.client.api.request.signal.GetSmartPriceRequest;
import com.genability.client.api.service.BaseService;
import com.genability.client.types.Price;
import com.genability.client.types.Response;
import com.genability.client.types.signal.CalculatedCost;
import com.genability.client.types.signal.MassCalculation;
import com.genability.client.types.signal.SmartPrice;


public class CalculateService extends BaseService {

    private static final TypeReference<Response<CalculatedCost>> CALCULATEDCOST_RESPONSE_TYPEREF =
            new TypeReference<Response<CalculatedCost>>() { };
    private static final TypeReference<Response<MassCalculation>> MASSCALCULATION_RESPONSE_TYPEREF =
            new TypeReference<Response<MassCalculation>>() { };
    private static final TypeReference<Response<SmartPrice>> SMARTPRICE_RESPONSE_TYPEREF =
        new TypeReference<Response<SmartPrice>>() { };



    public Response<CalculatedCost> getCalculatedCost(GetCalculatedCostRequest request) {
        if (log.isDebugEnabled()) {
            log.debug("getCalculatedCost called");
        }

        String uri = "v1/ondemand/calculate";

        Response<CalculatedCost> response = this.callPost(
                uri,
                request,
                CALCULATEDCOST_RESPONSE_TYPEREF);

        if (log.isDebugEnabled()) {
            log.debug("getCalculatedCost completed");
        }

        return response;
    }

    public Response<MassCalculation> getMassCalculatedCost(GetMassCalculatedCostRequest request) {
        if (log.isDebugEnabled()) {
            log.debug("getMassCalculatedCost");
        }

        String uri = "v1/ondemand/calculate/mass";

        Response<MassCalculation> response = this.callPost(
                uri,
                request,
                MASSCALCULATION_RESPONSE_TYPEREF
        );

        if (log.isDebugEnabled()) {
            log.debug("getMassCalculatedCost completed");
        }

        return response;
    }

    /**
     * Calls the REST service to run a smart price calculation
     * @param request The request.
     * @return The return value.
     */
    public Response<SmartPrice> getSmartPrice(GetSmartPriceRequest request) {
        if (log.isDebugEnabled()) {
            log.debug("getSmartPrice");
        }

        String uri = "v1/prices/smart";

        Response<SmartPrice> response = this.callGet(
            uri,
            request.getQueryParams(),
            SMARTPRICE_RESPONSE_TYPEREF);

        if (log.isDebugEnabled()) {
            log.debug("getSmartPrice completed");
        }

        return response;
    }
}
