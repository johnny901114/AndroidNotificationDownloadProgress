package com.notification.progress.util;

import android.text.TextUtils;

public class StringUtil {

	public static String getUrlFileName(String fileUrl) {
		int index = fileUrl.lastIndexOf("/");
		System.out.println("index:" + index);
		if (index != -1) {
			String result = fileUrl.substring(index + 1);
			if (TextUtils.isEmpty(result)) {
				return MD5Util.getMD5Str(fileUrl);
			}
			return result;
		} else {
			return MD5Util.getMD5Str(fileUrl);
		}
	}
}
