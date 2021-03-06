package com.venturezhub.humphreybrian.githubquerry;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.venturezhub.humphreybrian.githubquerry.utilities.NetworkUtils;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private EditText mSerchbox;
    private TextView searchUrl;
    private TextView githubResuts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSerchbox = (EditText) findViewById(R.id.et_search_box);
        searchUrl = (TextView) findViewById(R.id.tv_url);
        githubResuts = (TextView) findViewById(R.id.tv_github_search_results_json);
    }
    private void makeGithubSearchQuery(){
        String githubQuery = mSerchbox.getText().toString();
        URL githubSearchUrl = NetworkUtils.buildUrl(githubQuery);
        searchUrl.setText(githubSearchUrl.toString());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemThatWasClickedId = item.getItemId();
        if (itemThatWasClickedId == R.id.action_search) {
            Context context = MainActivity.this;
            String textToShow = "Search clicked";
            Toast.makeText(context, textToShow, Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //    @Override
//    public boolean onCreateOptionMenu(Menu menu){
//
//        getMenuInflater().inflate(R.menu.main_menu, menu);
//        return  true;
//    }
    //TODO Add the EdittextView and reffer it to the id in the activity_main xml file.

}
