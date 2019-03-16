package com.example.android.sunshine;

import android.content.Context;
import android.support.annotation.NonNull;

class ForecastAdapterImpl extends ForecastAdapter {
    /**
     * Creates a ForecastAdapter.
     *
     * @param context      Used to talk to the UI and app resources
     * @param clickHandler The on-click handler for this adapter. This single handler is called
     */
    public ForecastAdapterImpl(@NonNull Context context, ForecastAdapterOnClickHandler clickHandler) {
        super(context, clickHandler);
    }
}
