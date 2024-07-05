package au.com.willai.screenlock

import android.content.Intent
import android.service.quicksettings.TileService


class LockScreenTileService : TileService() {
    override fun onStartListening() {
        super.onStartListening()
        qsTile.label = "Lock Screen"
        qsTile.updateTile()
    }

    override fun onClick() {
        super.onClick()
        val intent = Intent("au.com.willai.screenlock.ACTION_LOCK_SCREEN")
        sendBroadcast(intent) // Send the broadcast to trigger the lock screen action

    }
}