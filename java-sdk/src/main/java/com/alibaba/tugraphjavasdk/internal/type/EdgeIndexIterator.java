package com.alibaba.tugraphjavasdk.internal.type;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;

import com.alibaba.tugraphjavasdk.internal.Names;

@FFIGen(library = Names.LibraryName)
@FFITypeAlias(value = Names.EdgeIndexIterator)
@CXXHead(value = Names.HeaderName)
public interface EdgeIndexIterator extends FFIPointer {
}

