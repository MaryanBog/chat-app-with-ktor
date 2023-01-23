package com.myproj.chatappwithktor.presentation.chat

import com.myproj.chatappwithktor.domain.model.Message

data class ChatState(
    val message: List<Message> = emptyList(),
    val isLoading: Boolean = false
)
