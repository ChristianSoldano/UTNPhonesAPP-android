package edu.utn.utnphonesapp.Interface;

import edu.utn.utnphonesapp.dto.LoginDto;
import edu.utn.utnphonesapp.dto.LoginResponseDto;
import edu.utn.utnphonesapp.model.User;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface JsonApi {
    @GET("api/user/{userId}")
    Call<User> getUser(@Path("userId") Integer userId, @Header("Authorization") String token);

    @FormUrlEncoded
    @POST("/api/user/login")
    Call<LoginResponseDto> login(@Field("username") String username, @Field("password") String password);
}
