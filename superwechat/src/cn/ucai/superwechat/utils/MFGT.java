package cn.ucai.superwechat.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;

import java.util.ArrayList;

import cn.ucai.superwechat.R;
import cn.ucai.superwechat.ui.GuideActivity;
import cn.ucai.superwechat.ui.LoginActivity;
import cn.ucai.superwechat.ui.RegisterActivity;
import cn.ucai.superwechat.ui.SettingsActivity;
import cn.ucai.superwechat.ui.SplashActivity;


/**
 * Created by MTJ on 2017/1/10.
 */

public class MFGT {
    public static void finish(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }

    public static void startActivity(Activity context, Class<?> clz) {
        context.overridePendingTransition(R.anim.push_right_in, R.anim.push_bottom_out);
        context.startActivity(new Intent(context, clz));

    }

    public static void startActivity(Activity context, Intent intent) {
        context.overridePendingTransition(R.anim.push_right_in, R.anim.push_bottom_out);
        context.startActivity(intent);
    }

    public static void gotoLogin(Activity activity) {
        startActivity(activity, LoginActivity.class);
    }

    public static void gotoRegister(Activity activity) {
        startActivity(activity, RegisterActivity.class);
    }


    public static void gotoGuide(SplashActivity activity) {
        startActivity(activity, GuideActivity.class);
    }

    public static void gotoLogin1(Class<SettingsActivity> settingsActivityClass) {
    }


    public static void gotoSetting(FragmentActivity activity) {
        startActivity(activity,SettingsActivity.class);
    }
}
