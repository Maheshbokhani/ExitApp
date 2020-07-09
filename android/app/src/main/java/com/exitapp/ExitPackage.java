package com.exitapp;
 
import androidx.annotation.NonNull;
 
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class ExitPackage implements ReactPackage {
   @NonNull
   @Override
   public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactContext) {
       List<NativeModule> module = new ArrayList<>();
       /* Created modules add here */
       module.add(new ExitModule(reactContext));
       return module;
   }
 
   public List<Class<? extends JavaScriptModule>> createJSModules() {
       return new ArrayList<>();
   }
 
   @NonNull
   @Override
   public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactContext) {
       return Collections.emptyList();
   }
}
