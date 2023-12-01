package umc.spring1.apiPayload.code.status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import umc.spring1.apiPayload.code.BaseCode;
import umc.spring1.apiPayload.code.ErrorReasonDTO;
import umc.spring1.apiPayload.code.ReasonDTO;

@Getter
@AllArgsConstructor
public enum SuccessStatus implements BaseCode{

    // 가장 일반적인 응답
    _OK(HttpStatus.OK, "2000", "OK");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

//    public String getCode() {
//        return "2000";
//    }
//
//    public ReasonDTO getMessage() {
//        return ReasonDTO.builder()
//                .message(message)
//                .code(code)
//                .isSuccess(false)
//                .httpStatus(httpStatus)
//                .build()
//                ;
//    }

    @Override
    public ReasonDTO getReason() {
        return ReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(false)
                .build();
    }

    @Override
    public ReasonDTO getReasonHttpStatus() {
        return ReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(false)
                .httpStatus(httpStatus)
                .build();
    }
}
