package com.example.cookassistant.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RsData<T> {

    private String resultCode;
    private String msg;
    private T data;


    //최종 실행되는 of 메서드
    //response 패킷 body에 들어가는 항목들
    public static <T> RsData<T> of(String resultCode, String msg, T data) {
        return new RsData<>(resultCode, msg, data);
    }

    public static <T> RsData<T> of(String resultCode, String msg) {
        return of(resultCode, msg, null);
    }

    public static <T> RsData<T> successOf(T data) {
        return of("S-1", "성공", data);
    }

    public static <T> RsData<T> failOf(T data) {
        return of("F-1", "실패", data);
    }



    public boolean isSuccess() {
        return resultCode.startsWith("S-1");
    }

    public boolean isFail() {
        return isSuccess() == false;
    }


}
