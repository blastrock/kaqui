package org.kaqui.model

enum class TestType {
    HIRAGANA_TO_ROMAJI,
    HIRAGANA_TO_ROMAJI_TEXT,
    ROMAJI_TO_HIRAGANA,

    KATAKANA_TO_ROMAJI,
    KATAKANA_TO_ROMAJI_TEXT,
    ROMAJI_TO_KATAKANA,

    KANJI_TO_READING,
    READING_TO_KANJI,
    KANJI_TO_MEANING,
    MEANING_TO_KANJI,

    WORD_TO_READING,
    READING_TO_WORD,
    WORD_TO_MEANING,
    MEANING_TO_WORD,

    KANJI_WRITING,

    KANJI_COMPOSITION,
}
