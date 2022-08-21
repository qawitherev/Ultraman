package com.abing.ultraman.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Ultraman (
    @StringRes val ultramanName: Int,
    @DrawableRes val ultramanImage: Int,
    @StringRes val ultramanSynopsis: Int,
    @StringRes val ultramanHeight: Int,
    @StringRes val ultramanWeight: Int,
    @StringRes val ultramanSpecMove: Int
        )