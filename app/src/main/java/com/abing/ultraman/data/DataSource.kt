package com.abing.ultraman.data

import com.abing.ultraman.R
import com.abing.ultraman.model.Ultraman

class DataSource {
    fun loadData(): List<Ultraman> {
        return listOf<Ultraman>(
            Ultraman(R.string.ultraman_name_1, R.drawable.ultraman_1),
            Ultraman(R.string.ultraman_name_2, R.drawable.ultraman_2),
            Ultraman(R.string.ultraman_name_3, R.drawable.ultraman_3),
            Ultraman(R.string.ultraman_name_4, R.drawable.ultraman_4),
            Ultraman(R.string.ultraman_name_5, R.drawable.ultraman_5),
            Ultraman(R.string.ultraman_name_6, R.drawable.ultraman_6),
            Ultraman(R.string.ultraman_name_7, R.drawable.ultraman_7),
            Ultraman(R.string.ultraman_name_8, R.drawable.ultraman_8),
            Ultraman(R.string.ultraman_name_9, R.drawable.ultraman_9),
            Ultraman(R.string.ultraman_name_10, R.drawable.ultraman_10),
        )
    }
}