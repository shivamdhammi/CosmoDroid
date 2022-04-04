package com.example.cosmodroid

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.baseui.room.BaseUI
import com.example.baseui.room.leaderboard.DataEntity
import com.example.baseui.room.leaderboard.LeaderBoardDataBase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MainViewModel : ViewModel() {
    private val data = MutableLiveData<List<DataEntity>>()
    fun getDataObserver(): LiveData<List<DataEntity>> = data
    fun storeLocalData() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                LeaderBoardDataBase.invoke(BaseUI.mApp).leaderBoardDao()
                    .insertAll(DataEntity(points = 1), DataEntity(points = 2))
            }
        }
    }

    fun fetchLocalData() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                data.postValue(
                    LeaderBoardDataBase.invoke(BaseUI.mApp).leaderBoardDao()
                        .getData()
                )
            }
        }
    }
}