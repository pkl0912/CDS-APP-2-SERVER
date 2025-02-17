package org.sopt.cdsserver.common.exception.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorType {
    PRODUCT_NOT_FOUND_EXCEPTION(HttpStatus.NOT_FOUND, "해당 상품을 찾을 수 없습니다."),
    MEMBER_NOT_FOUND_EXCEPTION(HttpStatus.NOT_FOUND, "해당 멤버를 찾을 수 없습니다"),

    PRODUCT_NOT_IN_CATEGORY_EXCEPTION(HttpStatus.NOT_FOUND, "카테고리에 해당하는 상품이 없습니다."),
    CATEGORY_NOT_FOUND_EXCEPTION(HttpStatus.NOT_FOUND, "카테고리를 찾을 수 없습니다."),

    INTERNAL_SERVER_EXCEPTION(HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부 오류입니다.");
    private final HttpStatus httpStatus;
    private final String message;
}
