

package com.example.android.lifecycles.step5

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel


class SeekBarViewModel : ViewModel() {

    var seekbarValue = MutableLiveData<Int>()
}
