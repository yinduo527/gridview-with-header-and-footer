package com.yinduo527.foldabletextview.sample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.yinduo527.foldabletextview.library.HeaderFooterGridView;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HeaderFooterGridView gridView = (HeaderFooterGridView) findViewById(R.id.grid_view);
        gridView.setAdapter(new GridAdapter());
        gridView.setNumColumns(2);
        gridView.setOnItemClickListener(this);

        gridView.addHeaderView(View.inflate(MainActivity.this, R.layout.grid_header, null));
        gridView.addFooterView(View.inflate(MainActivity.this, R.layout.grid_footer, null));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(MainActivity.this, "position" + position, Toast.LENGTH_SHORT).show();
    }

    private class GridAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 20;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
                convertView = View.inflate(MainActivity.this, R.layout.grid_item, null);
            }

            ((TextView) convertView.findViewById(R.id.content)).setText("position:" + position);
            return convertView;
        }
    }
}
