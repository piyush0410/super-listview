package piyush.com.mysuperlistitems;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by piyush on 30/03/16.
 */
public class MySuperApplication extends Application
{
	@Override
	public void onCreate()
	{
		super.onCreate();
		Fresco.initialize(this);
	}
}
