package com.Crawling;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class CrawlingTraveloka {

	public static void main(String[] args) throws UnirestException {
		// TODO Auto-generated method stub
		HttpResponse<String> response = Unirest.post("https://www.traveloka.com/api/v2/flight/search/oneway")
				  .header("accept", "application/json")
				  .header("accept-encoding", "gzip, deflate, br")
				  .header("accept-language", "en,en-US;q=0.9")
				  .header("content-type", "application/json")
				  .header("cookie", "ajs_user_id=null; ajs_group_id=null; G_ENABLED_IDPS=google; _ga=GA1.2.346284618.1573630675; _gcl_au=1.1.742147883.1573630675; ajs_anonymous_id=%22f87e38a5-71ce-4ed1-8cd1-6547bb90a35d%22; __ssid=9c8e3b5465c6c390c14e8fac53696b2; cto_lwid=575f6544-12d1-41d9-bb4f-46d3586ab237; _fbp=fb.1.1573630743604.1631321285; tv-repeat-visit=true; isPriceFinderActive=null; dateIndicator=null; bannerMessage=null; displayPrice=null; tvs=qgdHX7GvehrD9XH5a3S4PWL3Nd74xArIuT+JzcRMbKddQHovERAJ9HWRLrAaZ0jPhWj5HSxm0ZKiRbldET1ham2PeYg1sQr2h/wIBjIyPQ1JQfOnq9PrXiJXCb7pG+GuSyTWhhkh0G99PEkMoMqtbMdM/Wnz7PMYqvNeSaHLo77kV0/iixnlas38HGQRNQZc3jW7f6f85zK7XA1xLrLbn3wpMY91AYFzJ6h8za/vSrnqDlY26eY/bwMK2Y7r9t1q; tv-pnheader=1; _gid=GA1.2.323991604.1575631245; flightFlightType=ONE_WAY; flightSourceAirport=JKTA; flightSourceLocation=Jakarta; flightNumOfAdults=1; flightNumChildren=0; flightNumInfants=0; flightSeatClassType=ECONOMY; flexibility=0; flightDepartureDate=14-12-2019; flightDestinationAirport=SUB; flightDestinationLocation=Surabaya; lux_uid=157567495098986291; isFirst10DomesticSearch=5; datadome=Hwv-e7zp~sVBW_Q76_beim_3gzH4KOmANVkhziPFiSd497QQb~PeIyp5N-1H03JEv5iAXwPHCz5a5HDSC~R2D3SWgA0hg.SWkCqed6vy5j; tvl=qgdHX7GvehrD9XH5a3S4PdE8AYpuF3hYPaT5bxhY7ZZNH/VQMMCOS6uMNuOvEKJZ4FzYZMQST5mWj8zpc2Dh2vKkpIJD77bEfGAQbe8NAc1tpRrTfMLFY3Ik3+D1DucJbOcA/dgFKvna1fBZL5UyvSqBfldiP8Ont2ONyuEMtjHvlyHfFnPptZUxAgMVwRNSCMYWUJplNNMY2P4/83O9X7gl2qZV6rsoZ7QtQPuFbMVu+JsMuu/qXdIpb8uUZKgm")
				  .header("origin", "https://www.traveloka.com")
				  .header("referer", "https://www.traveloka.com/en-id/flight/fullsearch?ap=JKTA.SUB&dt=14-12-2019.NA&ps=1.0.0&sc=ECONOMY")
				  .header("sec-fetch-mode", "cors")
				  .header("sec-fetch-site", "same-origin")
				  .header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.120 Safari/537.36")
				  .header("x-domain", "flight")
				  .header("x-route-prefix", "en-id")
				  .header("Cache-Control", "no-cache")
				  .header("Postman-Token", "d819387c-26c3-43c2-9705-a9c01cea99ca,16c862b0-41a4-4fe4-b5b2-ad11462f502b")
				  .header("Host", "www.traveloka.com")
				  .header("Connection", "keep-alive")
				  .header("cache-control", "no-cache")
				  .body("{\"clientInterface\":\"desktop\",\"data\":{\"currency\":\"IDR\",\"destinationAirportOrArea\":\"SUB\",\"flightDate\":{\"day\":\"14\",\"month\":\"12\",\"year\":\"2019\"},\"locale\":\"en_ID\",\"newResult\":true,\"numSeats\":{\"numAdults\":\"1\",\"numChildren\":\"0\",\"numInfants\":\"0\"},\"seatPublishedClass\":\"ECONOMY\",\"seqNo\":null,\"sortFilter\":{\"filterAirlines\":[],\"filterArrive\":[],\"filterDepart\":[],\"filterTransit\":[],\"selectedDeparture\":\"\",\"sort\":null},\"sourceAirportOrArea\":\"JKTA\",\"searchId\":null,\"usePromoFinder\":false,\"useDateFlow\":false,\"visitId\":\"ec7d4235-3706-47ac-a3ba-facdaaae485a\"},\"fields\":[]}")
				  .asString();
		
		JSONObject json = new JSONObject(response.getBody().toString());
		JSONObject json_data = (JSONObject) json.get("data");
		JSONArray searchResults = (JSONArray) json_data.get("searchResults");
		for(Object obj : searchResults) {
			System.out.println(obj);
		}
		
	}

}
