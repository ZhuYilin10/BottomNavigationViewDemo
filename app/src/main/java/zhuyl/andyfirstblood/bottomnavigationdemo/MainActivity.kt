package zhuyl.andyfirstblood.bottomnavigationdemo

import android.content.Context
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.makeText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById(R.id.menu_bottom) as BottomNavigationView
        bottomNavigationView.setOnNavigationItemSelectedListener(onItemSelectedListener(this))
    }

    inner class onItemSelectedListener(val context: Context): BottomNavigationView.OnNavigationItemSelectedListener {
        override fun onNavigationItemSelected(item: MenuItem): Boolean {
            if (item.itemId == R.id.action_1) {
                makeText(context, "1", LENGTH_LONG).show()
            }

            if (item.itemId == R.id.action_2) {
                makeText(context, "2", LENGTH_LONG).show()
            }

            if (item.itemId == R.id.action_3) {
                makeText(context, "3", LENGTH_LONG).show()
            }

            return true
        }
    }
}
