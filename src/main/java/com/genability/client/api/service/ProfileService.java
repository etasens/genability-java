package com.genability.client.api.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.genability.client.api.request.GetProfileRequest;
import com.genability.client.api.request.GetProfilesRequest;
import com.genability.client.types.Response;
import com.genability.client.types.Profile;


public class ProfileService extends BaseService {
	
    private static final TypeReference<Response<Profile>> PROFILE_RESPONSE_TYPEREF = new TypeReference<Response<Profile>>() {};

	/**
	 * Calls the REST service to get a Profile based on the arguments passed in.
	 * 
	 * @return
	 */
	public Response<Profile> getProfile(GetProfileRequest request) {
		
		if(log.isDebugEnabled()) log.debug("getProfile called");
		
		String uri = "beta/usage/profiles";
		if (request.getProfileId() != null && request.getProfileId().length() !=0) {
			uri += "/" + request.getProfileId();
		}
		
		Response<Profile> response = this.callGet(
				uri,
				request.getQueryParams(),
				PROFILE_RESPONSE_TYPEREF);
		
		if(log.isDebugEnabled()) log.debug("getProfile completed");
		
		return response;
		
	}

	/**
	 * Calls the REST service to get Profiles based on the arguments passed in.
	 * 
	 * @return
	 */
	public Response<Profile> getProfiles(GetProfilesRequest request) {
		
		if(log.isDebugEnabled()) log.debug("getProfiles called");
		
		String uri = "beta/usage/profiles";
		
		Response<Profile> response = this.callGet(
				uri,
				request.getQueryParams(),
				PROFILE_RESPONSE_TYPEREF);
		
		if(log.isDebugEnabled()) log.debug("getProfiles completed");
		
		return response;
		
	}
	
	public Response<Profile> addProfile(Profile profile) {
		
		if(log.isDebugEnabled()) log.debug("addProfile called");
	
		Response<Profile> response = this.callPost(
				"beta/usage/profiles", 
				profile,
				PROFILE_RESPONSE_TYPEREF);
		
		if(log.isDebugEnabled()) log.debug("addProfile completed");
		
		return response;
		
	}
	
}