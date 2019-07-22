package com.mario_antolovic.weatherappupgraded;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.mancj.materialsearchbar.MaterialSearchBar;
import com.mario_antolovic.weatherappupgraded.Retrofit.IOpenWeatherMap;
import com.mario_antolovic.weatherappupgraded.Retrofit.RetrofitClient;

import java.util.List;

import io.reactivex.disposables.CompositeDisposable;
import retrofit2.Retrofit;


/**
 * A simple {@link Fragment} subclass.
 */
public class CityFragment extends Fragment {

    private List<String > lstCities;
    private MaterialSearchBar searchBar;
    ImageView img_weather;
    TextView txt_city_name,txt_humidity,txt_sunrise,txt_sunset,txt_pressure,txt_tempature,txt_description,txt_date_time,txt_wind,txt_geo_coords;
    LinearLayout weather_panel;
    ProgressBar loading;

    CompositeDisposable compositeDisposable;
    IOpenWeatherMap mService;

    static CityFragment instance;

    public  static CityFragment getInstance() {

        if (instance == null)

            instance = new CityFragment();


        return instance;
    }





    public CityFragment() {
        // Required empty public constructor
        compositeDisposable = new CompositeDisposable();
        Retrofit retrofit = RetrofitClient.getInstance();
        mService = retrofit.create(IOpenWeatherMap.class);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView =  inflater.inflate(R.layout.fragment_city, container, false);

        img_weather = (ImageView)itemView.findViewById(R.id.img_weather);
        txt_city_name = (TextView)itemView.findViewById(R.id.txt_city_name);
        txt_humidity = (TextView)itemView.findViewById(R.id.txt_humidity);
        txt_wind = (TextView)itemView.findViewById(R.id.txt_wind);
        txt_geo_coords = (TextView)itemView.findViewById(R.id.txt_get_coords);
        txt_sunrise = (TextView)itemView.findViewById(R.id.txt_sunrise);
        txt_sunset = (TextView)itemView.findViewById(R.id.txt_sunset);
        txt_description = (TextView)itemView.findViewById(R.id.txt_description);
        txt_pressure = (TextView)itemView.findViewById(R.id.txt_pressure);
        txt_tempature = (TextView)itemView.findViewById(R.id.txt_tempature);
        txt_date_time = (TextView)itemView.findViewById(R.id.txt_date_time);


        weather_panel = (LinearLayout)itemView.findViewById(R.id.weathger_panel);
        loading = (ProgressBar)itemView.findViewById(R.id.loading);

        return itemView;
    }

}
