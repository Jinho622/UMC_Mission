package umc.spring1.apiPayload.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import umc.spring1.apiPayload.code.BaseErrorCode;
import umc.spring1.apiPayload.code.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {

    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason() {
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus(){
        return this.code.getReasonHttpStatus();
    }
}
