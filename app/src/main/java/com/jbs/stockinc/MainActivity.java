package com.jbs.stockinc;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.AWSDataStorePlugin;
import com.amplifyframework.datastore.generated.model.StockData;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Amplify.DataStore.query(StockData.class,
                stockDataList -> {
                    while(stockDataList.hasNext()) {
                        StockData stockData = stockDataList.next();

                        Log.i("Tutorial", "==== Todo ====");
                        Log.i("Tutorial", "Name: " + stockData.getName() + " (" + stockData.getSymbol() + ")");
                        Log.i("Tutorial", "Sector: " + stockData.getSector());
                    }
                },
                failure -> Log.e("Tutorial", "Could not query DataStore", failure)
        );
    }
}
