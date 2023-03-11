package com.practice.exceptions;

import com.practice.exceptions.runtime.NotFoundException;

public class DefinedExceptions {
    public static NotFoundException notFoundException = new NotFoundException("리소스를 찾을 수 없습니다.");
}
