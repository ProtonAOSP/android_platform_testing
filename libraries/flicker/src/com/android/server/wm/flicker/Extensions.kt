/*
 * Copyright (C) 2020 The Android Open Source Project
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

@file:JvmName("Extensions")
package com.android.server.wm.flicker

import android.app.Instrumentation

internal const val FLICKER_TAG = "FLICKER"

fun getDefaultFlickerOutputDir(instrumentation: Instrumentation) =
        instrumentation.targetContext.getExternalFilesDir(null)?.toPath()
                ?: error(IllegalArgumentException("External directory path should not be null"))
