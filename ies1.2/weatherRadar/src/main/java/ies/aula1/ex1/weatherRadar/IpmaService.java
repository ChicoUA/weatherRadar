package ies.aula1.ex1.weatherRadar;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * IPMA API service mapping
 */
public interface IpmaService {

    @GET("distrits-islands.json")
    Call<Cities> getCities();

}
