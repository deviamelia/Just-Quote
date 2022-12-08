package com.devi.just_quote.API;

import com.devi.just_quote.Model.QuoteModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("quote")
    Call<List<QuoteModel>> ardRetrieveQuote();
}
