package ies.aula1.ex1.weatherRadar;

import java.util.Scanner;
import retrofit2.*;
import retrofit2.converter.gson.GsonConverterFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOG = LogManager.getLogger("logger");
	
    public static void main( String[] args )
    {
    	LOG.info("Selected Code was "+ args[0]);
    	
    	Retrofit retrofit = new Retrofit.Builder()             
    			 .baseUrl("http://api.ipma.pt/open-data/")             
    			 .addConverterFactory(GsonConverterFactory.create())             
    			 .build(); 
    	 
    	 IpmaService service = retrofit.create(IpmaService.class);     
    	 Call<IpmaCityForecast> callSync = service.getForecastForACity(Integer.parseInt(args[0])); 
    	 
    	 try {   
    		 LOG.info("Getting response from service");
    		 Response<IpmaCityForecast> apiResponse = callSync.execute();         
    		 IpmaCityForecast forecast = apiResponse.body(); 
    		 System.out.println("min temp for today: " + forecast.getData().                 
    	    		 listIterator().next().getTMin()); 
    	     System.out.println("max temp for today: " + forecast.getData().                 
    	    		 listIterator().next().getTMax()); 
    	 
    	    } 
    	 catch (Exception ex) {         
    		 ex.printStackTrace();     
    	 }
    }
}
