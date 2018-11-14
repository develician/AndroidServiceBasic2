package com.dongho.boundservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
//        throw new UnsupportedOperationException("Not yet implemented");
        return new LocalBinder();
    }

    public class LocalBinder extends Binder {
        MyService getService() {
            return MyService.this;
        }


    }

    public int CalcNum(int m, int n) {
        return m * n;
    }
}
