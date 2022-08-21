package com.abing.ultraman.data

import com.abing.ultraman.R
import com.abing.ultraman.model.Ultraman

class DataSource {
    fun loadData(): List<Ultraman> {
        return listOf(
            Ultraman(R.string.ultraman_name_1, R.drawable.ultraman_1,R.string.ultraman_1_synopsis, R.string.ultraman_1_height, R.string.ultraman_1_weight, R.string.ultraman_1_special_move),
            Ultraman(R.string.ultraman_name_2, R.drawable.ultraman_2, R.string.ultraman_2_synopsis, R.string.ultraman_2_height, R.string.ultraman_2_weight, R.string.ultraman_2_special_move),
            Ultraman(R.string.ultraman_name_3, R.drawable.ultraman_3, R.string.ultraman_3_synopsis, R.string.ultraman_3_height, R.string.ultraman_3_weight, R.string.ultraman_3_special_move),
            Ultraman(R.string.ultraman_name_4, R.drawable.ultraman_4, R.string.ultraman_4_synopsis, R.string.ultraman_4_height, R.string.ultraman_4_weight, R.string.ultraman_4_special_move),
            Ultraman(R.string.ultraman_name_5, R.drawable.ultraman_5, R.string.ultraman_5_synopsis, R.string.ultraman_5_height, R.string.ultraman_5_weight, R.string.ultraman_5_special_move),
            Ultraman(R.string.ultraman_name_6, R.drawable.ultraman_6, R.string.ultraman_6_synopsis, R.string.ultraman_6_height, R.string.ultraman_6_weight, R.string.ultraman_6_special_move),
            Ultraman(R.string.ultraman_name_7, R.drawable.ultraman_7, R.string.ultraman_7_synopsis, R.string.ultraman_7_height, R.string.ultraman_7_weight, R.string.ultraman_7_special_move),
            Ultraman(R.string.ultraman_name_8, R.drawable.ultraman_8, R.string.ultraman_8_synopsis, R.string.ultraman_8_height, R.string.ultraman_8_weight, R.string.ultraman_8_special_move),
            Ultraman(R.string.ultraman_name_9, R.drawable.ultraman_9, R.string.ultraman_9_synopsis, R.string.ultraman_9_height, R.string.ultraman_9_weight, R.string.ultraman_9_special_move),
            Ultraman(R.string.ultraman_name_10, R.drawable.ultraman_10, R.string.ultraman_10_synopsis, R.string.ultraman_10_height, R.string.ultraman_10_weight, R.string.ultraman_10_special_move),
        )
    }
}