package com.udacity.shoestore.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class MainViewModel : ViewModel() {

    // LiveData objects using lazy in. array list to hold list of shoes
    val shoeList: MutableLiveData<ArrayList<Shoe>> by lazy {
        MutableLiveData<ArrayList<Shoe>>()
    }

    val addNewShoe: MutableLiveData<Shoe> by lazy {
        MutableLiveData<Shoe>()
    }

    init {
        shoeList.value = ArrayList()
    }

    fun addToList() {
        shoeList.value?.add(addNewShoe.value!!)
    }

    fun resetNewShoe() {
        addNewShoe.value = Shoe("", 0.0, "", "")
    }

    fun resetShoeList() {
        shoeList.value?.clear()
    }
}