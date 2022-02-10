package ua.givenocode.morsekeyboard

import android.inputmethodservice.InputMethodService
import android.view.LayoutInflater
import android.view.View
import ua.givenocode.morsekeyboard.databinding.KeyboardLayoutBinding


class MorseInputMethodService : InputMethodService() {

    override fun onCreateInputView(): View {
        return KeyboardLayoutBinding.inflate(LayoutInflater.from(this)).apply {
            dit.setOnClickListener { dit() }
            dah.setOnClickListener { dah() }
            shift.setOnClickListener { shift() }
            help.setOnClickListener { help() }
            lang.setOnClickListener { lang() }
            space.setOnClickListener { space() }
            del.setOnClickListener { del() }
            enter.setOnClickListener { enter() }
        }.root
    }

    private fun dit() {
        currentInputConnection.commitText(getString(R.string.dit), 1)
    }

    private fun dah() {
        currentInputConnection.commitText(getString(R.string.dah), 1)
    }

    private fun shift() {

    }

    private fun help() {

    }

    private fun lang() {

    }

    private fun space() {
        currentInputConnection.commitText(" ", 1)
    }

    private fun del() {
        if (currentInputConnection.getSelectedText(0).isNullOrEmpty()) {
            currentInputConnection.deleteSurroundingText(1, 0)
        }
    }

    private fun enter() {

    }
}