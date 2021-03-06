package com.dieam.reactnativepushnotification.modules;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import static com.dieam.reactnativepushnotification.modules.RNPushNotification.LOG_TAG;

public class RNPushNotificationAttributes {
    private final String id;
    private final String message;
    private final double fireDate;
    private final String title;
    private final String ticker;
    private final boolean autoCancel;
    private final String largeIcon;
    private final String smallIcon;
    private final String bigText;
    private final String subText;
    private final String number;
    private final String sound;
    private final String color;
    private final String group;
    private final boolean userInteraction;
    private final boolean playSound;
    private final boolean vibrate;
    private final double vibration;
    private final String actions;
    private final String tag;
    private final String repeatType;
    private final double repeatTime;
    private final boolean ongoing;

    public RNPushNotificationAttributes(Bundle bundle) {
        id = bundle.getString("id");
        message = bundle.getString("message");
        fireDate = bundle.getDouble("fireDate");
        title = bundle.getString("title");
        ticker = bundle.getString("ticker");
        autoCancel = bundle.getBoolean("autoCancel");
        largeIcon = bundle.getString("largeIcon");
        smallIcon = bundle.getString("smallIcon");
        bigText = bundle.getString("bigText");
        subText = bundle.getString("subText");
        number = bundle.getString("number");
        sound = bundle.getString("sound");
        color = bundle.getString("color");
        group = bundle.getString("group");
        userInteraction = bundle.getBoolean("userInteraction");
        playSound = bundle.getBoolean("playSound");
        vibrate = bundle.getBoolean("vibrate");
        vibration = bundle.getDouble("vibration");
        actions = bundle.getString("actions");
        tag = bundle.getString("tag");
        repeatType = bundle.getString("repeatType");
        repeatTime = bundle.getDouble("repeatTime");
        ongoing = bundle.getBoolean("ongoing");
    }

    public RNPushNotificationAttributes(JSONObject jsonObject) {
        try {
            id = jsonObject.has("id") ? jsonObject.getString("id") : null;
            message = jsonObject.has("message") ? jsonObject.getString("message") : null;
            fireDate = jsonObject.has("fireDate") ? jsonObject.getDouble("fireDate") : 0.0;
            title = jsonObject.has("title") ? jsonObject.getString("title") : null;
            ticker = jsonObject.has("ticker") ? jsonObject.getString("ticker") : null;
            autoCancel = jsonObject.has("autoCancel") ? jsonObject.getBoolean("autoCancel") : true;
            largeIcon = jsonObject.has("largeIcon") ? jsonObject.getString("largeIcon") : null;
            smallIcon = jsonObject.has("smallIcon") ? jsonObject.getString("smallIcon") : null;
            bigText = jsonObject.has("bigText") ? jsonObject.getString("bigText") : null;
            subText = jsonObject.has("subText") ? jsonObject.getString("subText") : null;
            number = jsonObject.has("number") ? jsonObject.getString("number") : null;
            sound = jsonObject.has("sound") ? jsonObject.getString("sound") : null;
            color = jsonObject.has("color") ? jsonObject.getString("color") : null;
            group = jsonObject.has("group") ? jsonObject.getString("group") : null;
            userInteraction = jsonObject.has("userInteraction") ? jsonObject.getBoolean("userInteraction") : false;
            playSound = jsonObject.has("playSound") ? jsonObject.getBoolean("playSound") : true;
            vibrate = jsonObject.has("vibrate") ? jsonObject.getBoolean("vibrate") : true;
            vibration = jsonObject.has("vibration") ? jsonObject.getDouble("vibration") : 1000;
            actions = jsonObject.has("actions") ? jsonObject.getString("actions") : null;
            tag = jsonObject.has("tag") ? jsonObject.getString("tag") : null;
            repeatType = jsonObject.has("repeatType") ? jsonObject.getString("repeatType") : null;
            repeatTime = jsonObject.has("repeatTime") ? jsonObject.getDouble("repeatTime") : 0.0;
            ongoing = jsonObject.has("ongoing") ? jsonObject.getBoolean("ongoing") : false;
        } catch (JSONException e) {
            throw new IllegalStateException("Exception while initializing RNPushNotificationAttributes from JSON", e);
        }
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("id", id);
        bundle.putString("message", message);
        bundle.putDouble("fireDate", fireDate);
        bundle.putString("title", title);
        bundle.putString("ticker", ticker);
        bundle.putBoolean("autoCancel", autoCancel);
        bundle.putString("largeIcon", largeIcon);
        bundle.putString("smallIcon", smallIcon);
        bundle.putString("bigText", bigText);
        bundle.putString("subText", subText);
        bundle.putString("number", number);
        bundle.putString("sound", sound);
        bundle.putString("color", color);
        bundle.putString("group", group);
        bundle.putBoolean("userInteraction", userInteraction);
        bundle.putBoolean("playSound", playSound);
        bundle.putBoolean("vibrate", vibrate);
        bundle.putDouble("vibration", vibration);
        bundle.putString("actions", actions);
        bundle.putString("tag", tag);
        bundle.putString("repeatType", repeatType);
        bundle.putDouble("repeatTime", repeatTime);
        bundle.putBoolean("ongoing", ongoing);
        return bundle;
    }

