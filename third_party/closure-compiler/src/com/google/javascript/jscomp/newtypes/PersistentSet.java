/*
 * Copyright 2014 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.javascript.jscomp.newtypes;

import java.util.AbstractSet;

/** A persistent set with non-destructive additions and removals */
public abstract class PersistentSet<K> extends AbstractSet<K> {

  public abstract PersistentSet<K> with(K key);

  public abstract PersistentSet<K> without(K key);

  public static <K> PersistentSet<K> create() {
    return (PersistentSet<K>) EMPTY;
  }

  private static final PersistentSet EMPTY = NaivePersistentSet.create();
}
