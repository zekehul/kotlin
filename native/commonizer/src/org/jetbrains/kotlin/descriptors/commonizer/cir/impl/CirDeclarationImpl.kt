/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.descriptors.commonizer.cir.impl

import org.jetbrains.kotlin.descriptors.commonizer.cir.CirDeclaration

@Suppress("unused", "NOTHING_TO_INLINE")
internal inline fun CirDeclaration.unsupported(): Nothing = error("This method should never be called on ${this::class.java}, $this")
