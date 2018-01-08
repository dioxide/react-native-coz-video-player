package com.coz.rn.media.videoplayer;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.coz.rn.media.videoplayer.ReactMediaPlayerViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MediaKitPackage implements ReactPackage {

  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return Arrays.<ViewManager>asList(new ReactMediaPlayerViewManager());
  }
}
