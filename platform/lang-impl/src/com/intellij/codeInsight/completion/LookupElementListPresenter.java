// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.codeInsight.completion;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupFocusDegree;
import com.intellij.codeInsight.lookup.impl.LookupImpl;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author yole
 */
public interface LookupElementListPresenter {
  @NotNull
  String getAdditionalPrefix();

  @Nullable
  LookupElement getCurrentItem();

  @Nullable
  LookupElement getCurrentItemOrEmpty();

  boolean isSelectionTouched();

  int getSelectedIndex();

  int getLastVisibleIndex();

  /**
   * @deprecated Use {@link #getLookupFocusDegree()}
   */
  @Deprecated
  @ApiStatus.ScheduledForRemoval(inVersion = "2020.3")
  LookupImpl.FocusDegree getFocusDegree();

  @NotNull
  LookupFocusDegree getLookupFocusDegree();

  boolean isShown();
}
