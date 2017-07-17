package au.com.gridstone.training_kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by rowan on 17/7/17.
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, ListActivity::class.java)
        startActivity(intent)
        finish()
    }
}