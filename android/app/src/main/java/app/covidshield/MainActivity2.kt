package app.covidshield

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import app.covidshield.extensions.bindPromise
import com.google.android.gms.nearby.Nearby
import kotlinx.android.synthetic.main.main_activity.cta
import org.devio.rn.splashscreen.SplashScreen

class MainActivity2 : AppCompatActivity() {

    private val exposureNotificationClient by lazy {
        Nearby.getExposureNotificationClient(application)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
//        SplashScreen.show(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        cta.setOnClickListener {
            exposureNotificationClient.start()
                .addOnFailureListener {
                    Log.d("custom", "failure")
                }
                .addOnSuccessListener {
                    Log.d("custom", "success")
                }
        }
    }
}
