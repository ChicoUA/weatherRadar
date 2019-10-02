package ies.aula1.ex1.weatherRadar;

import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import retrofit2.*;
import retrofit2.converter.gson.GsonConverterFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOG = LogManager.getLogger("logger");
	
	
    public static void main( String[] args )
    {
    	LOG.info("Using city name: " + args[0]);
    	int id=0;    	
    	Retrofit retrofit = new Retrofit.Builder()             
    			 .baseUrl("http://api.ipma.pt/open-data/")             
    			 .addConverterFactory(GsonConverterFactory.create())             
    			 .build(); 
    	 
    	 IpmaService service = retrofit.create(IpmaService.class);  
    	 IpmaService2 service2 = retrofit.create(IpmaService2.class);
    	 Call<Cities> callSync = service.getCities(); 
    	 
    	 try {   
    		 LOG.info("Getting response from service cities");
    		 Response<Cities> apiResponse = callSync.execute();         
    		 Cities forecast = apiResponse.body();
    		 for(Datum dt : forecast.getData()) {
    			 if(dt.getLocal().equalsIgnoreCase(args[0])) {
    				 id = dt.getGlobalIdLocal();
    			 }
    				 
    		 }
    	 
    	    } 
    	 catch (Exception ex) {         
    		 ex.printStackTrace();     
    	 }
    	 LOG.info("Getting forecast for city id: "+id);
    	 Call<IpmaCityForecast> callSync2 = service2.getForecastForACity(id);
    	 try {   
    		 LOG.info("Getting response from service forecast");
    		 Response<IpmaCityForecast> apiResponse = callSync2.execute();         
    		 IpmaCityForecast forecast = apiResponse.body();
    		 System.out.println("max temp for today: " + forecast.getData().                 
    	    		 listIterator().next().getTMax()); 
    	 
    	    } 
    	 catch (Exception ex) {         
    		 ex.printStackTrace();     
    	 }
    	 
    }
}
