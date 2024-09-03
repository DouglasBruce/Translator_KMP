package com.ragnarok.translator.translate.domain.translate

import com.ragnarok.translator.core.domain.language.Language

interface TranslateClient {
    suspend fun translate(
        fromLanguage: Language,
        fromText: String,
        toLanguage: Language,
    ): String
}