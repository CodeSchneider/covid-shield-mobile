/*
 * Copyright (C) 2020 Presidenza del Consiglio dei Ministri.
 * Please refer to the AUTHORS file for more information.
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package app.covidshield.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

/**
 * Broadcast receiver for callbacks from exposure notification API.
 */
class ExposureNotificationReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Log.d("custom", "ExposureNotificationReceiver action received")
        val action = intent.action
//
//        if (ExposureNotificationClient.ACTION_EXPOSURE_STATE_UPDATED == action) {
//            val token = intent.getStringExtra(ExposureNotificationClient.EXTRA_TOKEN)!!
//            workManager.enqueueUniqueWork(
//                "StateUpdatedWorker",
//                ExistingWorkPolicy.KEEP,
//                OneTimeWorkRequest.Builder(StateUpdatedWorker::class.java)
//                    .setInputData(
//                        Data.Builder()
//                            .putString(TOKEN_KEY, token)
//                            .build()
//                    )
//                    .build()
//            )
//        }
    }
}
