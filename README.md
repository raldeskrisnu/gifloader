GifLoader documentation
================

Deployed By

 [![](https://jitpack.io/v/raldeskrisnu/gifloader.svg)](https://jitpack.io/#raldeskrisnu/gifloader)


# Change log

[Change log 1.0 *initial commit*](https://github.com/raldeskrisnu/gifloader/releases/tag/1.0/) 

[Change log 1.1 *Refactor name Loader*](https://github.com/raldeskrisnu/gifloader/releases/tag/1.1) 

# How to use it

Create variable to call the library example

```
private GifLoader ourGif;
```
and then set at onCreate in activity or onCreateView in fragment.

```
ourGif = new ourGif(this);
```

if you want to show the preloader. you have to call with parameter

```
ourGif.showPreloader(theme,layout of preloader, imageview of gif, gif drawable);
```
and then if you want to hide the loader. you just call

```
ourGif.hidePreloader();
```

# Example to use it :

```
GifLoader test = new GifLoader(context);
        test.showPreloader(R.style.Theme_CustomDialog R.layout.content_preloader, R.id.custom_loading_imageView,R.drawable.rocket_preloader);

        //if you want to hide preloader
        test.hidePreloader();
```

for the theme use this one.

```
<style name="Theme.CustomDialog" parent="@android:style/Theme.Translucent.NoTitleBar">
        <item name="android:windowFrame">@null</item>
        <item name="android:windowBackground">@android:color/transparent</item>
        <item name="android:windowIsFloating">true</item>
        <item name="android:windowTitleStyle">@null</item>
        <item name="android:windowAnimationStyle">@android:style/Animation.Dialog</item>
        <item name="android:windowSoftInputMode">stateUnspecified|adjustPan</item>
        <item name="android:backgroundDimEnabled">true</item>
        <item name="android:background">@android:color/transparent</item>
    </style>
```

[*Powered By Glide Bumptech*](https://github.com/bumptech/glide) 