    public JSONObject toJson() {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("id", id);
            jsonObject.put("message", message);
            jsonObject.put("fireDate", fireDate);
            jsonObject.put("title", title);
            jsonObject.put("ticker", ticker);
            jsonObject.put("autoCancel", autoCancel);
            jsonObject.put("largeIcon", largeIcon);
            jsonObject.put("smallIcon", smallIcon);
            jsonObject.put("bigText", bigText);
            jsonObject.put("subText", subText);
            jsonObject.put("number", number);
            jsonObject.put("sound", sound);
            jsonObject.put("color", color);
            jsonObject.put("group", group);
            jsonObject.put("userInteraction", userInteraction);
            jsonObject.put("playSound", playSound);
            jsonObject.put("vibrate", vibrate);
            jsonObject.put("vibration", vibration);
            jsonObject.put("actions", actions);
            jsonObject.put("tag", tag);
            jsonObject.put("repeatType", repeatType);
            jsonObject.put("repeatTime", repeatTime);
            jsonObject.put("ongoing", ongoing);
        } catch (JSONException e) {
            Log.e(LOG_TAG, "Exception while converting RNPushNotificationAttributes to " +
                    "JSON. Returning an empty object", e);
            return new JSONObject();
        }
        return jsonObject;
    }

    @Override
    // For debugging
    public String toString() {
        return "RNPushNotificationAttributes{" +
                "id='" + id + '\'' +
                ", message='" + message + '\'' +
                ", fireDate=" + fireDate +
                ", title='" + title + '\'' +
                ", ticker='" + ticker + '\'' +
                ", autoCancel=" + autoCancel +
                ", largeIcon='" + largeIcon + '\'' +
                ", smallIcon='" + smallIcon + '\'' +
                ", bigText='" + bigText + '\'' +
                ", subText='" + subText + '\'' +
                ", number='" + number + '\'' +
                ", sound='" + sound + '\'' +
                ", color='" + color + '\'' +
                ", group='" + group + '\'' +
                ", userInteraction=" + userInteraction +
                ", playSound=" + playSound +
                ", vibrate=" + vibrate +
                ", vibration=" + vibration +
                ", actions='" + actions + '\'' +
                ", tag='" + tag + '\'' +
                ", repeatType='" + repeatType + '\'' +
                ", repeatTime=" + repeatTime +
                ", ongoing=" + ongoing +
                '}';
    }

    public String getId() {
        return id;
    }

    public double getFireDate() {
        return fireDate;
    }

    public String getTitle() {
        return title;
    }

    public String getTicker() {
        return ticker;
    }

    public boolean isAutoCancel() {
        return autoCancel;
    }

    public String getLargeIcon() {
        return largeIcon;
    }

    public String getSmallIcon() {
        return smallIcon;
    }

    public String getBigText() {
        return bigText;
    }

    public String getSubText() {
        return subText;
    }

    public String getNumber() {
        return number;
    }

    public String getSound() {
        return sound;
    }

    public String getColor() {
        return color;
    }

    public String getMessage() {
        return message;
    }

    public String getGroup() {
        return group;
    }

    public boolean isUserInteraction() {
        return userInteraction;
    }

    public boolean isPlaySound() {
        return playSound;
    }

    public boolean isVibrate() {
        return vibrate;
    }

    public double getVibration() {
        return vibration;
    }

    public String getTag() {
        return tag;
    }

    public String getActions() {
        return actions;
    }

    public String getRepeatType() {
        return repeatType;
    }

    public double getRepeatTime() {
        return repeatTime;
    }
}
