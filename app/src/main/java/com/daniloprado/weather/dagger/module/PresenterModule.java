package com.daniloprado.weather.dagger.module;

import com.daniloprado.weather.data.repository.CityRepository;
import com.daniloprado.weather.data.repository.ForecastRepository;
import com.daniloprado.weather.view.cityadd.CityAddContract;
import com.daniloprado.weather.view.cityadd.CityAddPresenter;
import com.daniloprado.weather.view.cityforecast.CityForecastContract;
import com.daniloprado.weather.view.cityforecast.CityForecastPresenter;
import com.daniloprado.weather.view.citylist.CityListContract;
import com.daniloprado.weather.view.citylist.CityListPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {

    @Provides
    public CityListContract.Presenter provideCityListPresenter(CityRepository cityRepository) {
        return new CityListPresenter(cityRepository);
    }

    @Provides
    public CityForecastContract.Presenter provideCityForecastPresenter(ForecastRepository forecastRepository) {
        return new CityForecastPresenter(forecastRepository);
    }

    @Provides
    public CityAddContract.Presenter provideCityAddPresenter(CityRepository cityRepository) {
        return new CityAddPresenter(cityRepository);
    }

}
