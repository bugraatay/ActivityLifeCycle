package com.androidedu.kodluyoruzakademi.activitylifecycle;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class BaActivity extends AppCompatActivity {

    private final String MAIN_TAG = "Buğra Atay";

    @Override
    protected void onCreate(Bundle savedInstanceState) {//Çalıştı
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba);

        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    public void onContentChanged() {//Çalıştı
        super.onContentChanged();
        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    protected void onStart() {//Çalıştı
        super.onStart();
        Log.e(MAIN_TAG, printInfo());
        //cmd+alt+shift+l satırları düzenler.
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {//Çalıştı
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {//Çalıştı
        super.onPostCreate(savedInstanceState);
        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    protected void onResume() {//Çalıştı
        super.onResume();
        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    protected void onPostResume() {//Çalıştı
        super.onPostResume();
        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    public void onAttachedToWindow() {//Çalıştı
        super.onAttachedToWindow();
        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {//Çalıştı
        Log.e(MAIN_TAG, printInfo());
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {//Çalıştı
        Log.e(MAIN_TAG, printInfo());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    protected void onPause() {//Çalıştı
        super.onPause();
        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    protected void onStop() {//Çalıştı
        super.onStop();
        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    protected void onDestroy() {//Çalıştı
        super.onDestroy();
        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    public void onUserInteraction() {//Çalışmadı >>> Temelde fragmentimiz olmadığından çağırlmadı diyebiliriz.
        super.onUserInteraction();
        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    protected void onUserLeaveHint() {//Çalışmadı >>>  onUserInteract çağırıldığında bu da ilk olarak çalığırılır.
        super.onUserLeaveHint();
        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {//Çalışmadı >>> Aktivity class'ı sonucunda geriye bi değer dönmediğinden olsa gerek bu da cağırılmadı.
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    protected void onRestart() {//Çalışmadı >>>  Uygulamayı arkaplana alıp tekrar açsaydık çalışacaktı.
        super.onRestart();
        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    public void onAttachFragment(Fragment fragment) {//Çalışmadı >> Çünkü fragment eklemedik.
        super.onAttachFragment(fragment);
        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {//Çalışmadı >>> Uygulama içinde sistemsel bir değişiklik yapmadığımızdan çalışmadı.
        super.onConfigurationChanged(newConfig);
        Log.e(MAIN_TAG, printInfo());
    }

    @Override
    public void onBackPressed() {//Çalıştı >>> Mainboard'a döndüm.
        super.onBackPressed();
        Log.e(MAIN_TAG, printInfo());
    }

    public static String printInfo() {
        return String.format("Şu anda %s metodundayız.",
                Thread.currentThread().getStackTrace()[3].getMethodName());
    }

}
