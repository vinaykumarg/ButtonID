package com.example.vinayg.buttonid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getName();
    private TextView mButtonInfoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonInfoView = (TextView) findViewById(R.id.button_info);
        Log.d(TAG,"onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy()");
    }

    public void onClick(View view) {
        Log.d(TAG,"onClick()");
        int id = view.getId();
        switch (id) {
            case R.id.left_button: mButtonInfoView.setText(getString(R.string.left));
                break;
            case R.id.right_button:mButtonInfoView.setText(getString(R.string.right));
                break;
            case R.id.bottom_left_button:mButtonInfoView.setText(R.string.bottomLeft);
                break;
            case R.id.bottom_right_button:mButtonInfoView.setText(R.string.bottomRight);
                break;
            default:break;

        }
    }

}
