package com.example.android.uamp.media.extensions

import android.app.PendingIntent
import android.os.Build


fun Int.immutableFlag() : Int {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        this or PendingIntent.FLAG_IMMUTABLE
    } else {
        this
    }
}