package com.fatih.android_retrofit_practice;




import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderAPI {

    @GET("posts")
    Call<List<Post>> getPost();

    @GET("posts/2/comments")
    Call<List<Comment>> getComments();
}
