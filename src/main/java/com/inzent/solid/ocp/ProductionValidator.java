package com.inzent.solid.ocp;

//Open Close Principle - 개방 폐쇄 원칙
//        소프트웨어 요소는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다.

//        요구사항
//        일반 상품(N) 이름의 길이는 3글자 보다 길어야 합니다.
public class ProductionValidator {
    public void validateProduction(Production production) throws IllegalAccessException {
        if (production.getNameLength() < 3) {
            throw new IllegalAccessException("일반 상품의 이름은 3글자보다 길어야 합니다.");
        } else if (production.getOption().equals("E")) {
            if (production.getNameLength() < 10) {
                throw new IllegalArgumentException("전자티켓 상품의 이름은 10글자보다 길어야 합니다.");
            }
        } else if (production.getOption().equals("L")) {
            if (production.getNameLength() < 20) {
                throw new IllegalArgumentException("지역 상품의 이름은 20글자보다 길어야 합니다.");
            }
        }

    }
}
//        추가 요구사항
//
//        전자 티켓(E) 이름의 길이는 10글자 보다 길어야 합니다.
//        지역 상품(L) 이름의 길이는 20글자보다 길어야 합니다.
