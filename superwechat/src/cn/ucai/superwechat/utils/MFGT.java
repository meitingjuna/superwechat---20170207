package cn.ucai.superwechat.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;

import com.hyphenate.chat.EMClient;
import com.hyphenate.easeui.domain.User;

import java.util.ArrayList;

import cn.ucai.superwechat.R;
import cn.ucai.superwechat.ui.AddContactActivity;
import cn.ucai.superwechat.ui.AddFirentActivity;
import cn.ucai.superwechat.ui.ChatActivity;
import cn.ucai.superwechat.ui.FirentProfileActivity;
import cn.ucai.superwechat.ui.GuideActivity;
import cn.ucai.superwechat.ui.LoginActivity;
import cn.ucai.superwechat.ui.MainActivity;
import cn.ucai.superwechat.ui.RegisterActivity;
import cn.ucai.superwechat.ui.SettingsActivity;
import cn.ucai.superwechat.ui.SplashActivity;
import cn.ucai.superwechat.ui.UserProfileActivity;
import cn.ucai.superwechat.ui.VideoCallActivity;
import cn.ucai.superwechat.widget.I;


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

    public static void gotoLoginCleanTask(Activity activity) {
        startActivity(activity, new Intent(activity, LoginActivity.class)
                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
    }

    public static void gotoRegister(Activity activity) {
        startActivity(activity, RegisterActivity.class);
    }


    public static void gotoGuide(SplashActivity activity) {
        startActivity(activity, GuideActivity.class);
    }

    public static void gotoLogin1(Class<SettingsActivity> settingsActivityClass) {
    }


    public static void gotoSetting(Activity activity) {
        startActivity(activity, SettingsActivity.class);
    }

    public static void gotoUserProfile(Activity activity) {
        startActivity(activity, UserProfileActivity.class);
    }

    public static void gotoAddContact(Activity activity) {
        startActivity(activity, AddContactActivity.class);
    }


    public static void gotoFirent(Activity activity, User user) {
        startActivity(activity, new Intent(activity, FirentProfileActivity.class)
                .putExtra(I.User.TABLE_NAME, user));

    }

    public static void gotoFirent(Activity activity, String username) {
        if (username.equals(EMClient.getInstance().getCurrentUser())) {
            gotoUserProfile(activity);
        } else {
            startActivity(activity, new Intent(activity, FirentProfileActivity.class)
                    .putExtra(I.User.USER_NAME, username));
        }
    }

    public static void gotoAddFirent(Activity activity, String username) {
        startActivity(activity, new Intent(activity, AddFirentActivity.class).
                putExtra(I.User.USER_NAME, username));
    }

    public static void gotoChat(Activity activity, String mUserName) {
        startActivity(activity, new Intent(activity, ChatActivity.class)
                .putExtra("userId", mUserName));
    }

    public static void gotoMiain(Activity activity) {
        startActivity(activity, new Intent(activity, MainActivity.class).
                putExtra(I.BACK_MAIN_FROM_CHAT, true));
    }

}




















