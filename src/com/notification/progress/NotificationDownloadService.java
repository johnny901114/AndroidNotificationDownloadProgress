package com.notification.progress;

import com.notification.progress.util.NotificationUtil;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class NotificationDownloadService extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

	@Override
	public void onCreate() {
		super.onCreate();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		int id = intent.getIntExtra("id", -1);
		NotificationUtil.notifyPtogressNotification(this,id);
		return super.onStartCommand(intent, flags, startId);
	}
}
