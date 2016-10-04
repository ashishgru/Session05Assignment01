package com.acadgild.session05assignment01;

import android.app.SearchManager;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Bundle dataBundle;
    String searchableText;
    EditText editText;
    Intent intentSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSearch= (Button)findViewById(R.id.search_button1);
        buttonSearch.setOnClickListener(new OnClickListener()
        {   public void onClick(View v)
        {
            dataBundle = new Bundle();
            editText = (EditText)findViewById(R.id.editText4search);
            searchableText = editText.getText().toString();

            try {
                intentSearch = new Intent(Intent.ACTION_WEB_SEARCH);
                intentSearch.putExtra(SearchManager.QUERY, searchableText);
                startActivity(intentSearch);
            } catch (Exception e) {
                Log.e("searchableText :: ","Error IS :: " + e);
            }
        }
        });

    }
}
