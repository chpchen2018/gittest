package com.gittestp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @BindView(R.id.main_activity_txt)
    TextView mMainActivityTxt;
    @BindView(R.id.main_activity_llyt)
    LinearLayout mMainActivityLlyt;
    @BindView(R.id.include_content_main)
    LinearLayout includeContentMain;



    @BindView(R.id.content_main_txt)
    TextView contentMainTxt;
//    @BindView(R.id.include_content_main)
//    LinearLayout mIncludeContentMain;
//    @BindView(R.id.content_main_txt_test)
//    TextView mContentMainTxtTest;
//    @BindView(R.id.include_content_main_test)
//    LinearLayout mIncludeContentMainTest;

    /**
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        /**
         * 第一次修改，添加一个类

         */
        FirstClass firstClass = new FirstClass();
        firstClass.overrideTest();

//        Inflater.
//        content_main_txt
//        View viewById = findViewById(R.id.include_test);
//        viewById.setVisibility(View.GONE);

        TextView viewById1 = (TextView) findViewById(R.id.content_main_txt_test);
        Log.i(TAG, "onCreate: " + viewById1.getText());
        viewById1.setText("设置时间:");

        LinearLayout viewById2 = (LinearLayout) findViewById(R.id.include_content_main_test);
        viewById2.setVisibility(View.VISIBLE);

        includeContentMain.setVisibility(View.GONE);
//        findViewById(R.id.content_main_txt)
//        include_first_look


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
