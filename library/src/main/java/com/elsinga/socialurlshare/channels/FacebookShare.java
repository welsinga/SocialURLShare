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
 * Class that shares a URL to Facebook using either the native Facebook app or the default browser,
 * depending what is installed on the device.
 *
 * @author W.Elsinga
 */
public class FacebookShare extends URLBuilder {

    /**
     * Facebook native package name
     */
    private static final String FACEBOOK_PACKAGE = "com.facebook.katana";

    /**
     * URL to share to Facebook
     */
    private static final String FACEBOOK_URL = "http://m.facebook.com/sharer.php?u=";


    /**
     * Default constructor.
     *
     * @param context Context
     */
    public FacebookShare(Context context) {
        super(context);
    }

    @Override
    protected String getPackage() {
        return FACEBOOK_PACKAGE;
    }

    @Override
    protected String getURL() {
        return FACEBOOK_URL;
    }


}
