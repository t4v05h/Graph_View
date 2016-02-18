package com.example.elearning.graph_view;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {
    //ArrayList<DataPoint> dpArrayValue = null;
    //DataPoint dpValue = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GraphView graph = (GraphView) findViewById(R.id.graph);


        /*for (int i = 0; i < 6; i++) {
            dpValue = new DataPoint(i, i+1);

            dpArrayValue.add(i, 3);
        }*/
        /*int i = 0;

        DataPoint dpValue = new DataPoint(i, i+1);
        DataPoint dpValue1 = new DataPoint(i, i+1);
        DataPoint dpValue2 = new DataPoint(i, i+1);
        DataPoint dpValue3 = new DataPoint(i, i+1);
        DataPoint dpValue4 = new DataPoint(i, i+1);
        DataPoint dpValue5 = new DataPoint(i, i+1);

        dpArrayValue.add(dpValue);
        dpArrayValue.add(dpValue1);
        dpArrayValue.add(dpValue2);
        dpArrayValue.add(dpValue3);
        dpArrayValue.add(dpValue4);
        dpArrayValue.add(dpValue5);

        /*BarGraphSeries<DataPoint> series = new BarGraphSeries<DataPoint>(new DataPoint[] {
                dpArrayValue.get(0),
                dpArrayValue.get(1),
                dpArrayValue.get(2),
                dpArrayValue.get(3),
                dpArrayValue.get(4),
                dpArrayValue.get(5)
        });*/

        BarGraphSeries<DataPoint> series = new BarGraphSeries<DataPoint>(new DataPoint[] {
        //LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, 3),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        graph.addSeries(series);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
