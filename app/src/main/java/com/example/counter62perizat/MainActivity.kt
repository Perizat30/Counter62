package com.example.counter62perizat

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.counter62perizat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),CounterView {

    var presenter=Presenter()

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
        presenter.attachView(this)
    }

    private fun initClickers() {
        with(binding){
            increamentBtn.setOnClickListener {

                presenter.increament()
            }
            decreamentBtn.setOnClickListener {
                presenter.decreament()
            }
        }
    }

    override fun showNewCount(number: Int) {
        binding.resultTv.text = number.toString()
    }

    override fun showToast(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    override fun changeTextColor(color: Int) {
        binding.resultTv.setTextColor(color)
    }

}