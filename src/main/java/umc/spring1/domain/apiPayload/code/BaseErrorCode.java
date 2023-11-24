package umc.spring1.domain.apiPayload.code;

public interface BaseErrorCode {

    public ErrorReason getReason();

    public ErrorReason getReasonHttpStatus();
}