/*
 * Copyright 2014 Wiebe Elsinga
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.elsinga.socialurlshare.demo.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.elsinga.socialurlshare.channels.FacebookShare;
import com.elsinga.socialurlshare.channels.GooglePlusShare;
import com.elsinga.socialurlshare.channels.LinkedInShare;
import com.elsinga.socialurlshare.channels.TwitterShare;

public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTwitter = (Button) findViewById(R.id.btnTwitter);
        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create {@link TwitterShare}, provide the URL, and share.
                TwitterShare sharer = new TwitterShare(MainActivity.this);
                sharer.setLink(getString(R.string.github_repo_url));
                sharer.share();
            }
        });

        Button btnFacebook = (Button) findViewById(R.id.btnFacebook);
        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create {@link FacebookShare}, provide the URL, and share.
                FacebookShare sharer = new FacebookShare(MainActivity.this);
                sharer.setLink(getString(R.string.github_repo_url));
                sharer.share();
            }
        });


        Button btnLinkedin = (Button) findViewById(R.id.btnLinkedIn);
        btnLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create {@link LinkedInShare}, provide the URL, and share.
                LinkedInShare sharer = new LinkedInShare(MainActivity.this);
                sharer.setLink(getString(R.string.github_repo_url));
                sharer.share();
            }
        });


        Button btnGooglePlus = (Button) findViewById(R.id.btnGooglePlus);
        btnGooglePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create {@link GooglePlusShare}, provide the URL, and share.
                GooglePlusShare sharer = new GooglePlusShare(MainActivity.this);
                sharer.setLink(getString(R.string.github_repo_url));
                sharer.share();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about:
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
