// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2016 Cookpad Inc.

package com.cookpad.android.plugin.license.exception

import com.cookpad.android.plugin.license.data.LibraryInfo

class NotEnoughInformationException(val libraryInfo: LibraryInfo) : RuntimeException()
