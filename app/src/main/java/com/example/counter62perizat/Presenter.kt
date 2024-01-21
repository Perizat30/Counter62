package com.example.counter62perizat

import android.graphics.Color

class Presenter {

    private var model = CounterModel()
    private lateinit var view : CounterView

    fun increament() {
        model.increament()
        view.showNewCount(model.number)

        if(model.number==10){
            view.showToast("Поздравляем!")
        }
        if (model.number==15){
            view.changeTextColor(Color.GREEN)
        }

    }

    fun decreament(){
        model.decreament()
        view.showNewCount(model.number)
    }

    fun attachView(view: CounterView){
        this.view = view
    }

}