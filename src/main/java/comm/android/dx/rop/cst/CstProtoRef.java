/*
 * Copyright (C) 2017 The Android Open Source Project
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
package comm.android.dx.rop.cst;

import comm.android.dx.rop.type.Prototype;

/**
 * Prototype reference.
 */
public class CstProtoRef extends Constant {

    /** {@code non-null;} the prototype */
    private final Prototype prototype;

    public CstProtoRef(Prototype prototype) {
        this.prototype = prototype;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CstProtoRef)) {
            return false;
        }
        CstProtoRef otherCstProtoRef = (CstProtoRef) other;
        return getPrototype().equals(otherCstProtoRef.getPrototype());
    }

    @Override
    public int hashCode() {
        return prototype.hashCode();
    }

    /** {@inheritDoc} */
    @Override
    public boolean isCategory2() {
        return false;
    }

    /** {@inheritDoc} */
    @Override
    public String typeName() {
        return "proto";
    }

    /** {@inheritDoc} */
    @Override
    protected int compareTo0(Constant other) {
        CstProtoRef otherCstProtoRef = (CstProtoRef) other;
        return prototype.compareTo(otherCstProtoRef.getPrototype());
    }

    /** {@inheritDoc} */
    @Override
    public String toHuman() {
        return prototype.getDescriptor();
    }

    /** {@inheritDoc} */
    @Override
    public final String toString() {
        return typeName() + "{" + toHuman() + '}';
    }

    public Prototype getPrototype() {
        return prototype;
    }
}
