package com.egci428.ex_basicssqlite

/**
 * Created by 6272user on 10/18/2017 AD.
 */
class Comment {
    var id: Long = 0
    var commentdata: String? = null

    override fun toString(): String{
        return commentdata.toString()
    }
}