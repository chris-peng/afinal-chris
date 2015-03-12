/**
 * Copyright (c) 2012-2013, Michael Yang 杨福海 (www.yangfuhai.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.tsz.afinal.bitmap.core;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Animation;

/**
 * 必须覆盖实现getLoadingBitmap方法，或者主动调用setLoadingBitmap方法，否则图片加载线程无法映射，导致无法加载
 * @author chris
 * 
 * @since 2015年3月12日
 */
public class BitmapDisplayConfig {
	
	
	private int bitmapWidth;
	private int bitmapHeight;
	
	private Animation animation;
	
	private int animationType;
	private Bitmap loadingBitmap;
	private Bitmap loadfailBitmap;
	private int loadingAnimationDrawable = -1;
	

	public int getBitmapWidth() {
		return bitmapWidth;
	}

	public void setBitmapWidth(int bitmapWidth) {
		this.bitmapWidth = bitmapWidth;
	}

	public int getBitmapHeight() {
		return bitmapHeight;
	}

	public void setBitmapHeight(int bitmapHeight) {
		this.bitmapHeight = bitmapHeight;
	}

	public Animation getAnimation() {
		return animation;
	}

	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

	public int getAnimationType() {
		return animationType;
	}

	public void setAnimationType(int animationType) {
		this.animationType = animationType;
	}

	/**
	 * 必须覆盖实现，或者主动调用setLoadingBitmap方法，否则图片加载线程无法映射，导致无法加载
	 * @author chris
	 *
	 * @return
	 * @since 2015年3月12日
	 */
	public Bitmap getLoadingBitmap() {
		return loadingBitmap;
	}

	public void setLoadingBitmap(Bitmap loadingBitmap) {
		this.loadingBitmap = loadingBitmap;
	}

	public Bitmap getLoadfailBitmap() {
		return loadfailBitmap;
	}

	public void setLoadfailBitmap(Bitmap loadfailBitmap) {
		this.loadfailBitmap = loadfailBitmap;
	}
	
	public int getLoadingAnimationDrawable() {
		return loadingAnimationDrawable;
	}

	public void setLoadingAnimationDrawable(int loadingAnimationDrawable) {
		this.loadingAnimationDrawable = loadingAnimationDrawable;
	}

	/**
	 * 图片加载完显示前的回调方法
	 * @author chris
	 *
	 * @param imageView
	 * @param bitmap
	 * @since 2015年3月12日
	 */
	public void onBitmapLoadComplete(View imageView, Bitmap bitmap){
		
	}

	public class AnimationType{
		public static final int userDefined = 0;
		public static final int fadeIn = 1;
	}

}
