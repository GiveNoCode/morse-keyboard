package ua.givenocode.morsekeyboard

import android.inputmethodservice.InputMethodService
import android.view.View
import android.widget.TextView


class MorseInputMethodService : InputMethodService() {

    override fun onCreateInputView(): View {
        return TextView(this).apply {
            text = "Hello"
        }
    }

}