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
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R

val puppiSampleList = listOf<Puppi>(
    Puppi(
        1,
        R.drawable.cockapoo_nico,
        "Nico",
        3,
        PuppiGender.Male,
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam magna lorem, sodales quis consectetur in, rutrum ut lacus. Integer id lacinia leo. Donec blandit aliquet justo eu consequat."
    ),
    Puppi(
        2,
        R.drawable.golden_coco,
        "Coco",
        2,
        PuppiGender.Female,
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
    ),
    Puppi(
        3,
        R.drawable.golden_lexi,
        "Lexi",
        5,
        PuppiGender.Female,
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam magna lorem, sodales quis consectetur in, rutrum ut lacus. Integer id lacinia leo. "
    ),
    Puppi(
        4,
        R.drawable.husky_miloo,
        "Miloo",
        3,
        PuppiGender.Male,
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam magna lorem, sodales quis consectetur in, rutrum ut lacus."
    ),
)
