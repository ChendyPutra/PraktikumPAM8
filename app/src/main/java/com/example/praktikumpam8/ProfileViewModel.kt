package com.example.praktikumpam8

import androidx.lifecycle.ViewModel
import com.example.praktikumpam8.Data.ProfileUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ProfileViewModel: ViewModel() {

    private val _stateUI = MutableStateFlow(ProfileUIState())
    val stateUI: StateFlow<ProfileUIState> = _stateUI.asStateFlow()

    fun setProfile(listProfile: MutableList<String>){
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                nama = listProfile[0],
                no_tlp = listProfile[1],
                alamat = listProfile[2]
            )
        }
    }

}