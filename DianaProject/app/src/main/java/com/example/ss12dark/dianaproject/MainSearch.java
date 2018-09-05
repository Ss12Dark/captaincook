package com.example.ss12dark.dianaproject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class MainSearch extends AppCompatActivity {
    EditText mEditText;
    String respond;
    final Activity a = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search);
        mEditText= (EditText) findViewById(R.id.text);


    }
    public void search(View v){



        String searching = mEditText.getText().toString();
        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="https://api.edamam.com/search?q="+searching+"&app_id=96a55f54&app_key=ec7aadce6297834eb3908c1e9a5ff805";


        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        respond =response;

//                        try {
//
//                            JSONObject jsontObj = new JSONObject(respond);
//
//                            JSONArray resultArray = jsontObj.getJSONArray("hits");
//
//                            for (int i = 0; i < resultArray.length(); i++) {
//                                JSONArray resultArray2 = resultArray.getJSONArray(i);
//                                for(int j=0; j< resultArray2.length();j++){
//                                    JSONArray resultArray3 = resultArray2.getJSONArray(0);
//                                    JSONObject jsonObject = resultArray3.getJSONObject(j);
//                                    String name = jsonObject.getString("label");
////                    String image = jsonObject.getString("image");
////
////                    JSONArray resultArray4 = resultArray3.getJSONArray(10);
////                    for(int k=0; k< resultArray4.length();k++){
////                        JSONObject jsonObject2 = resultArray3.getJSONObject(j);
////                        //ingredientLines
////                    }
////                    String calo = jsonObject.getString("calories");
//////                Recipe recipe = new Recipe(name,desc,image,No);
//////
//                                    Toast.makeText(a, name, Toast.LENGTH_SHORT).show();
//                                }
//
//                            }
//
//
//
////            ArrayAdapter<String> adapter = new ArrayAdapter<>(activity, android.R.layout.simple_list_item_1, Movies);
////            listViewMovies.setAdapter(adapter);
//
//                        }
//                        catch (JSONException ex) {
//                            Toast.makeText(a, "Error: " + ex.getMessage(), Toast.LENGTH_LONG).show();
//                            //need for my own use while using json
//                        }




                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mEditText.setText("That didn't work!");
            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);

    }

}
