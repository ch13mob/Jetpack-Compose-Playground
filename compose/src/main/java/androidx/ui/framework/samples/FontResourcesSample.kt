/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.ui.framework.samples


import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.res.fontResource
import androidx.ui.res.loadFontResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontFamily
import androidx.ui.text.font.LoadedFontFamily


@Composable
fun FontResourcesFontFamily() {
    loadFontResource(
        FontFamily.Default,
        pendingFontFamily = FontFamily.Cursive,
        failedFontFamily = FontFamily.SansSerif
    ).resource.resource?.let {
        Text(
            text = "Hello, World",
            style = TextStyle(
                fontFamily = LoadedFontFamily(it)
            )
        )
    }
}


@Composable
fun FontResourcesTypeface() {
    loadFontResource(
        FontFamily.Default,
        pendingTypeface = fontResource(FontFamily.Cursive),
        failedTypeface = fontResource(FontFamily.SansSerif)
    ).resource.resource?.let {
        Text(
            text = "Hello, World",
            style = TextStyle(
                fontFamily = LoadedFontFamily(it)
            )
        )
    }
}
