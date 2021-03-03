/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

val primaryDarkTheme = Color(0xFFFFC947)
val primaryLightTheme = Color(0XFFFF9800)
val primaryVariant = Color(0XFFC66900)
val secondary = Color(0xFF8D6E63)
val textOnPrimary = Color(0xFF000000)
val textOnSecondary = Color(0xFFFFFFFF)

val Colors.cardBackground: Color
    get() = if (isLight) Color(0xFFF6F6F6) else textOnPrimary
