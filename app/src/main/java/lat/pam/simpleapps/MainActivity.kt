package lat.pam.simpleapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import lat.pam.simpleapps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Menggunakan viewModels() untuk memuat ViewModel
    private val viewModel: ScoreViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menghubungkan Data Binding dengan layout activity_main.xml
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Menyambungkan ViewModel dan binding lifecycle
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}

