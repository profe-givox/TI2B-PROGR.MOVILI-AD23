package com.example.unscramble.ui

import kotlinx.coroutines.flow.MutableStateFlow

// Game UI state
private val _uiState = MutableStateFlow(GameUiState())
data class GameUiState(
   val currentScrambledWord: String = ""   ,
   val currentWordCount: Int = 1,
   val score: Int = 0,
   val isGuessedWordWrong: Boolean = false,
   val isGameOver: Boolean = false
)
