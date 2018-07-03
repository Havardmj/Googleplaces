package f.havardmj.googleplaces2.Remote;

import f.havardmj.googleplaces2.Model.MyPlaces;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IGoogleAPIService {
    @GET
    Call<MyPlaces> getNearByPlaces(@Url String url);
}
