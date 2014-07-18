![SocialURLShare](sample/src/main/res/drawable-xxhdpi/ic_launcher.png)

Android library for easy URL sharing to social channels.

## Overview

Sure, you can use the default ShareIntent class in Android, but what if you just want to share an URL and just want to share it with some Social Channels...

**SocialURLShare** provides different Social Channel implementations for easy URL sharing. 
The implementation will look if a native social channel app has been installed. If so, the native app will share the URL. If not, the default browser will be used..

Currently the library supports the following Social Channels:

-   Facebook&trade;
-   Twitter&trade;
-   LinkedIn&trade;
-   Google+&trade;

## [Changelog](https://github.com/welsinga/SocialURLShare/wiki/Changelog)
Current version: -


## Usage

Just create a SocialChannel Share Class, set the link and and call share:

Implementation example: sharing to Twitter&trade;
```java
    TwitterShare sharer = new TwitterShare(Activity);
    sharer.setLink("link to share");
    sharer.share();
```    

## License

    Copyright 2014 Wiebe Elsinga

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
