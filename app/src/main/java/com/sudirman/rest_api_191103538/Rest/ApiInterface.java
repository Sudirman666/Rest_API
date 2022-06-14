package com.sudirman.rest_api_191103538.Rest;

import com.sudirman.rest_api_191103538.Model.GetKontak;
import com.sudirman.rest_api_191103538.Model.PostPutDelKontak;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {
    @GET("kontak_android")
    Call<GetKontak>getKontak();
    @FormUrlEncoded
    @POST("kontak")
    Call<PostPutDelKontak> postKontak(@Field("nama")String nama,
                                      @Field("nomor")String nomor);
    @FormUrlEncoded
    @PUT("kontak")
    Call<PostPutDelKontak> postKontak(@Field("id")String id,
                                     @Field("nama")String nama,
                                     @Field("nomor")String nomor);
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "kontak", hasBody = true)
    Call<PostPutDelKontak> deleteKontak(@Field("id")String id);

}
