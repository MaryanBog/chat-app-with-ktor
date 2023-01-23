package com.myproj.chatappwithktor.data.remote.dto

import android.os.Parcelable
import com.myproj.chatappwithktor.domain.model.Message
import kotlinx.parcelize.Parcelize
import java.text.DateFormat
import java.util.Date

@Parcelize
data class MessageDto(
    val text: String,
    val timestamp: Long,
    val username: String,
    val id: String
): Parcelable{

    fun toMessage(): Message{
        val date = Date(timestamp)
        val formattedDate = DateFormat
            .getDateInstance(DateFormat.DEFAULT)
            .format(date)
        return Message(
            text = text,
            formattedTime = formattedDate,
            username = username
        )
    }
}