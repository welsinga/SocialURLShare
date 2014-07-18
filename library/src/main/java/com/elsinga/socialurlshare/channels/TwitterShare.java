package com.elsinga.socialurlshare.channels;

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

import android.content.Context;

import com.elsinga.socialurlshare.URLBuilder;

/**
 * Class that tweets a URL to Twitter using either the native Twitter app or the default browser,
 * depending what is installed on the device.
 *
 * @author W.Elsinga
 */
public class TwitterShare extends URLBuilder {

    /**
     * Twitter native package name
     */
    private static final String TWITTER_PACKAGE = "com.twitter.android";


    /**
     * URL to tweet to Twitter
     */
    private static final String TWITTER_URL = "https://twitter.com/intent/tweet?url=";

    /**
     * Default constructor.
     *
     * @param context Context
     */
    public TwitterShare(Context context) {
        super(context);
    }

    @Override
    protected String getPackage() {
        return TWITTER_PACKAGE;
    }

    @Override
    protected String getURL() {
        return TWITTER_URL;
    }
}
