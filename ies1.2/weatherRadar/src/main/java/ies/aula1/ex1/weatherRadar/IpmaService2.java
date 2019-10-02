package ies.aula1.ex1.weatherRadar;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IpmaService2 {
	@GET("forecast/meteorology/cities/daily/{city_id}.json")
    Call<IpmaCityForecast> getForecastForACity(@Path("city_id") int cityId);
}
