package com.venturezhub.humphreybrian.githubquerry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

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
    //TODO Add the EdittextView and reffer it to the id in the activity_main xml file.

}
