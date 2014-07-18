/*
 * Copyright 2014. Wiebe Elsinga
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.elsinga.socialurlshare.demo.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class AboutActivity extends ActionBarActivity {

    public static final String AUTHOR = "Wiebe Elsinga";
    public static final String LICENSE_URL = "http://www.apache.org/licenses/LICENSE-2.0 ";
    public static final String LICENSE_NAME = "Apache License, V2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        final String link = createLink(getString(R.string.github_repo_url), getString(R.string.library_name));

        TextView tvDisclaimer = (TextView) findViewById(R.id.disclaimer);
        tvDisclaimer.setText(Html.fromHtml(getString(R.string.disclaimer, link)));

        TextView tvCredits = (TextView) findViewById(R.id.writtenBy);
        tvCredits.setText(
                Html.fromHtml(getString(R.string.written_by, createLink(getString(R.string.google_plus_url), AUTHOR))));

        TextView tvLicense = (TextView) findViewById(R.id.license);
        tvLicense.setText(Html.fromHtml(
                getString(R.string.license, createLink(LICENSE_URL, LICENSE_NAME))
        ));

        setLinkMovementMethod(tvDisclaimer, tvCredits, tvLicense);
    }

    private String createLink(String url, String title) {
        return String.format("<a href=\"%s\">%s</a>", url, title);
    }

    private void setLinkMovementMethod(TextView... textViews) {
        for (TextView view : textViews) {
            view.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}



