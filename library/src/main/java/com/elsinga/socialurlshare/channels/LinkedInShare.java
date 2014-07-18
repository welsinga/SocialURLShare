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
 * Class that shares a URL to LinkedIn using either the native LinkedIn app or the default browser,
 * depending what is installed on the device
 *
 * @author W.Elsinga
 */
public class LinkedInShare extends URLBuilder {

    /**
     * LinkedIn native package name
     */
    private static final String LINKEDIN_URL = "http://www.linkedin.com/shareArticle?mini=true&url=";

    /**
     * URL to share to LinkedIn
     */
    private static final String LINKEDIN_PACKAGE = "com.linkedin.android";

    /**
     * Default constructor.
     *
     * @param context Context
     */
    public LinkedInShare(Context context) {
        super(context);
    }

    @Override
    protected String getPackage() {
        return LINKEDIN_PACKAGE;
    }

    @Override
    protected String getURL() {
        return LINKEDIN_URL;
    }
}
