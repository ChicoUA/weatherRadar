package ies.aula1.ex1.weatherRadar;

import java.util.Scanner;
import retrofit2.*;
import retrofit2.converter.gson.GsonConverterFactory;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Retrofit retrofit = new Retrofit.Builder()             
    			 .baseUrl("http://api.ipma.pt/open-data/")             
    			 .addConverterFactory(GsonConverterFactory.create())             
    			 .build(); 
    	 
    	 IpmaService service = retrofit.create(IpmaService.class);     
    	 Call<IpmaCityForecast> callSync = service.getForecastForACity(Integer.parseInt(args[0])); 
    	 
    	 try {         
    		 Response<IpmaCityForecast> apiResponse = callSync.execute();         
    		 IpmaCityForecast forecast = apiResponse.body(); 
    	 
    	     System.out.println("max temp for today: " + forecast.getData().                 
    	    		 listIterator().next().getTMax()); 
    	 
    	    } 
    	 catch (Exception ex) {         
    		 ex.printStackTrace();     
    	 }
    }
}
