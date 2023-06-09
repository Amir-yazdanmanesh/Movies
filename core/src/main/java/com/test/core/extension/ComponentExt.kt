package com.test.core.extension

import android.content.Context
import androidx.fragment.app.Fragment

inline fun <reified SubComponentProvider> Context.findComponent(): SubComponentProvider {
    return if (applicationContext is SubComponentProvider) {
        (applicationContext as SubComponentProvider)
    } else {
        throw IllegalStateException("Provide the application context which implement SubComponent")
    }
}
inline fun <reified SubComponentProvider> Fragment.findComponent(): SubComponentProvider = requireContext().findComponent()


