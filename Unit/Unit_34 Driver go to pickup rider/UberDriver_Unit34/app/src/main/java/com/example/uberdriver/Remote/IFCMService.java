package com.example.uberdriver.Remote;

import com.example.uberdriver.Model.FCMResponse;
import com.example.uberdriver.Model.FCMSendData;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAritg0I8:APA91bFIYgY2UOEoTkQD9knd6VK7tdKgxTnxqmtrKAZUAoyBserHFv-3qQ4Bi6W4ibu6ZXFkpU5oFNNE7oIB8m0IRtWCeEfnpZ9t6N4QFJyoVjLkI42Hj6avRmNmiSfqxVatM_6tCCgn"
    })
    @POST("fcm/send")
    Observable<FCMResponse> sendNotification(@Body FCMSendData body);
}
